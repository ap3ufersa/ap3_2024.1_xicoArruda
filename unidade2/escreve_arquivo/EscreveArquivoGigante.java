//SuperHeroi batman = new CapaDeInvisibilidade(new CapaDeVoo(new CapaDeForca(batman)));

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class EscreveArquivoGigante {
    public static void main(String[] args) {
        String nomeDoArquivo = "pessoas.csv";

        String[] nomes = { "Um", "Dois"};
        String[] sobrenomes = { "da Silva" };
		
        Random random = new Random();
        boolean append = false;

        try {
            BufferedWriter arquivoCSV = new BufferedWriter(new FileWriter(nomeDoArquivo, append));
            for (int controle = 1; controle <= ?; controle++) {
                long idPessoa = controle;
                String umNome =?
                String umSobrenome =?
                double salario =?

                Pessoa pessoa = new Pessoa(idPessoa, umNome, umSobrenome, salario);
                arquivoCSV.write(pessoa.toString());
                arquivoCSV.newLine();

                if (controle % 1000 == 0) {
                    System.out.println("Progresso: " + controle + " nomes escritos.");
                }
            }
            arquivoCSV.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nAcabou!");
    }
}