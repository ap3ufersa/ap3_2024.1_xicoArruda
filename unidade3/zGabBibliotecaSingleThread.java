class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException(String nomeLivro) {
        super("Livro " + nomeLivro + " não encontrado!");
    }
}

class Biblioteca {
    private final int capacidade = 15;
    private final Livro[] livros = new Livro[capacidade];
    private int contadorLivros = 0;

    public void adicionar(Livro livro) {
        if (contadorLivros < capacidade) {
            livros[contadorLivros++] = livro;
            System.out.println("Adicionado: " + livro);
        } else {
            System.out.println("Biblioteca cheia. Não foi possível adicionar: " + livro);
        }
    }

    public void remover(String titulo) throws LivroNaoEncontradoException {
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

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        for (int i = 1; i <= 10000; i++) {
            Livro livro = new Livro("Livro " + i, "Autor " + i);
            biblioteca.adicionar(livro);
        }

        // Removendo livros
        for (int i = 1; i <= 10000; i++) {
            String titulo = "Livro " + i;
            try {
                biblioteca.remover(titulo);
            } catch (LivroNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
