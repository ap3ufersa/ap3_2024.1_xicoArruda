import java.util.LinkedList;
import java.util.List;

public class MainDeZeroACem {

    public static void main(String[] args) {
        Veiculo caleica = new Moto("sdasd", 8, 1000);
        Veiculo mingau = new CarroPasseio("sdasd", 1, NUM_PORTAS.TRES_PORTAS);
        Veiculo valeDuAcu = new Onibus("adas", 999, "Vale do Acu");

        List<Veiculo> frota = new LinkedList();
        frota.add(caleica);
        frota.add(mingau);
        frota.add(valeDuAcu);

        System.out.println();
        System.out.println();
        for (Veiculo veiculo : frota) {
            veiculo.acelerarDeZeroACem();
        }

    }
}
