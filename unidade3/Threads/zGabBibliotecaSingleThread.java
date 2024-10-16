
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
		
        // Adicionando livros
        for (int i = 1; i <= quantOperacoes; i++) {
            Livro livro = new Livro("Livro " + i, "Autor " + i);
            biblioteca.adicionar(livro);
        }

        // Removendo livros
        for (int i = 1; i <= quantOperacoes; i++) {
            String titulo = "Livro " + i;
            try {
                biblioteca.remover(titulo);
            } catch (LivroNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

