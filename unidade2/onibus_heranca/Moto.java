public class Moto extends Veiculo {

    int quantCilindradas;

    public Moto(String placa, int quantPessoas, int quantCilindradas) {
        super(placa, quantPessoas);
        this.quantCilindradas = quantCilindradas;
    }

    public void acelerarDeZeroACem() {
        System.out.println("Moto = 2 segundos!");
    }

    public int getQuantCilindradas() {
        return quantCilindradas;
    }

    public void setQuantCilindradas(int quantCilindradas) {
        this.quantCilindradas = quantCilindradas;
    }

    @Override
    public String toString() {
        return "Moto [quantCilindradas=" + quantCilindradas + "]";
    }

}
