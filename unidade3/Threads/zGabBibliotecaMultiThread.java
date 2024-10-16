
// Arquivo: AdicionarLivroThread.java

public class AdicionarLivroThread extends Thread {
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

// Arquivo: Biblioteca.java

class Biblioteca {
    private final int capacidade = 200;
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
                livros[i] = livros[--contadorLivros]; // Remove e substitui pelo último
                return;
            }
        }
        throw new LivroNaoEncontradoException(titulo);
    }
}

// Arquivo: Livro.java

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
        return "Livro [titulo=" + titulo + ", autor=" + autor + "]";
    }

}

// Arquivo: LivroNaoEncontradoException.java

class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException(String nomeLivro) {
        super("Livro" + nomeLivro + " não encontrado!");
    }
}

// Arquivo: MainBiblioteca.java

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        int quantOperacoes = 999999;
		
        // Criar e executar threads de adição
        for (int i = 1; i <= quantOperacoes; i++) {
            Livro livro = new Livro("Livro " + i, "Autor " + i);
            System.out.println("Adicionando livro:" + livro);
            new AdicionarLivroThread(biblioteca, livro).start();
        }

        // Criar e executar threads de remoção
        for (int i = 1; i <= quantOperacoes; i++) {
            String titulo = "Livro " + i;
            System.out.println("Removendo livro:" + titulo);
            new RemoverLivroThread(biblioteca, titulo).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Erro ao aguardar as threads: " + e.getMessage());
        }
    }
}

// Arquivo: RemoverLivroThread.java

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
