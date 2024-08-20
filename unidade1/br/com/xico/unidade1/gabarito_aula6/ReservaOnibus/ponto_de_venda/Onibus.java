package br.com.xico.unidade1.gabarito_aula6.ReservaOnibus.ponto_de_venda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Onibus {
    private String prefixoOnibus;
    private List<Cadeira> cadeiras;
    private List<Reserva> reservas;

    public Onibus(String prefixoOnibus, int quantCadeiras) {
        this.cadeiras = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.prefixoOnibus = prefixoOnibus;

        if (quantCadeiras > 0) {
            for (int i = 1; i <= quantCadeiras; i++) {
                Cadeira cadeira = new Cadeira(i);
                if (cadeira.getNumero() != 0) {
                    cadeiras.add(cadeira);
                }
            }
        }
    }

    public String getNomeEmpresa() {
        return prefixoOnibus;
    }

    protected boolean fazerReserva(String cliente, int numeroCadeira, LocalDateTime horario) {
        if (numeroCadeira < 1 || numeroCadeira > cadeiras.size()) {
            System.err.println(
                    "Erro: Cadeira " + numeroCadeira + " inválida. Escolha entre 1 e " + cadeiras.size() + ".");
            return false;
        }

        for (Cadeira cadeira : cadeiras) {
            if (cadeira.getNumero() == numeroCadeira) {
                if (cadeira.isOcupada()) {
                    System.err.println("Erro: Cadeira " + numeroCadeira + " ocupada.");
                    return false;
                }
                cadeira.setOcupada(true);
                reservas.add(new Reserva(cliente, cadeira, horario));
                return true;
            }
        }
        System.err.println("Erro: Cadeira " + numeroCadeira + " não encontrada.");
        return false;
    }

    protected void listarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public void listarCadeiras() {
        for (Cadeira cadeira : cadeiras) {
            System.out.println(cadeira);
        }
    }
}
