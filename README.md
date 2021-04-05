

# Sobre
**UNIVERSIDADE DO VALE DO ITAJAI - UNIVALI**   
**Ciência da Computação - Compiladores**

**Academicos**: Mathias Hemmer, Bruno Muller

## Como Utilizar

### Compilando arquivos .jj

Essa seção assume que o JDK 14.0.2 já esteja instalado e configurado na máquina.
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


