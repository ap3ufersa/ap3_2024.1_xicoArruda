### Unidade 2 - Exercício 2 - Com nota em 13/09/2024 até as 22:20:00h

#### 0. (2,0) Veículos Polimórficos e Abstratos

Crie um programa em Java para gerenciar uma empresa de veículos. Crie a classe Veículo, abstrata, com a placa e quantidade de pessoas. Há um método abstrato para acelerarDeZeroACem. Um ônibus é um veículo e possui o nome da empresa que opera a linha e vai de zero a cem km/h bem devagar. Um carro de passeio tem como atributo extra que é o número de portas (enum de 2, 3, 4, 5), e vai de zero a cem em 10 segundos. Uma moto é um veículo que tem uma quantidade de cilindradas e vai de zero a cem em 2 segundos. Faça uma classe separada, com método ```main```, para testar o programa, usando todas as classes, de forma polimórfica e de forma não polimórfica. Exiba os veículos criados e acelere todos de zero a cem. Ao final, faça _commit_ e _push_ para o seu repositório no GitHub da disciplina. Veja detalhes no diagrama de classes.

```mermaid
classDiagram
    note for Veiculo "public abstract class Veiculo{...}"
    namespace veiculo_polimorfismo {
        class Veiculo {
            - placa: String
            - quantPassageiros: int
            + Veiculo(placa: String, quantPassageiros: int)
            + acelerarDeZeroACem(): double // abstract
            // getters, setters, toString()
        }

        class Onibus {
            - nomeCompanhia: String
            + Onibus(placa: String, quantPassageiros: int, nomeCompanhia: String)
            + acelerarDeZeroACem(): double //120 segundos
            // getters, setters, toString()
        }

        class CarroPasseio {
            - modelo: String
            + CarroPasseio(placa: String, quantPassageiros: int, MODELO)
            + acelerarDeZeroACem(): double //10 segundos
            // getters, setters, toString()
        }

        class Moto {
            - cilindradas: int
            + Moto(placa: String, quantPassageiros: int, cilindradas: int)
            + acelerarDeZeroACem(): double //2 segundos
            // getters, setters, toString()
        }
        class Modelo {
        <<enumeration>>
            SEDAN
            HATCH
            SUV
            COUPE
        }
    }
    class MainVeiculo {
        + main(args: String[]): void
    }

    Veiculo <|-- Onibus : é_um
    Veiculo <|-- CarroPasseio : é_um
    CarroPasseio -- Modelo : classificado_em
    Veiculo <|-- Moto : é_um
    MainVeiculo "1" --> "many" Veiculo : usa
```

Pedaço do código da classe MainOnibus:

```java
package veiculo_polimorfismo;

public class MainVeiculo {

    public static void main(String[] args) {
        comPolimorfismo();
        semPolimorfismo();
    }

    public static void comPolimorfismo() {
        Veiculo umVeiculo = new Veiculo(...);
        Veiculo umCarro = new CarroPasseio(...);
        Veiculo umOnibus = new Onibus(...);
        Veiculo umaMoto = new Moto(...);

        umCarro.acelerarDeZeroACem();
        umOnibus.acelerarDeZeroACem();
        umaMoto.acelerarDeZeroACem();
    }

    public static void semPolimorfismo() {
        Veiculo umVeiculo = new Veiculo(...);
        CarroPasseio umCarro = new CarroPasseio(...);
        Onibus umOnibus = new Onibus(...);
        Moto umaMoto = new Moto(...);

        umCarro.acelerarDeZeroACem();
        umOnibus.acelerarDeZeroACem();
        umaMoto.acelerarDeZeroACem();
    }
}

```
