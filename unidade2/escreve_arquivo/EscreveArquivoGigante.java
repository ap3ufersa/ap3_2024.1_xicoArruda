//SuperHeroi batman = new CapaDeInvisibilidade(new CapaDeVoo(new CapaDeForca(batman)));

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class EscreveArquivoGigante {
    public static void main(String[] args) {
        String nomeDoArquivo = "pessoas.csv";

        String[] nomes = { "Homem de Ferro", "Thor", "Hulk", "Viúva Negra", "Capitão América", "Homem-Aranha" };
        String[] sobrenomes = { "da Silva", "Sousa", "Matos", "Santos", "Moraes", "Almeida", "Oliveira", "Martins" };

        Random random = new Random();
        boolean append = false;

        try {
            BufferedWriter arquivoCSV = new BufferedWriter(new FileWriter(nomeDoArquivo, append));
            for (long controle = 1; controle <= 9874981981L; controle++) {
                long idPessoa = controle;
                String umNome = nomes[random.nextInt(nomes.length)];
                String umSobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
                double salario = 1500 + (15000 - 1500) * random.nextDouble();

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