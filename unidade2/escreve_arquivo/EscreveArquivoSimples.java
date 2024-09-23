//SuperHeroi batman = new CapaDeInvisibilidade(new CapaDeVoo(new CapaDeForca(batman)));

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivoSimples {
    public static void main(String[] args) {
        String nomeDoArquivo = "pessoas.csv";
        long idPessoa = 1L;
        String nome = "Homem de Ferro";
        String sobrenome = "da Silva";
        double salario = 5152.00;
        boolean append = false;

        try {
            BufferedWriter arquivoCSV = new BufferedWriter(new FileWriter(nomeDoArquivo, append));
            Pessoa pessoa = new Pessoa(idPessoa, nome, sobrenome, salario);
            arquivoCSV.write(pessoa.toString());
            arquivoCSV.newLine();
            arquivoCSV.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nAcabou!");
    }
}
