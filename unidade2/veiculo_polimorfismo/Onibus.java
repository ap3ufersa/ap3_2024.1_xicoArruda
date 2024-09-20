public class Onibus extends Veiculo {

    private String nomeEmpresa;

    public Onibus(String placa, int quantPessoas, String nomeEmpresa) {
        super(placa, quantPessoas);
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void acelerarDeZeroACem() {
        System.out.println("Onibus = bem devagarinho");
    }

    @Override
    public String toString() {
        return "Onibus [nomeEmpresa=" + nomeEmpresa + "]";
    }

}