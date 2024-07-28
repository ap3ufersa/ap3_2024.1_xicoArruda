# Aula 3 - 26/07/2024

### Teoria da aula anterior

Veja no [gabarito](https://github.com/ap3ufersa/ap3_2024.1_xicoArruda/blob/main/unidade1/gabarito_aula2/br/com/xico/aula2/TiposPrimitivos.java).

1. Considerações sobre tipos primitivos:

- Tipos Primitivos: tipos de dados básicos fornecidos pela linguagem Java para armazenar valores simples. São armazenados diretamente na memória (stack) e têm um tamanho fixo. Não são objetos, portanto, não possuem métodos associados. Ascomparações são feitas com operadores ==,<, >. Os limites [são esses](tiposPrimitivos.png).

- Classes (String, Integer): Em Java, classes são "moldes" para objetos. Um objeto é uma instância de uma classe. As variáveis que são instâncias de classes são referências aos objetos armazenados na memória (heap). Classes podem ter métodos e atributos associados. Usa-se o método .equals(). Usar == compara referências de memória.

- String é uma classe _muito_ especial usada para representar [sequências de caracteres](stringEmJava.png)

2. Limites do _int_: Crie um programa que descubra o valor máximo e mínimo que um int pode armazenar em Java. Utilize as constantes Integer.MAX_VALUE e Integer.MIN_VALUE para isso. Faça com que ocorra um estouro nesse tamanho máximo.

### Exercícios

Faça os exercícios a seguir, em todas as classes coloque o seu código secreto (ou matrícula) no comentário que compõe o cabeçalho da classe. Ele foi enviado para seu e-mail institucional. Também não esqueça de ajustar o _fully qualified name_ conforme visto na sala.

1. Programação Estruturada - Cálculo de Média: Crie um programa em Java que calcule a média de três notas utilizando programação estruturada. Não use classes e objetos para isso, apenas métodos estáticos.

2. Programação O.O. - Aluno com Cálculo de Média: Crie uma classe "Aluno" que tenha os atributos nome e três notas. Implemente métodos para calcular a média das notas e para verificar se o aluno foi aprovado (média maior ou igual a 7.0). Crie uma classe TestaAlunoOO para instanciar um aluno e exibir suas informações, incluindo a média e o status de aprovação.
