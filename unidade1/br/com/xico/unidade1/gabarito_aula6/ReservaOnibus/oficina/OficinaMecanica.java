package br.com.xico.unidade1.gabarito_aula6.ReservaOnibus.oficina;

import java.time.LocalDateTime;

import ponto_de_venda.Onibus;

public class OficinaMecanica {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("Guanabara ON01", 10);

        System.out.println("");
        System.out.println("Reservas:");

        onibus.fazerReserva("Passageiro da Oficina", 1, LocalDateTime.now());
    }
}
