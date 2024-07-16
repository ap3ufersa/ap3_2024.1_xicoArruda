# Aula 2 - 19/07/2024

### Exercícios

1. Crie uma classe chamada "Aluno" que tenha os atributos nome, matrícula e nota. Implemente um método para calcular se o aluno foi aprovado (média maior ou igual a 7.0) ou reprovado. Implemente getters, setters e toString. Crie a classe TestaAluno, com 2 alunos.

2. Crie uma classe chamada "Carro" que tenha os atributos marca, modelo e ano. Sobrescreva o método `toString()` para exibir as informações completas do carro. Ao exibir as informações do carro, diga se ele é ou não semi-novo (se tem mais de três anos de fabricação, não é semi-novo). Implemente getters e setters. Crie a classe TestaCarro, com 2 carros.

3. Crie uma classe chamada "ContaBancaria" que tenha os atributos número da conta, nome do titular e saldo. Implemente métodos para depositar, sacar e verificar o saldo da conta. Implemente getters, setters e toString. Crie a classe TestaContaBancaria, com 3 contas.

4. Crie uma classe chamada "Pessoa" que tenha os atributos nome, idade e altura. Implemente os seguintes métodos:

   - Substitua o método `toString()` padrão da classe Object. O método `toString()` deve retornar uma string contendo as informações completas da pessoa, incluindo nome, idade e altura. Certifique-se de anotar o método com a anotação `@Override`.
   - Crie um método chamado `fazerAniversario()` que não recebe nenhum parâmetro e não retorna nenhum valor. Esse método deve incrementar a idade da pessoa em 1 e exibir a mensagem "Feliz aniversário! Agora você tem X anos.", onde X é a nova idade da pessoa.
   - Crie um método chamado `ehMaiorDeIdade()` que não recebe nenhum parâmetro e retorna um valor booleano. Esse método deve verificar se a pessoa é maior de idade (idade maior ou igual a 18) e retornar `true` se for maior de idade ou `false` caso contrário.

5. Crie uma classe chamada "Produto" que tenha os atributos nome, preço e quantidade em estoque. Implemente métodos para adicionar e remover produtos do estoque, além de exibir as informações completas do produto. Implemente getters, setters e toString. Crie a classe TestaProduto, com 258 produtos. Utilize uma coleção do tipo "ArrayList" para armazenar os produtos em estoque.

6. Crie uma classe chamada "Funcionario" que tenha os atributos nome, cargo e salário. Implemente um método para exibir as informações completas do funcionário. Utilize uma coleção do tipo "HashMap" para armazenar os funcionários, utilizando o nome como chave. Faça uma classe TestaFuncionario com 14 funcionários, sendo 2 gerentes.

7. Crie uma classe chamada "Banco" que tenha o atributo nome e uma lista de contas bancárias. Utilize a ContaBancaria criada na aula anterior. Implemente métodos para adicionar e remover contas do banco, além de exibir as informações completas de todas as contas. Utilize uma coleção do tipo "LinkedList" para armazenar as contas bancárias de 30 pessoas, na classe TestaBanco.

8. Em todas as classes coloque o seu código secreto em um comentário. Ele foi enviado para seu e-mail institucional. Também não esqueça de ajustar o _fully qualified name_.
