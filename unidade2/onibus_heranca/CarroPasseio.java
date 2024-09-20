public class CarroPasseio extends Veiculo {

    public NUM_PORTAS numPortas;

    public CarroPasseio(String placa, int quantPessoas, NUM_PORTAS numPortas) {
        super(placa, quantPessoas);
        this.numPortas = numPortas;
    }

    public void acelerarDeZeroACem() {
        System.out.println("CarroPasseio = 10 segundos");
    }

    public NUM_PORTAS getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(NUM_PORTAS numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return "CarroPasseio [numPortas=" + numPortas + "]";
    }
}
