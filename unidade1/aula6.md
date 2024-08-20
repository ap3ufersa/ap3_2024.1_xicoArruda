## Aula 6 - 23/08/2024 - Esteira de build, detalhes JDK, composição Aluno+Disciplina

### Correção do exercício 1

Correção do exercício 1, teoria da aula anterior.

### Exercícios

Faça os exercícios a seguir. Não esqueça de ajustar o _package_ conforme visto na sala.

1. Composição e remodelagem da classe Aluno.

Gabarito [aqui](#).

Diagrama de Classes para www.mermaid.live

## Aula 6 - 23/08/2024 - Esteira de build, detalhes JDK, composição Aluno+Disciplina

### Correção do exercício 1

Correção do exercício 1, teoria da aula anterior.

### Exercícios

Faça os exercícios a seguir. Não esqueça de ajustar o _package_ conforme visto na sala.

1. Composição e remodelagem da classe Aluno.

Gabarito [aqui](#).

Diagrama de Classes para www.mermaid.live

classDiagram
    class Onibus {
        - prefixoOnibus: String
        - cadeiras: List<Cadeira>
        - reservas: List<Reserva>
        + Onibus(prefixoOnibus: String, quantCadeiras: int)
        # fazerReserva(cliente: String, numeroCadeira: int, horario: LocalDateTime): boolean
        # listarReservas(): void
        + listarCadeiras(): void
    }

    class Reserva {
        - cliente: String
        - cadeira: Cadeira
        - horario: LocalDateTime
    }
    
    class Cadeira {
        - numero: int
        - ocupada: boolean
    }
    
    class OficinaOnibus {
        + main(args: String[]): void
    }

    class PrincipalReservaOnibus {
        + main(args: String[]): void
    }

    Onibus "1" -- "0..*" Cadeira : contem
    Onibus "1" -- "0..*" Reserva : gerencia
    Reserva "1" -- "1" Cadeira : refere-se a 
    OficinaOnibus "1" -- "1" Onibus : usa?
    PrincipalReservaOnibus "1" -- "1" Onibus : usa

