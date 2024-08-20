package br.com.xico.unidade1.gabarito_aula6.ReservaOnibus.ponto_de_venda;

import java.time.LocalDateTime;

public class PrincipalReservaOnibus {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("Guanabara ON01", 10);

        System.out.println("");
        onibus.fazerReserva("Primeiro Passageiro", 1, LocalDateTime.now());
        onibus.fazerReserva("Segundo Passageiro", 2, LocalDateTime.now().plusHours(2));
        onibus.fazerReserva("Passageiro Sem Cadeira", 11, LocalDateTime.now().plusHours(3));
        onibus.fazerReserva("Passageiro No Colo", 1, LocalDateTime.now().plusHours(4));

        System.out.println("");
        System.out.println("Reservas:");
        onibus.listarReservas();

        System.out.println("");
        System.out.println("Cadeiras:");
        onibus.listarCadeiras();
    }
}
