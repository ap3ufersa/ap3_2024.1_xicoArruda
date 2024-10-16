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