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