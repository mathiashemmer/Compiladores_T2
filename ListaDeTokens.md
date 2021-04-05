## Lista de Tokens

### Palavras Reservadas

Série ID: Entre 6 e 25   
maiúsculas e Minúsculas: Sim

| ID      | Token | Descrição |
| ----------- | ----------- |  ----------- |
| 6      | PROGRAM       | Palavra reservada de inicio de programa |
| 7      | DEFINE       | Escopo de definições de variáveis e constantes | 
| 8      | NOT       | Modificador de constante | 
| 9      | VARIABLE       | Definição de variavel | 
| 10      | IS       | Declaração de condicional | 
| 11      | NATURAL       | Tipo numérico de ponto flutuante | 
| 12      | REAL       | Tipo numérico inteiro | 
| 13      | CHAR       | Tipo caractere | 
| 14      | BOOLEAN       | Tipo lógico | 
| 15      | EXECUTE       | Escopo do programa de exeução | 
| 16      | GET       | Entrada de dados padrão ao usuário | 
| 17      | PUT       | Saída de dados padrão ao dispositivo | 
| 18      | LOOP       | Condicional de iteração | 
| 19      | WHILE       | Condicional de iteração | 
| 20      | DO       | Condicional de iteração | 
| 21      | TO       | Declaração de atribuição | 
| 22      | SET       | Declaração de atribuição | 
| 23      | VERIFY       | Declaração de condicional lógica | 
| 24      | TRUE      | Tipo de valor lógico | 
| 25      | FALSE       | Tipo de valor lógico |

---

### Símbolos Reservadas

Série ID: Entre 26 e 51   
Maiúsculas e Minúsculas: N/A

| ID      | Token |  Regra |
| ----------- | ----------- |  ----------- | 
| 26    | LPAREN | ( |
| 27    | RPAREN | ) |
| 28    | LCOL | { |
| 29    | RCOL | } |
| 30    | LCHAVE | [ |
| 31    | RCHAVE | ] |
| 32    | PONTOVIRGULA| ; |
| 33    | VIRGULA| , |
| 34    | PONTO| . |
| 35    | MENORIGUAL| <= |
| 36    | EXCLAMACAO| ! |
| 37    | MAIS| + |
| 38    | MENOS| - |
| 39    | ASTERISCO| * |
| 40    | MAIORIGUAL| >= |
| 41    | BARRA| / |
| 42    | POTENCIA| ** |
| 43    | DIVISAOINTEIRA| % |
| 44    | RESTODIVISAO| %$ |
| 45    | LOGICOE| & |
| 46    | LOGICOOU| \| |
| 47    | IGUALDADE| == |
| 48    | DIFERENCA| != |
| 49    | MAIORQUE| > |
| 50    | MENORQUE| < |
| 51    | DOGSBOLLOCKS| :- |

---
### Foração Léxica

Série ID: Acima de e 52
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