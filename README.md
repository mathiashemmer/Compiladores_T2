

# Sobre
**UNIVERSIDADE DO VALE DO ITAJAI - UNIVALI**   
**Ciência da Computação - Compiladores**

**Academicos**: Mathias Hemmer, Bruno Muller

O projeto encontra-se por completo no gitgub:   
https://github.com/mathiashemmer/Compiladores_T2

## Como Utilizar

### O Programa:

O arquivo executavel encontra-se dentro da pasta "Compilador" extraida, com nome de *Compilador.exe*.

Nenhuma configuração deve ser nescessária, nem por parte do java, uma vez que o ambiente de execução é enviado com o programa.

**Atalhos**

|Tecla|Função|Descrição|
|-----|------|---------|
|CLTR+O|Abrir|Abre a janela de seleção de arquivo para carregar um arquivo salvo|
|CLTR+S|Salvar|Salva o arquivo. Se for um novo arquivo, socilicita o local e nome |
|CLTR+N|Criar|Cria um novo arquivo. Se houve alterações no arquivo atual solicita para salvar primeiro|

**Efetuando a análise léxica**

A análise léxica pode ser iniciada de duas formas:
- Navegando até o menu "Compilação" e selecionando o item *Compilar*
- Ou utilizando segundo botão do menu de navegação, da direita para esquerda, com o ícone de um lápis construindo um muro


### Compilando arquivos .jj

Essa seção assume que o JDK 14.0.2 já esteja instalado e configurado na máquina.
- Dentro do projeto, localize a linguagem em: *caminho_do_projeto\javacc\languages\2021.jj*
- Altere a a configuração dentro da linguagem "OUTPUT_DIRECTORY" para o inicio apontar para o caminho do projeto. Por exemplo, se o proejto fica em *c:\\intellij\projects\compilador*, altere 
  - **de** *C:\\Users\\MathiasNB\\IdeaProjects\\L2021_Compiler\\src\\main\\java\\hmm\\mathias\\compiler"*
  - **para** *c:\\intellij\projects\compilador\src\\main\\java\\hmm\\mathias\\compiler"*
- Em um terminal de comando, navegue até a pasta do projeto (ex: *c:\sources\\intellij\compilador*)
- Rode o comando: java -cp *javacc\target\javacc.jar javacc javacc\languages\2021.jj*

Pronto, a linguagem foi compilada e inserida no caminho correto do projeto. Os arquivos estão prontos para serem editados.

### Ajustando para análise léxica multipla

- Navegue até o arquivo FoxtranTokenManager (src.main.hmm.mathias)
- Na função public Token getNextToken() (aprox. linha 962) procure a condicional de verificação de EOF no fim do arquivo
- Dentro desse condicional, existe uma linha de retorno a string de entrada: *input_stream.backup(1)*. Remova essa linha (aprox linha 1018)

### Gerando um executavel

- Na aba do Gradle, rode a task *jpackage*
- Uma build de um executavel stand-alone será criada em: *camihno_do_projeto\build\out\Compilador*


