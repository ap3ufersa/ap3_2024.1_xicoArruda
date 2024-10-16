class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException(String nomeLivro) {
        super("Livro" + nomeLivro + " não encontrado!");
    }
}