// Livro.java
public class Livro {
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
        return "gerar";
    }
}

// LivroNaoEncontradoException.java
public class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException(String tituloDoLivro) {
        super("Oooops, livro " + tituloDoLivro + " não encontrado!");
    }
}

// Biblioteca.java
public class Biblioteca {
    private int capacidade = 15;
    private Livro[] osLivros = new Livro[capacidade];
    private int contador = 0;

    public void adicionar(Livro livro) {
        if (contador < capacidade) {
            osLivros[contador] = livro;
            contador++;
            System.out.println("Livro adicionado: " + livro.getTitulo());
        } else { //deveria ser outra exception...
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais livros.");
        }
    }

    public void remover(String tituloDoLivro) throws LivroNaoEncontradoException {
        for (int i = 0; i < contador; i++) {
            if (osLivros[i].getTitulo().equals(tituloDoLivro)) {
                osLivros[i] = osLivros[contador - 1];
                osLivros[contador - 1] = null; //perigoso...
                contador--;
                System.out.println("Livro removido: " + tituloDoLivro);
                return;
            }
        }
        throw new LivroNaoEncontradoException(tituloDoLivro);
    }
}

// MainBiblioteca.java
public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "Tolkien");
        Livro livro2 = new Livro("Harry Potter", "Rowling");
        Livro livro3 = new Livro("A Guerra dos Tronos", "Martin");

        try {
            System.out.println("Adicionando...");
            biblioteca.adicionar(livro1);
            biblioteca.adicionar(livro2);
            biblioteca.adicionar(livro3);
            System.out.println("3 livros adicionados.");

            System.out.println("Removendo...");
            biblioteca.remover("Dom Casmurro");
            System.out.println("1 livro removido.");
        } catch (LivroNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
