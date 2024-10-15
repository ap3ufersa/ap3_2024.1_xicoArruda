class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException(String message) {
        super(message);
    }
}

class Biblioteca {
    private final int capacidade = 50;
    private final Livro[] livros = new Livro[capacidade];
    private int contadorLivros = 0;

    public synchronized void adicionar(Livro livro) {
        if (contadorLivros < capacidade) {
            livros[contadorLivros++] = livro;
            System.out.println("Adicionado: " + livro);
        } else {
            System.out.println("Biblioteca cheia. Não foi possível adicionar: " + livro);
        }
    }

    public synchronized void remover(String titulo) throws LivroNaoEncontradoException {
        for (int i = 0; i < contadorLivros; i++) {
            if (livros[i].getTitulo().equals(titulo)) {
                System.out.println("Removido: " + livros[i]);
                livros[i] = livros[--contadorLivros];
                return;
            }
        }
        throw new LivroNaoEncontradoException("Livro não encontrado: " + titulo);
    }
}

class AdicionarLivroThread extends Thread {
    private final Biblioteca biblioteca;
    private final Livro livro;

    public AdicionarLivroThread(Biblioteca biblioteca, Livro livro) {
        this.biblioteca = biblioteca;
        this.livro = livro;
    }

    @Override
    public void run() {
        biblioteca.adicionar(livro);
    }
}

class RemoverLivroThread extends Thread {
    private final Biblioteca biblioteca;
    private final String titulo;

    public RemoverLivroThread(Biblioteca biblioteca, String titulo) {
        this.biblioteca = biblioteca;
        this.titulo = titulo;
    }

    @Override
    public void run() {
        try {
            biblioteca.remover(titulo);
        } catch (LivroNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criar e executar threads de adição
        for (int i = 1; i <= 10000; i++) {
            Livro livro = new Livro("Livro " + i, "Autor " + i);
            new AdicionarLivroThread(biblioteca, livro).start();
        }

        // Criar e executar threads de remoção
        for (int i = 1; i <= 10000; i++) {
            String titulo = "Livro " + i;
            new RemoverLivroThread(biblioteca, titulo).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Erro ao aguardar as threads: " + e.getMessage());
        }
    }
}
