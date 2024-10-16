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
