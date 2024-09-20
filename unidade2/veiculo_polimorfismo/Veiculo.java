public abstract class Veiculo {

    private String placa;
    private int quantPessoas;

    public Veiculo(String placa, int quantPessoas) {
        this.placa = placa;
        this.quantPessoas = quantPessoas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    
    public abstract void acelerarDeZeroACem();

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", quantPessoas=" + quantPessoas + "]";
    }

}
