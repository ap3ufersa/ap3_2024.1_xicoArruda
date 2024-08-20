package br.com.xico.unidade1.gabarito_aula6.ReservaOnibus.ponto_de_venda;

import java.time.LocalDateTime;

public class Reserva {
    private String nomePassageiro;
    private Cadeira cadeira;
    private LocalDateTime horario;

    public Reserva(String nomePassageiro, Cadeira cadeira, LocalDateTime horario) {
        this.nomePassageiro = nomePassageiro;
        this.cadeira = cadeira;
        this.horario = horario;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public Cadeira getCadeira() {
        return cadeira;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Reserva{nomePassageiro='" + nomePassageiro + "', cadeira=" + cadeira + ", horario=" + horario + "}";
    }
}
