package unidade1.gabarito_aula3;

public class TestaAluno {
    public static void main(String[] args) {

        Aluno xico = new Aluno();
        xico.setNomeDoAluno("Xico Arruda");
        xico.setNota1(10);
        xico.setNota2(0);
        xico.setNota3(5);
        System.out.println();
        System.out.println(xico);
        System.out.println(xico.getNomeEmMaiusculo());
        System.out.println(xico.getNomeEmMinusculo());

        if (xico.aprovadoMedia())
            System.out.println("Passou por media");
        else
            System.out.println("Se fudeu, tirou " + xico.ge);
    }
}
