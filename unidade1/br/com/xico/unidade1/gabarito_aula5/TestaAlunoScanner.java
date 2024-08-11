package br.com.xico.unidade1.gabarito_aula5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.xico.unidade1.gabarito_aula4.Aluno;

public class TestaAlunoScanner {

    public static void main(String[] args) {
        Aluno umAluno = new Aluno();
        Scanner teclado = new Scanner(System.in);
        System.out.println();

        System.out.println("Digite o nome do aluno:");
        String nomeDoAluno = teclado.nextLine();
        System.out.println("Digite a nota 1:");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = teclado.nextDouble();
        System.out.println("Digite o nome da Maezinha:");
        String nomeDaMae = teclado.next();

        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite a data de nascimento (formato dd/MM/yyyy): ");
        String dataNascimentoString = teclado.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, padrao);

        umAluno.setNomeCompleto(nomeDoAluno);
        umAluno.setNota1(nota1);
        umAluno.setNota1(nota2);
        umAluno.setNota1(nota3);
        umAluno.setNomeDaMae(nomeDaMae);
        umAluno.setDataNascimento(dataNascimento);
        System.out.println(umAluno);
        teclado.close();

    }
}
