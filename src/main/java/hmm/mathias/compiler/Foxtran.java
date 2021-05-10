/* Foxtran.java */
/* Generated By:JavaCC: Do not edit this line. Foxtran.java */
package hmm.mathias.compiler;

public class Foxtran implements FoxtranConstants {
    public PrintInterface printer;

    void error_skipto(String error, int[] kind) throws ParseException{
      printer.print(token, error);
    }

  final public void BOOLEANO() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:{
      jj_consume_token(TRUE);
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Grammatica() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DOGSBOLLOCKS:{
      ComentarioInicial();
      break;
      }
    default:
      ;
    }
    Programa();
    IdentificadorFinal();
    jj_consume_token(0);
}

  final public void ComentarioInicial() throws ParseException {
    jj_consume_token(DOGSBOLLOCKS);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFICADOR:{
        ;
        break;
        }
      default:
        break label_1;
      }
      jj_consume_token(IDENTIFICADOR);
    }
    jj_consume_token(PONTO);
}

  final public void Programa() throws ParseException {
    jj_consume_token(PROGRAM);
    jj_consume_token(LCOL);
    Define();
    Corpo();
    jj_consume_token(RCOL);
}

  final public void Define() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DEFINE:{
      jj_consume_token(DEFINE);
      jj_consume_token(LCOL);
      VariavelOuConstante();
      jj_consume_token(RCOL);
      break;
      }
    default:
      ;
    }
}

  final public void VariavelOuConstante() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VARIABLE:{
      jj_consume_token(VARIABLE);
      DeclaraVariavel();
      DeclaraConstanteOpcional();
      break;
      }
    case NOT:{
      jj_consume_token(NOT);
      jj_consume_token(VARIABLE);
      DeclaraConstante();
      DeclaraVariavelOpcional();
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void DeclaraConstanteOpcional() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NOT:{
      jj_consume_token(NOT);
      jj_consume_token(VARIABLE);
      DeclaraConstante();
      break;
      }
    default:
      ;
    }
}

  final public void DeclaraVariavelOpcional() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VARIABLE:{
      jj_consume_token(VARIABLE);
      DeclaraVariavel();
      break;
      }
    default:
      ;
    }
}

  final public void DeclaraConstante() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NATURAL:{
      jj_consume_token(NATURAL);
      jj_consume_token(IS);
      jj_consume_token(IDENTIFICADOR);
      ConstanteInteiroOuErro();
      ConstanteRecursiva();
      jj_consume_token(PONTO);
      ConstanteOpcional();
      break;
      }
    case REAL:{
      jj_consume_token(REAL);
      jj_consume_token(IS);
      jj_consume_token(IDENTIFICADOR);
      ConstanteRealOuErro();
      ConstanteRecursiva();
      jj_consume_token(PONTO);
      ConstanteOpcional();
      break;
      }
    case CHAR:{
      jj_consume_token(CHAR);
      jj_consume_token(IS);
      jj_consume_token(IDENTIFICADOR);
      ConstanteLiteralOuErro();
      ConstanteRecursiva();
      jj_consume_token(PONTO);
      ConstanteOpcional();
      break;
      }
    case BOOLEAN:{
      jj_consume_token(BOOLEAN);
      jj_consume_token(IS);
      jj_consume_token(IDENTIFICADOR);
      ConstanteBooleanoOuErro();
      ConstanteRecursiva();
      jj_consume_token(PONTO);
      ConstanteOpcional();
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void ConstanteInteiroOuErro() throws ParseException {
    try {
      jj_consume_token(INTEIROS);
    } catch (ParseException e) {
int[] follow = {PONTO, VIRGULA};
        error_skipto("Encontrado " + getToken(1).image + " mas era esperado um Inteiro", follow);
    }
}

  final public void ConstanteRealOuErro() throws ParseException {
    try {
      jj_consume_token(FLUTUANTE);
    } catch (ParseException e) {
int[] follow = {PONTO, VIRGULA};
        error_skipto("Encontrado " + getToken(1).image + " mas era esperado um Real", follow);
    }
}

  final public void ConstanteLiteralOuErro() throws ParseException {
    try {
      jj_consume_token(LITERAL);
    } catch (ParseException e) {
int[] follow = {PONTO, VIRGULA};
        error_skipto("Encontrado " + getToken(1).image + " mas era esperado um Literal", follow);
    }
}

  final public void ConstanteBooleanoOuErro() throws ParseException {
    try {
      BOOLEANO();
    } catch (ParseException e) {
int[] follow = {PONTO, VIRGULA};
        error_skipto("Encontrado " + getToken(1).image + " mas era esperado um Booleano", follow);
    }
}

  final public void ConstanteRecursiva() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VIRGULA:{
      jj_consume_token(VIRGULA);
      jj_consume_token(IDENTIFICADOR);
      ConstanteRecursiva();
      break;
      }
    default:
      ;
    }
}

  final public void ConstanteOpcional() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NATURAL:
    case REAL:
    case CHAR:
    case BOOLEAN:{
      DeclaraConstante();
      break;
      }
    default:
      ;
    }
}

  final public void DeclaraVariavel() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NATURAL:{
      jj_consume_token(NATURAL);
      jj_consume_token(IS);
      jj_consume_token(IDENTIFICADOR);
      VariavelArrayOpcional();
      VariavelRecursiva();
      jj_consume_token(PONTO);
      VariavelOpcional();
      break;
      }
    case REAL:{
      jj_consume_token(REAL);
      jj_consume_token(IS);
      jj_consume_token(IDENTIFICADOR);
      VariavelArrayOpcional();
      VariavelRecursiva();
      jj_consume_token(PONTO);
      VariavelOpcional();
      break;
      }
    case CHAR:{
      jj_consume_token(CHAR);
      jj_consume_token(IS);
      jj_consume_token(IDENTIFICADOR);
      VariavelArrayOpcional();
      VariavelRecursiva();
      jj_consume_token(PONTO);
      VariavelOpcional();
      break;
      }
    case BOOLEAN:{
      jj_consume_token(BOOLEAN);
      jj_consume_token(IS);
      jj_consume_token(IDENTIFICADOR);
      VariavelArrayOpcional();
      VariavelRecursiva();
      jj_consume_token(PONTO);
      VariavelOpcional();
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void VariavelRecursiva() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VIRGULA:{
      jj_consume_token(VIRGULA);
      jj_consume_token(IDENTIFICADOR);
      VariavelArrayOpcional();
      VariavelRecursiva();
      break;
      }
    default:
      ;
    }
}

  final public void VariavelArrayOpcional() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LCHAVE:{
      jj_consume_token(LCHAVE);
      jj_consume_token(INTEIROS);
      jj_consume_token(RCHAVE);
      break;
      }
    default:
      ;
    }
}

  final public void VariavelOpcional() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NATURAL:
    case REAL:
    case CHAR:
    case BOOLEAN:{
      DeclaraVariavel();
      break;
      }
    default:
      ;
    }
}

  final public void Corpo() throws ParseException {
    jj_consume_token(EXECUTE);
    jj_consume_token(LCOL);
    ListaDeComandos();
    jj_consume_token(RCOL);
}

  final public void ListaDeComandos() throws ParseException {
    Comandos();
    jj_consume_token(PONTO);
    ListaDeComandosOpcional();
}

  final public void ListaDeComandosOpcional() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case GET:
    case PUT:
    case LOOP:
    case WHILE:
    case SET:
    case TRUE:
    case FALSE:
    case LPAREN:
    case MENORIGUAL:
    case EXCLAMACAO:
    case MAIORIGUAL:
    case IGUALDADE:
    case DIFERENCA:
    case MAIORQUE:
    case MENORQUE:
    case IDENTIFICADOR:
    case INTEIROS:
    case FLUTUANTE:
    case LITERAL:{
      ListaDeComandos();
      break;
      }
    default:
      ;
    }
}

  final public void Comandos() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SET:{
      ComandoSet();
      break;
      }
    case GET:{
      ComandoGet();
      break;
      }
    case PUT:{
      ComandoPut();
      break;
      }
    case TRUE:
    case FALSE:
    case LPAREN:
    case MENORIGUAL:
    case EXCLAMACAO:
    case MAIORIGUAL:
    case IGUALDADE:
    case DIFERENCA:
    case MAIORQUE:
    case MENORQUE:
    case IDENTIFICADOR:
    case INTEIROS:
    case FLUTUANTE:
    case LITERAL:{
      ComandoVerify();
      break;
      }
    case LOOP:
    case WHILE:{
      ComandoIterador();
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void ComandoSet() throws ParseException {
    jj_consume_token(SET);
    Expressao();
    jj_consume_token(TO);
    ListaDeIdentificadores();
}

  final public void ComandoGet() throws ParseException {
    jj_consume_token(GET);
    jj_consume_token(LCOL);
    ListaDeIdentificadores();
    jj_consume_token(RCOL);
}

  final public void ListaDeIdentificadores() throws ParseException {
    jj_consume_token(IDENTIFICADOR);
    ListaDeIdentificadoresRecursivo();
}

  final public void ListaDeIdentificadoresRecursivo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VIRGULA:{
      jj_consume_token(VIRGULA);
      ListaDeIdentificadores();
      break;
      }
    default:
      ;
    }
}

  final public void ComandoPut() throws ParseException {
    jj_consume_token(PUT);
    jj_consume_token(LCOL);
    ListaDeIdEConstantes();
    jj_consume_token(RCOL);
}

  final public void ListaDeIdEConstantes() throws ParseException {
    IdentificadorEConstantes();
    ListaDeIdEConstantesRecursiva();
}

  final public void ListaDeIdEConstantesRecursiva() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VIRGULA:{
      jj_consume_token(VIRGULA);
      ListaDeIdEConstantes();
      break;
      }
    default:
      ;
    }
}

  final public void IdentificadorEConstantes() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFICADOR:{
      jj_consume_token(IDENTIFICADOR);
      break;
      }
    case LITERAL:{
      jj_consume_token(LITERAL);
      break;
      }
    case INTEIROS:{
      jj_consume_token(INTEIROS);
      break;
      }
    case FLUTUANTE:{
      jj_consume_token(FLUTUANTE);
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void ComandoVerify() throws ParseException {
    Expressao();
    ComandoVerifyInicio();
}

  final public void ComandoVerifyInicio() throws ParseException {
    if (jj_2_1(2)) {
      ComandoVerifyInicioIsTrue();
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IS:{
        ComandoVeiryfInicioIsFalse();
        break;
        }
      default:
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

  final public void ComandoVerifyInicioIsTrue() throws ParseException {
    jj_consume_token(IS);
    jj_consume_token(TRUE);
    jj_consume_token(LCOL);
    ListaDeComandos();
    jj_consume_token(RCHAVE);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IS:{
      ComandoVerifyInicioIsTrueElse();
      break;
      }
    default:
      ;
    }
}

  final public void ComandoVerifyInicioIsTrueElse() throws ParseException {
    jj_consume_token(IS);
    jj_consume_token(FALSE);
    jj_consume_token(LCOL);
    ListaDeComandos();
    jj_consume_token(RCOL);
}

  final public void ComandoVeiryfInicioIsFalse() throws ParseException {
    jj_consume_token(IS);
    jj_consume_token(FALSE);
    jj_consume_token(LCOL);
    ListaDeComandos();
    jj_consume_token(RCOL);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IS:{
      ComandoVerifyInicioIsTrueElse();
      break;
      }
    default:
      ;
    }
}

  final public void ComandoVerifyInicioIsFalseElse() throws ParseException {
    jj_consume_token(IS);
    jj_consume_token(TRUE);
    jj_consume_token(LCOL);
    ListaDeComandos();
    jj_consume_token(RCOL);
}

  final public void ComandoIterador() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LOOP:{
      ComandoIteradorLoop();
      break;
      }
    case WHILE:{
      ComandoIteradorWhile();
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void ComandoIteradorLoop() throws ParseException {
    jj_consume_token(LOOP);
    jj_consume_token(LCOL);
    ListaDeComandos();
    jj_consume_token(RCOL);
    jj_consume_token(WHILE);
    Expressao();
    jj_consume_token(IS);
    jj_consume_token(TRUE);
}

  final public void ComandoIteradorWhile() throws ParseException {
    jj_consume_token(WHILE);
    Expressao();
    jj_consume_token(IS);
    jj_consume_token(TRUE);
    jj_consume_token(DO);
    jj_consume_token(LCOL);
    ListaDeComandos();
    jj_consume_token(RCOL);
}

  final public void Expressao() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:
    case LPAREN:
    case EXCLAMACAO:
    case IDENTIFICADOR:
    case INTEIROS:
    case FLUTUANTE:
    case LITERAL:{
      ExpressaoLogicaOuAritimetica();
      break;
      }
    default:
      ;
    }
    ExpressaoContinuacao();
}

  final public void ExpressaoContinuacao() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IGUALDADE:{
      jj_consume_token(IGUALDADE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case LPAREN:
      case EXCLAMACAO:
      case IDENTIFICADOR:
      case INTEIROS:
      case FLUTUANTE:
      case LITERAL:{
        ExpressaoLogicaOuAritimetica();
        break;
        }
      default:
        ;
      }
      break;
      }
    case DIFERENCA:{
      jj_consume_token(DIFERENCA);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case LPAREN:
      case EXCLAMACAO:
      case IDENTIFICADOR:
      case INTEIROS:
      case FLUTUANTE:
      case LITERAL:{
        ExpressaoLogicaOuAritimetica();
        break;
        }
      default:
        ;
      }
      break;
      }
    case MAIORQUE:{
      jj_consume_token(MAIORQUE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case LPAREN:
      case EXCLAMACAO:
      case IDENTIFICADOR:
      case INTEIROS:
      case FLUTUANTE:
      case LITERAL:{
        ExpressaoLogicaOuAritimetica();
        break;
        }
      default:
        ;
      }
      break;
      }
    case MENORQUE:{
      jj_consume_token(MENORQUE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case LPAREN:
      case EXCLAMACAO:
      case IDENTIFICADOR:
      case INTEIROS:
      case FLUTUANTE:
      case LITERAL:{
        ExpressaoLogicaOuAritimetica();
        break;
        }
      default:
        ;
      }
      break;
      }
    case MAIORIGUAL:{
      jj_consume_token(MAIORIGUAL);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case LPAREN:
      case EXCLAMACAO:
      case IDENTIFICADOR:
      case INTEIROS:
      case FLUTUANTE:
      case LITERAL:{
        ExpressaoLogicaOuAritimetica();
        break;
        }
      default:
        ;
      }
      break;
      }
    case MENORIGUAL:{
      jj_consume_token(MENORIGUAL);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case LPAREN:
      case EXCLAMACAO:
      case IDENTIFICADOR:
      case INTEIROS:
      case FLUTUANTE:
      case LITERAL:{
        ExpressaoLogicaOuAritimetica();
        break;
        }
      default:
        ;
      }
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void ExpressaoLogicaOuAritimetica() throws ParseException {
    TermoDois();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MAIS:
    case MENOS:
    case LOGICOOU:{
      MenorPrioridade();
      break;
      }
    default:
      ;
    }
}

  final public void MenorPrioridade() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MAIS:{
      jj_consume_token(MAIS);
      MenorPrioridade();
      break;
      }
    case MENOS:{
      jj_consume_token(MENOS);
      MenorPrioridade();
      break;
      }
    case LOGICOOU:{
      jj_consume_token(LOGICOOU);
      MenorPrioridade();
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void TermoDois() throws ParseException {
    TermoUm();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ASTERISCO:
    case BARRA:
    case DIVISAOINTEIRA:
    case RESTODIVISAO:
    case LOGICOE:{
      MediaPrioridade();
      break;
      }
    default:
      ;
    }
}

  final public void MediaPrioridade() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ASTERISCO:{
      jj_consume_token(ASTERISCO);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASTERISCO:
      case BARRA:
      case DIVISAOINTEIRA:
      case RESTODIVISAO:
      case LOGICOE:{
        MediaPrioridade();
        break;
        }
      default:
        ;
      }
      break;
      }
    case BARRA:{
      jj_consume_token(BARRA);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASTERISCO:
      case BARRA:
      case DIVISAOINTEIRA:
      case RESTODIVISAO:
      case LOGICOE:{
        MediaPrioridade();
        break;
        }
      default:
        ;
      }
      break;
      }
    case DIVISAOINTEIRA:{
      jj_consume_token(DIVISAOINTEIRA);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASTERISCO:
      case BARRA:
      case DIVISAOINTEIRA:
      case RESTODIVISAO:
      case LOGICOE:{
        MediaPrioridade();
        break;
        }
      default:
        ;
      }
      break;
      }
    case RESTODIVISAO:{
      jj_consume_token(RESTODIVISAO);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASTERISCO:
      case BARRA:
      case DIVISAOINTEIRA:
      case RESTODIVISAO:
      case LOGICOE:{
        MediaPrioridade();
        break;
        }
      default:
        ;
      }
      break;
      }
    case LOGICOE:{
      jj_consume_token(LOGICOE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASTERISCO:
      case BARRA:
      case DIVISAOINTEIRA:
      case RESTODIVISAO:
      case LOGICOE:{
        MediaPrioridade();
        break;
        }
      default:
        ;
      }
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void TermoUm() throws ParseException {
    Elemento();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case POTENCIA:{
      MaiorPrioridde();
      break;
      }
    default:
      ;
    }
}

  final public void MaiorPrioridde() throws ParseException {
    jj_consume_token(POTENCIA);
    Elemento();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case POTENCIA:{
      MaiorPrioridde();
      break;
      }
    default:
      ;
    }
}

  final public void Elemento() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFICADOR:{
      jj_consume_token(IDENTIFICADOR);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LCHAVE:{
        Indice();
        break;
        }
      default:
        ;
      }
      break;
      }
    case FLUTUANTE:{
      jj_consume_token(FLUTUANTE);
      break;
      }
    case INTEIROS:{
      jj_consume_token(INTEIROS);
      break;
      }
    case LITERAL:{
      jj_consume_token(LITERAL);
      break;
      }
    case TRUE:{
      jj_consume_token(TRUE);
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
      break;
      }
    case LPAREN:{
      jj_consume_token(LPAREN);
      Expressao();
      jj_consume_token(RPAREN);
      break;
      }
    case EXCLAMACAO:{
      jj_consume_token(EXCLAMACAO);
      jj_consume_token(LPAREN);
      Expressao();
      jj_consume_token(RPAREN);
      break;
      }
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Indice() throws ParseException {
    jj_consume_token(LCHAVE);
    jj_consume_token(INTEIROS);
    jj_consume_token(RCHAVE);
}

  final public void IdentificadorFinal() throws ParseException {
    jj_consume_token(IDENTIFICADOR);
}

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_1()); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_3R_ComandoVerifyInicioIsTrue_254_5_2()
 {
    if (jj_scan_token(IS)) return true;
    if (jj_scan_token(TRUE)) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_3R_ComandoVerifyInicioIsTrue_254_5_2()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public FoxtranTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;

  /** Constructor with InputStream. */
  public Foxtran(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Foxtran(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e.getMessage()); }
	 token_source = new FoxtranTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e.getMessage()); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
  }

  /** Constructor. */
  public Foxtran(java.io.Reader stream) {
	 jj_input_stream = new JavaCharStream(stream, 1, 1);
	 token_source = new FoxtranTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new JavaCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new FoxtranTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
  }

  /** Constructor with generated Token Manager. */
  public Foxtran(FoxtranTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(FoxtranTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   return token;
	 }
	 token = oldToken;
	 throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error {
    @Override
    public Throwable fillInStackTrace() {
      return this;
    }
  }
  static private final LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
	 if (jj_scanpos == jj_lastpos) {
	   jj_la--;
	   if (jj_scanpos.next == null) {
		 jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
	   } else {
		 jj_lastpos = jj_scanpos = jj_scanpos.next;
	   }
	 } else {
	   jj_scanpos = jj_scanpos.next;
	 }
	 if (jj_scanpos.kind != kind) return true;
	 if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
	 return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 Token errortok = token.next;
	 int line = errortok.beginLine, column = errortok.beginColumn;
	 String mess = (errortok.kind == 0) ? tokenImage[0] : errortok.image;
	 return new ParseException("Parse error at line " + line + ", column " + column + ".  Encountered: " + mess);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
