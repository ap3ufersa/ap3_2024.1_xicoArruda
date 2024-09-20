### Aula 9 - 13/09/2024 - Herança e Polimorfismo

### Exercício resolvido

Exercício resolvido [aqui](exercicio2_0.md).

Gabarito [aqui](veiculo_polimorfismo).

### Exercício com nota

(2,0) Coloque o programa no seu repositório em unidade2/exercicio2 .

### Teoria

### POO se baseia na criação de objetos que interagem entre si. Uma classe é como uma planta baixa de uma casa. Cada casa construída (instância) seria um objeto, composto por outros objetos. Em sistemas computacionais, as classes são abstraídas em modelos na cabeça do programador (não tem "peso")

### Na casa, seria

#### 1. Abstração

A planta baixa representa a abstração de uma casa. Ela mostra a estrutura geral, com cômodos e projeto elétrico. Mas o projeto não indica qual broca foi utilizada para furar o buraco na dobradiça da porta. A abstração é a capacidade de ocultar detalhes. Uma Porta pode ter atributos como cor, material e tamanho, sem se preocupar com os detalhes como a marca da tinta.

#### 2. Encapsulamento

Cada cômodo da casa é encapsulado por paredes. O que acontece dentro de um quarto é privado (private), acessível apenas com permissão (get e set). Apenas os métodos devem interferir nos atributos. Por exemplo, a temperatura do ar condicionado é encapsulada dentro do objeto ArCondicionado, e só pode ser alterada através de métodos específicos como aumentarTemperatura e diminuirTemperatura do controle remoto do cômodo específico.

#### 3. Herança

Uma casa moderna (platibanda) pode herdar características de casas antigas (coloniais). Uma casa tem sempra a mesma estrutura, com paredes e teto, com ou sem laje. Uma casa moderna tem adições como tubulação para ar condicionado e previsão de rede de dados para IoT.
A herança permite que uma classe (filha) herde e reuse atributos e métodos de outra classe (pai). Isso cria uma hierarquia de classes e promove a reutilização de código. Em interfaces gráficas (GUI) isso é crucial, já que botões base (classe pai) de botões específicos (classes filhos).

#### 4. Polimorfismo

Em uma casa há diferentes jeitos de abrir um cômodo para o exterior, pela janela, pela porta, pelo teto. A mesma ação (abrir) pode ter resultados diferentes dependendo do objeto sobre o qual ela é aplicada.
Ação é método em POO, e um método abrir pode ser chamado em objetos de diferentes classes (porta, janela, portão), com resultados diferentes.

### Historinha

- Imagine que o professor Wellington Junior está construindo uma casa inteligente.
- Ele começou pagando uma arquiteta e um engenheiro civil para fazer o projeto com com a planta baixa (abstração).
- Cada cômodo é encapsulado por paredes (encapsulamento) para proteger sua privacidade.
- Com o tempo, Wellington viu a necessidade de construir um quarto para a sogra. O novo quarto vai ser parecido com os quartos originais, pois herda características da casa principal (herança), mas tem suas próprias particularidades. Pode ter uma decoração diferente, mas a base é a mesma dos outros cômodos.
- Como a casa é inteligente, ele tem vários tipos de iluminação e vários ar-condicionados. Em POO, ele pode montar e implantar com a Alexa um cenário em que o comportamento ligar() pode ser diferente para as luzes da sala, da área externa e do ar condicionado (polimorfismo).
