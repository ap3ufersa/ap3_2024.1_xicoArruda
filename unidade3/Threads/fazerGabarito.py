import os

def juntar_arquivos(pasta_origem, arquivo_destino):
    # Abrir o arquivo de destino para escrita
    with open(arquivo_destino, 'w') as output_file:
        # Percorrer todos os arquivos na pasta de origem
        for root, dirs, files in os.walk(pasta_origem):
            for nome_arquivo in files:
                caminho_arquivo = os.path.join(root, nome_arquivo)
                
                # Adicionar um comentário com o nome do arquivo
                output_file.write(f"\n// Arquivo: {nome_arquivo}\n\n")
                
                # Abrir e escrever o conteúdo de cada arquivo no arquivo de destino
                with open(caminho_arquivo, 'r') as arquivo:
                    conteudo = arquivo.read()
                    output_file.write(conteudo)
                    output_file.write("\n")  # Adiciona uma linha extra entre os arquivos

# Exemplo de uso
pasta_origem = 'GabBibliotecaSingleThread'
arquivo_destino = 'zGabBibliotecaSingleThread.java'
juntar_arquivos(pasta_origem, arquivo_destino)

pasta_origem = 'GabBibliotecaMultiThread'
arquivo_destino = 'zGabBibliotecaMultiThread.java'
juntar_arquivos(pasta_origem, arquivo_destino)