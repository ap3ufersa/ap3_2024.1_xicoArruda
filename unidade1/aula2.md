# Aula 2 - 19/07/2024

### Exercícios

Faça os exercícios a seguir, em todas as classes coloque o seu código secreto (ou mátricula) no comentário que compõe o cabeçalho da classe. Ele foi enviado para seu e-mail institucional. Também não esqueça de ajustar o _fully qualified name_ conforme visto na sala.

1. Tipos Primitivos: Crie um programa que declare variáveis de todos os tipos primitivos em Java (byte, short, int, long, float, double, boolean, char) e uma variável do tipo String. Atribua valores a elas e imprima esses valores no console.

2. Limites do _int_: Crie um programa que descubra o valor máximo e mínimo que um int pode armazenar em Java. Utilize as constantes Integer.MAX_VALUE e Integer.MIN_VALUE para isso. Faça com que ocorra um estouro nesse tamanho máximo.

3. Programação Estruturada - Cálculo de Média: Crie um programa em Java que calcule a média de três notas utilizando programação estruturada. Não use classes e objetos para isso, apenas métodos estáticos.

4. Programação O.O. - Aluno com Cálculo de Média: Crie uma classe "Aluno" que tenha os atributos nome e três notas. Implemente métodos para calcular a média das notas e para verificar se o aluno foi aprovado (média maior ou igual a 7.0). Crie uma classe TestaAlunoOO para instanciar um aluno e exibir suas informações, incluindo a média e o status de aprovação.

5. Classe Funcionario: Crie uma classe chamada "Funcionario" que tenha os atributos nome, cargo e salário. Implemente métodos getters e setters para cada atributo. Crie um método que aumente o salário em uma porcentagem fornecida. Crie uma classe TestaFuncionario para instanciar e exibir as informações de dois funcionários, incluindo os salários após o aumento.

6. Método para Aluno: Ajuste a classe "Aluno", implementando um método para calcular se o aluno foi aprovado (média maior ou igual a 7.0) ou reprovado. Implemente getters, setters e toString. Crie a classe TestaAluno, com 2 alunos.

7. Crie uma classe chamada "Carro" que tenha os atributos marca, modelo e ano. Sobrescreva o método `toString()` para exibir as informações completas do carro. Ao exibir as informações do carro, diga se ele é ou não semi-novo (se tem mais de três anos de fabricação, não é semi-novo). Implemente getters e setters. Crie a classe TestaCarro, com 2 carros.

8. Crie uma classe chamada "ContaBancaria" que tenha os atributos número da conta, nome do titular e saldo. Implemente métodos para depositar, sacar e verificar o saldo da conta. Implemente getters, setters e toString. Crie a classe TestaContaBancaria, com 3 contas.

9. Crie uma classe chamada "Pessoa" que tenha os atributos nome, idade e altura. Implemente os seguintes métodos:

   - Substitua o método `toString()` padrão da classe Object. O método `toString()` deve retornar uma string contendo as informações completas da pessoa, incluindo nome, idade e altura. Certifique-se de anotar o método com a anotação `@Override`.
   - Crie um método chamado `fazerAniversario()` que não recebe nenhum parâmetro e não retorna nenhum valor. Esse método deve incrementar a idade da pessoa em 1 e exibir a mensagem "Feliz aniversário! Agora você tem X anos.", onde X é a nova idade da pessoa.
   - Crie um método chamado `ehMaiorDeIdade()` que não recebe nenhum parâmetro e retorna um valor booleano. Esse método deve verificar se a pessoa é maior de idade (idade maior ou igual a 18) e retornar `true` se for maior de idade ou `false` caso contrário.

10. Crie uma classe chamada "Produto" que tenha os atributos nome, preço e quantidade em estoque. Implemente métodos para adicionar e remover produtos do estoque, além de exibir as informações completas do produto. Implemente getters, setters e toString. Crie a classe TestaProduto, com 258 produtos. Utilize uma coleção do tipo "ArrayList" para armazenar os produtos em estoque.

11. Crie uma classe chamada "Funcionario" que tenha os atributos nome, cargo e salário. Implemente um método para exibir as informações completas do funcionário. Utilize uma coleção do tipo "HashMap" para armazenar os funcionários, utilizando o nome como chave. Faça uma classe TestaFuncionario com 14 funcionários, sendo 2 gerentes.

12. Crie uma classe chamada "Banco" que tenha o atributo nome e uma lista de contas bancárias. Utilize a ContaBancaria criada na aula anterior. Implemente métodos para adicionar e remover contas do banco, além de exibir as informações completas de todas as contas. Utilize uma coleção do tipo "LinkedList" para armazenar as contas bancárias de 30 pessoas, na classe TestaBanco.
