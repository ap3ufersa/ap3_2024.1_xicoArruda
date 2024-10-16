public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        int quantOperacoes = 999999;
		
        // Criar e executar threads de adição
        for (int i = 1; i <= quantOperacoes; i++) {
            Livro oLivro = new Livro("Livro " + i, "Autor " + i);
            System.out.println("Adicionando livro:" + oLivro);
            new AdicionarLivroThread(biblioteca, oLivro).start();
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