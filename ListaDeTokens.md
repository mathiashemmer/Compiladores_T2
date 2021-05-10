## Lista de Tokens

### Palavras Reservadas

Série ID: Entre 7 e 26   
maiúsculas e Minúsculas: Sim

| ID      | Token | Descrição |
| ----------- | ----------- |  ----------- |
| 7      | PROGRAM       | Palavra reservada de inicio de programa |
| 8      | DEFINE       | Escopo de definições de variáveis e constantes | 
| 9      | NOT       | Modificador de constante | 
| 10      | VARIABLE       | Definição de variavel | 
| 11      | IS       | Declaração de condicional | 
| 12      | NATURAL       | Tipo numérico de ponto flutuante | 
| 13      | REAL       | Tipo numérico inteiro | 
| 14      | CHAR       | Tipo caractere | 
| 15      | BOOLEAN       | Tipo lógico | 
| 16      | EXECUTE       | Escopo do programa de exeução | 
| 17      | GET       | Entrada de dados padrão ao usuário | 
| 18      | PUT       | Saída de dados padrão ao dispositivo | 
| 19      | LOOP       | Condicional de iteração | 
| 20      | WHILE       | Condicional de iteração | 
| 21      | DO       | Condicional de iteração | 
| 22      | TO       | Declaração de atribuição | 
| 23      | SET       | Declaração de atribuição | 
| 24      | VERIFY       | Declaração de condicional lógica | 
| 25      | TRUE      | Tipo de valor lógico | 
| 26      | FALSE       | Tipo de valor lógico |

---

### Símbolos Reservadas

Série ID: Entre 27 e 52   
Maiúsculas e Minúsculas: N/A

| ID      | Token |  Regra |
| ----------- | ----------- |  ----------- | 
| 27    | LPAREN | ( |
| 28    | RPAREN | ) |
| 29    | LCOL | { |
| 30    | RCOL | } |
| 31    | LCHAVE | [ |
| 32    | RCHAVE | ] |
| 33    | PONTOVIRGULA| ; |
| 34    | VIRGULA| , |
| 35    | PONTO| . |
| 36    | MENORIGUAL| <= |
| 37    | EXCLAMACAO| ! |
| 38    | MAIS| + |
| 39    | MENOS| - |
| 40    | ASTERISCO| * |
| 41    | MAIORIGUAL| >= |
| 42    | BARRA| / |
| 43    | POTENCIA| ** |
| 44    | DIVISAOINTEIRA| % |
| 45    | RESTODIVISAO| %$ |
| 46    | LOGICOE| & |
| 47    | LOGICOOU| \| |
| 48    | IGUALDADE| == |
| 49    | DIFERENCA| != |
| 50    | MAIORQUE| > |
| 51    | MENORQUE| < |
| 52    | DOGSBOLLOCKS| :- |

---
### Formação Léxica

Série ID: Entre 52 e 58
Maiúsculas e Minúsculas: Sim

| ID      | Token | Regra | Descrição |
| ----------- | ----------- |  ----------- | ----------- |
|52| IDENTIFICADOR | ((\<LETRA\>) \\ "\_") (((\<LETRA\>) \\ "\_" \\ (\<DIGITO\>))?)* | Qualquer palavra dentro das regras de identificadores específicadas |
|53| <INTEIROS | (\<DIGITO\>){1,3} | Números inteiros de até 3 digitos |
|54| <FLUTUANTE | (\<DIGITO\>){1,5}","(\<DIGITO\>){1,3} | Números de ponto flutuante, de 1 a 5 digitos inteiros e até 3 digitos decimais |
|55| <LITERAL | "\"" (\~\["\""\])\*"\"" \\ "\'" (\~\["\'"\])\*"\'" | Caractére ou cadeia de caractére |
|56| <LETRA | \["A"\-"Z","a"\-"z"\] | Qualquer letra do alfabeto |
|57| <DIGITO | \["0"-"9"\] | Digitos de zero a nove (1, 2, 3, 4, 5, 6, 7, 8 ,9, 0) |
|58| <LINEBREAK | "\n" | Caractére especia de fim de linha |

---
### Comentários

Série ID: Acima de 58
Maiúsculas e Minúsculas: Sim

| ID      | Token | Regra | Descrição |
| 59      | COMENTARIO_EM_LINHA |  "#" (~["\n","\r"])* ("\n"|"\r"|"\r\n") | Qualquer cadeia caractere iniciada em "#", e finalizada com um "\n" |
| 60      | COMENTARIO_EM_MULTILINHA | "@#" (~["#"])* "#" (~["#","@"] (~["#"])* "#" | "#")* "@" | Qualquer cadeia de caractere, iniciada em "@#" e finalizada em "#@