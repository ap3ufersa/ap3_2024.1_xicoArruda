package br.com.xico.aula5.empresa;

import java.util.Scanner;

public class TestaFuncionario {

    public static void main(String[] args) {
        Scanner entradaPadrao = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do funcionario:");
            String nomeFuncionario = entradaPadrao.next();
            System.out.println("Digite o salário bruto do funcionario:");
            double salarioBruto = entradaPadrao.nextDouble();

            Funcionario func1 = new Funcionario(nomeFuncionario, Cargo.FUNCIONARIO, salarioBruto);

            System.out.println(func1);
        }

        entradaPadrao.close();
    }

}
