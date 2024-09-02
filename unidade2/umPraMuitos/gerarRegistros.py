import random

# Função para gerar um nome fictício
def gerar_nome():
    prefixos = ['Professor', 'Doutor', 'Mestre']
    nomes = ['Wellington', 'Xico', 'João', 'Maria', 'Ana', 'Carlos', 'Fernanda', 'José', 'Malaquias']
    return f"{random.choice(prefixos)} {random.choice(nomes)}"

# Função para gerar um endereço fictício
def gerar_endereco(nome):
    ruas = ['Rua da Casa', 'Rua do Trabalho', 'Avenida Central', 'Rua das Flores', 'Rua do Bosque']
    cidades = ['Joanesburgo', 'Angicos', 'Vienna', 'São Paulo', 'Rio de Janeiro', 'Assú']
    return f"{random.choice(ruas)} de {nome.split()[1]}, num {random.randint(1, 999999)}", random.choice(cidades)

# Abrir o arquivo para escrever o script SQL
with open('inserir_pessoas_e_enderecos.sql', 'w') as file:
    for i in range(1, 5001):
        nome = gerar_nome()
        # Inserir pessoa
        file.write(f"INSERT INTO Pessoa (nome) VALUES ('{nome}');\n")
        # Inserir dois endereços para cada pessoa
        file.write(f"INSERT INTO Endereco (rua, cidade, pessoa_id) VALUES ('{gerar_endereco(nome)[0]}', '{gerar_endereco(nome)[1]}', {i});\n")
        file.write(f"INSERT INTO Endereco (rua, cidade, pessoa_id) VALUES ('{gerar_endereco(nome)[0]}', '{gerar_endereco(nome)[1]}', {i});\n")

print("Script SQL gerado com sucesso!")
