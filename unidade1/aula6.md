## Aula 6 - 23/08/2024 - Esteira de build, detalhes JDK, composição Aluno+Disciplina

### Correção do exercício 1

Correção do exercício 1, teoria da aula anterior, programa de reservas de cadeiras em ônibus.

### Exercícios

(1,0) Faça o exercicio que está no seu repositório.

### Exercício resolvido

Diagrama de Classes do programa de Reservas de Cadeiras em ônibus para www.mermaid.live
```
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
```

