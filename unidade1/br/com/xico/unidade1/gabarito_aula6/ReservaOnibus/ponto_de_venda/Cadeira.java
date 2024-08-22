package ponto_de_venda;

public class Cadeira {
    private int numero;
    private boolean ocupada;

    public Cadeira(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String getOcupada() {
        return ocupada ? "Ocupada" : "Livre";
    }

    public String getNumeroFormatado() {
        return String.format("%02d", numero);
    }

    @Override
    public String toString() {
        return "Cadeira " + getNumeroFormatado() + "->" + getOcupada();
    }
}
