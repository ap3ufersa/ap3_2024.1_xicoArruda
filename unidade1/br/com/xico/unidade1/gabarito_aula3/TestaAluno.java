package br.com.xico.unidade1.gabarito_aula3;

public class TestaAluno {
    public static void main(String[] args) {

        Aluno xico = new Aluno();
        xico.setNome("Xico Arruda");
        xico.setNota1(10);
        xico.setNota2(7);
        xico.setNota3(5);
        System.out.println();
        System.out.println(xico);

        if (xico.aprovadoMedia())
            System.out.println("Passou por média!");
        else
            System.out.println("Ixe, reprovou pq tirou " + xico.getMedia());
    }
}
