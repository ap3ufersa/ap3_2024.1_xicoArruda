## Aula 3 - 26/07/2024 - Controle de versão, tipos primitivos e classes

### Teoria da aula anterior

Gabarito [aqui](https://github.com/ap3ufersa/ap3_2024.1_xicoArruda/blob/main/unidade1/br/com/xico/unidade1/gabarito_aula2/TiposPrimitivos.java).

1. Considerações sobre tipos primitivos:

- Tipos Primitivos: tipos de dados básicos fornecidos pela linguagem Java para armazenar valores simples. São armazenados diretamente na memória (_stack_) e têm um tamanho fixo. Não são objetos, portanto, não possuem métodos associados. Ascomparações são feitas com operadores ==,<, >. Os limites [são esses](tiposPrimitivos.png).

- Classes (String, Integer): Em Java, classes são "moldes" para objetos. Um objeto é uma instância de uma classe. As variáveis que são instâncias de classes são referências aos objetos armazenados na memória (_heap_). Classes podem ter métodos e atributos associados. Usa-se o método .equals(). Usar == compara referências de memória.

- String é uma classe _muito_ especial usada para representar [sequências de caracteres](stringEmJava.png)

### Exercícios

Faça os exercícios a seguir. Não esqueça de ajustar o _package_ conforme visto na sala.

1. Programação Estruturada - Cálculo de Média: Crie um programa em Java que calcule a média de três notas utilizando programação estruturada. Não use classes e objetos para isso, apenas métodos estáticos.

2. Programação O.O. - Aluno com Cálculo de Média: Crie uma classe "Aluno" que tenha os atributos nome e três notas. Implemente métodos para calcular a média das notas e para verificar se o aluno foi aprovado (média maior ou igual a 7.0). Implemente métodos para exibir o nome do aluno em letras maiúsculas e minúsculas. Crie uma classe TestaAluno para instanciar um aluno e exibir suas informações, incluindo a média e o status de aprovação.

Gabarito [aqui](https://github.com/ap3ufersa/ap3_2024.1_xicoArruda/tree/main/unidade1/br/com/xico/unidade1/gabarito_aula3).
