# Outros Exercícios

## Nota: máximo X,0 pontos se o commit no github for até 23:59h do dia XX/XX/2024

### Banco de Questões

1. (0,0) Crie uma classe chamada Produto com um atributo descricao de visibilidade private. Crie um construtor público para a classe Produto que aceite um parâmetro descricao para inicializar o atributo. Forneça um método público chamado exibirDescricao para exibir a descrição do produto.

2. (0,0) Crie uma classe BibliotecaPequena com atributos nome (private) e livros[6] (protected). A classe Biblioteca deve conter um método listarLivros de visibilidade public que exibe os nomes dos livros cadastrados. Faça uma classe TestaBibliotecaPequena com o cadastro de 6 livros. Armazene o nome dos livros no array e use a classe Scanner para ler o nome de cada livro.

3. (0,0) Crie uma classe chamada "Carro" que tenha os atributos marca, modelo e ano. Sobrescreva o método `toString()` para exibir as informações completas do carro. Ao exibir as informações do carro, diga se ele é ou não semi-novo (se tem mais de três anos de fabricação, não é semi-novo). Implemente getters e setters. Crie a classe TestaCarro, com 2 carros.

4. (0,0) Exercício de cadastro de carros:

   - Crie uma classe chamada Carro com os seguintes atributos privados: marca, modelo e ano.

   - Crie um construtor com os três atributos, crie os métodos get e set para cada atributo.

   - Crie a Classe TestaCarro. Utilize a classe Scanner para receber entradas do usuário e criar objetos Carro com base nas informações fornecidas. Faça o cadastro de 4 carros, armazenando em um ArrayList<Carro>.

   - Ao final, exiba os carros cadastrados.

5. (0,0) Exercício de cadastro de times de jogadores:

   - Crie uma classe chamada Jogador com os seguintes atributos privados: codigo, nome, idade, altura.

   - Crie um construtor público na classe Jogador que aceite três valores como parâmetros e inicialize os atributos. O código deve ser randômico até 99999 e deve ser gerenciado pela classe.

   - Crie uma classe chamada Time com os atributos privados: nomeTime, jogadores (um ArrayList<Jogador>).

   - Crie um construtor público na classe Time que aceite o nome do time como parâmetro e inicialize o atributo nomeTime. Inicialize também a lista de jogadores com um tamanho de 11.

   - Crie um método público cadastrarJogador na classe Time, que use a classe Scanner para receber informações sobre um jogador (nome, idade e altura) e crie um objeto Jogador. Adicione o jogador ao vetor de jogadores.

   - Crie um método público listarJogadores na classe Time, que exiba as informações de cada jogador do time, incluindo codigo, nome, idade e altura.

   - Crie a classe TestaTime. Use a classe Scanner e permita que o usuário cadastre informações sobre 2 times e seus 11 jogadores.

   - Após cadastrar todos os times e jogadores, exiba todas as informações cadastradas.


6. (0,0) Classe Funcionario: Crie uma classe chamada "Funcionario" que tenha os atributos nome, cargo e salário. Implemente métodos getters e setters para cada atributo. Crie um método que aumente o salário em uma porcentagem fornecida. Crie uma classe TestaFuncionario para instanciar e exibir as informações de dois funcionários, incluindo os salários após o aumento.

7. (0,0) Método para Aluno: Ajuste a classe "Aluno", implementando um método para calcular se o aluno foi aprovado (média maior ou igual a 7.0) ou reprovado. Implemente getters, setters e toString. Crie a classe TestaAluno, com 2 alunos.

8. (0,0) Crie uma classe chamada "ContaBancaria" que tenha os atributos número da conta, nome do titular e saldo. Implemente métodos para depositar, sacar e verificar o saldo da conta. Implemente getters, setters e toString. Crie a classe TestaContaBancaria, com 3 contas.

9. (0,0) Crie uma classe chamada "Pessoa" que tenha os atributos nome, idade e altura. Implemente os seguintes métodos:

   - Crie um método chamado `fazerAniversario()` que não recebe nenhum parâmetro e não retorna nenhum valor. Esse método deve incrementar a idade da pessoa em 1 e exibir a mensagem "Feliz aniversário! Agora você tem X anos.", onde X é a nova idade da pessoa.
   - Crie um método chamado `ehMaiorDeIdade()` que não recebe nenhum parâmetro e retorna um valor booleano. Esse método deve verificar se a pessoa é maior de idade (idade maior ou igual a 18) e retornar `true` se for maior de idade ou `false` caso contrário.

10. (0,0) Crie uma classe chamada "Produto" que tenha os atributos nome, preço e quantidade em estoque. Implemente métodos para adicionar e remover produtos do estoque, além de exibir as informações completas do produto. Implemente getters, setters e toString. Crie a classe TestaProduto, com 258 produtos. Utilize uma coleção do tipo "ArrayList" para armazenar os produtos em estoque.

11. (0,0) Crie uma classe chamada "Funcionario" que tenha os atributos nome, cargo e salário. Implemente um método para exibir as informações completas do funcionário. Utilize uma coleção do tipo "HashMap" para armazenar os funcionários, utilizando o nome como chave. Faça uma classe TestaFuncionario com 14 funcionários, sendo 2 gerentes.

12. (0,0) Crie uma classe chamada "Banco" que tenha o atributo nome e uma lista de contas bancárias. Utilize a ContaBancaria criada na aula anterior. Implemente métodos para adicionar e remover contas do banco, além de exibir as informações completas de todas as contas. Utilize uma coleção do tipo "LinkedList" para armazenar as contas bancárias de 30 pessoas, na classe TestaBanco.

13. (0,0) Modifique a classe "Aluno". Implemente os seguintes métodos:

   - Um método chamado `fazerAniversario()` que não recebe nenhum parâmetro e não retorna nenhum valor. Esse método deve incrementar a idade da pessoa em 1 e exibir a mensagem "Feliz aniversário! Agora você tem X anos.", onde X é a nova idade da pessoa.
   - Um método chamado `ehMaiorDeIdade()` que não recebe nenhum parâmetro e retorna um valor booleano. Esse método deve verificar se a pessoa é maior de idade (idade maior ou igual a 18) e retornar `true` se for maior de idade ou `false` caso contrário.