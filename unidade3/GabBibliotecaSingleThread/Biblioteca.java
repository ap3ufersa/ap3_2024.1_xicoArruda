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