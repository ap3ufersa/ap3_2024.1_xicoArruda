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