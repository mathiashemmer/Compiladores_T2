/* FoxtranTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. FoxtranTokenManager.java */
package hmm.mathias.compiler;

/** Token Manager. */
public class FoxtranTokenManager implements FoxtranConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 5;
         return jjMoveNfa_0(0, 0);
      case 10:
         jjmatchedKind = 2;
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 12:
         jjmatchedKind = 6;
         return jjMoveNfa_0(0, 0);
      case 13:
         jjmatchedKind = 3;
         return jjMoveNfa_0(0, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(0, 0);
      case 33:
         jjmatchedKind = 37;
         return jjMoveStringLiteralDfa1_0(0x2000000000000L);
      case 37:
         jjmatchedKind = 44;
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 38:
         jjmatchedKind = 46;
         return jjMoveNfa_0(0, 0);
      case 40:
         jjmatchedKind = 27;
         return jjMoveNfa_0(0, 0);
      case 41:
         jjmatchedKind = 28;
         return jjMoveNfa_0(0, 0);
      case 42:
         jjmatchedKind = 40;
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 43:
         jjmatchedKind = 38;
         return jjMoveNfa_0(0, 0);
      case 44:
         jjmatchedKind = 34;
         return jjMoveNfa_0(0, 0);
      case 45:
         jjmatchedKind = 39;
         return jjMoveNfa_0(0, 0);
      case 46:
         jjmatchedKind = 35;
         return jjMoveNfa_0(0, 0);
      case 47:
         jjmatchedKind = 42;
         return jjMoveNfa_0(0, 0);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x10000000000000L);
      case 59:
         jjmatchedKind = 33;
         return jjMoveNfa_0(0, 0);
      case 60:
         jjmatchedKind = 51;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 61:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 62:
         jjmatchedKind = 50;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x200100L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 71:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x1200L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x40080L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x2400000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x1000400L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 91:
         jjmatchedKind = 31;
         return jjMoveNfa_0(0, 0);
      case 93:
         jjmatchedKind = 32;
         return jjMoveNfa_0(0, 0);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x200100L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x1200L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x40080L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x2400000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000400L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 123:
         jjmatchedKind = 29;
         return jjMoveNfa_0(0, 0);
      case 124:
         jjmatchedKind = 47;
         return jjMoveNfa_0(0, 0);
      case 125:
         jjmatchedKind = 30;
         return jjMoveNfa_0(0, 0);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 0);
   }
   switch(curChar)
   {
      case 13:
         if ((active0 & 0x10L) != 0L)
         {
            jjmatchedKind = 4;
            jjmatchedPos = 1;
         }
         break;
      case 37:
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 1;
         }
         break;
      case 42:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 1;
         }
         break;
      case 45:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 1;
         }
         break;
      case 61:
         if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x1000000000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x2000000000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 1;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x4001400L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x1822100L);
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x104000L);
      case 79:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x88200L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000080L);
      case 83:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 1;
         }
         break;
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 88:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4001400L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1822100L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x104000L);
      case 111:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x88200L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000080L);
      case 115:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 1;
         }
         break;
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 1);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x6000L);
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 70:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x88080L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000400L);
      case 84:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x6000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x88080L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000400L);
      case 116:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 2);
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 69:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 3;
         }
         break;
      case 71:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000500L);
      case 76:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x108000L);
      case 80:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 3;
         }
         break;
      case 82:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 3;
         }
         break;
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 101:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 3;
         }
         break;
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000500L);
      case 108:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x108000L);
      case 112:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 3;
         }
         break;
      case 114:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 3;
         }
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 3);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 69:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 70:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 78:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x1080L);
      case 85:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 101:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 102:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x1080L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 4);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 4);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x9080L);
      case 66:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 69:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 5;
         }
         break;
      case 84:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 89:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 5;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x9080L);
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 101:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 5;
         }
         break;
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 121:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 5);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 5);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 6;
         }
         break;
      case 76:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      case 77:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 6;
         }
         break;
      case 78:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 6;
         }
         break;
      case 101:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 6;
         }
         break;
      case 108:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      case 109:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 6;
         }
         break;
      case 110:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 6;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 6);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 6);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 7;
         }
         break;
      case 101:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 7;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 7);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 32;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 54)
                        kind = 54;
                     { jjCheckNAddStates(0, 2); }
                  }
                  else if (curChar == 35)
                     { jjCheckNAddStates(3, 5); }
                  else if (curChar == 39)
                     { jjCheckNAddTwoStates(6, 7); }
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 3:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 4:
                  if (curChar == 34 && kind > 56)
                     kind = 56;
                  break;
               case 5:
                  if (curChar == 39)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 6:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 7:
                  if (curChar == 39 && kind > 56)
                     kind = 56;
                  break;
               case 9:
                  if (curChar == 35)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 10:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 11:
                  if ((0x2400L & l) != 0L && kind > 59)
                     kind = 59;
                  break;
               case 12:
                  if (curChar == 10 && kind > 59)
                     kind = 59;
                  break;
               case 13:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 35)
                     { jjCheckNAddTwoStates(15, 16); }
                  break;
               case 15:
                  if ((0xfffffff7ffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(15, 16); }
                  break;
               case 16:
                  if (curChar == 35)
                     { jjCheckNAddStates(6, 8); }
                  break;
               case 17:
               case 18:
                  if ((0xfffffff7ffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(18, 16); }
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 22:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) != 0L && kind > 55)
                     kind = 55;
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(9, 12); }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAdd(22); }
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(27, 22); }
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(13, 15); }
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L && kind > 54)
                     kind = 54;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 53)
                        kind = 53;
                     { jjCheckNAdd(1); }
                  }
                  else if (curChar == 64)
                     jjstateSet[jjnewStateCnt++] = 14;
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 57)
                        kind = 57;
                  }
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  { jjCheckNAdd(1); }
                  break;
               case 3:
                  { jjAddStates(16, 17); }
                  break;
               case 6:
                  { jjAddStates(18, 19); }
                  break;
               case 8:
                  if ((0x7fffffe07fffffeL & l) != 0L && kind > 57)
                     kind = 57;
                  break;
               case 10:
                  { jjAddStates(3, 5); }
                  break;
               case 15:
                  { jjCheckNAddTwoStates(15, 16); }
                  break;
               case 17:
                  if ((0xfffffffffffffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(18, 16); }
                  break;
               case 18:
                  { jjCheckNAddTwoStates(18, 16); }
                  break;
               case 19:
                  if (curChar == 64 && kind > 60)
                     kind = 60;
                  break;
               case 20:
                  if (curChar == 64)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(16, 17); }
                  break;
               case 6:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(18, 19); }
                  break;
               case 10:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(3, 5); }
                  break;
               case 15:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(15, 16); }
                  break;
               case 17:
               case 18:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(18, 16); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 32 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
"\50", "\51", "\173", "\175", "\133", "\135", "\73", "\54", "\56", "\74\75", "\41", 
"\53", "\55", "\52", "\76\75", "\57", "\52\52", "\45", "\45\45", "\46", "\174", 
"\75\75", "\41\75", "\76", "\74", "\72\55", null, null, null, null, null, null, null, 
null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   22, 26, 30, 10, 11, 13, 17, 16, 19, 27, 22, 28, 29, 27, 22, 28, 
   3, 4, 6, 7, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public FoxtranTokenManager(JavaCharStream stream){

      if (JavaCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public FoxtranTokenManager (JavaCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(JavaCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 32; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(JavaCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7ffffffffffff81L, 
};
static final long[] jjtoSkip = {
   0x180000000000007eL, 
};
static final long[] jjtoSpecial = {
   0x1800000000000000L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected JavaCharStream  input_stream;

    private final int[] jjrounds = new int[32];
    private final int[] jjstateSet = new int[2 * 32];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
