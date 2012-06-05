package test.evaluador.Sintaxis;
import junit.framework.*;
import junit.extensions.*;
import java.io.*;
import java.lang.*;

import evaluador.Lexico.*;
import evaluador.Sintaxis.*;

public class TestAST extends TestCase{

      public static void main(String args[]) throws Exception{
         junit.textui.TestRunner.run(suite());
      }
      public TestAST (String nombre)throws Exception{
         super(nombre);
      }

      public void setUp()throws Exception{

      }

      public static TestSuite suite () throws Exception{
         TestSuite suite=new TestSuite(TestAST.class);
         return suite;
      }

      public void testASTVacio ()throws Exception{
         String s="";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	 try {
      ArbolSintactico AS= new ArbolSintactico(p);
	   fail ("Ha construido un AST vacio");
	 } catch (Exception e){
	 }
      }
      public void testSumaEnteros ()throws Exception{
         String s="2+3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
		   assertTrue ("Se comprueba " + s, AS.chequeoSemantico());
      }

      public void testchequeoFaltaOp () throws Exception{
         String s="3*";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);

         try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testchequeoFaltaParentesis () throws Exception{
         String s="(2+7";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testchequeoFaltaParentesisGrupo () throws Exception{
         String s="6/(2+5";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testsobraParent() throws Exception{
         String s="(()2+6)*5";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testvariosOpSeguidos() throws Exception{
         String s="4+*";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testsobraOperadorIncremento() throws Exception{
         String s="7+++";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testfaltanParam() throws Exception{
         String s="5!6";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testfaltanParamOr() throws Exception{
         String s="3^";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testParentesisBienColocados() throws Exception{
         String s="7*(2+5)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba " + s, as.chequeoSemantico());
      }

      public void testParentesisNoOP() throws Exception{
         String s="7(2+5)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testParentesisComplementarios() throws Exception{
         String s="(29+3)*(3+3)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba " + s, as.chequeoSemantico());
      }

      public void testParentesisComplementariosnoOP() throws Exception{
         String s="(29+3)(3+3)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testParentesisComplementariosnoPar() throws Exception{
         String s="(29+3)+(3+39";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testNofinSentencia() throws Exception{
         String s="(29+3);*(3+3)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testNofinSentenciaOperador() throws Exception{
         String s="(29+;3)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testPalabraReservadaIntOp() throws Exception{
         String s="(29+int)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertFalse ("Se comprueba " + s, as.chequeoSemantico());
      }

      public void testSumaDouble()throws Exception{
         String s="5.5+7.8";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
         assertTrue ("Se comprueba " + s, AS.chequeoSemantico());
      }

      public void testDoublechequeoFaltaOp() throws Exception{
         String s="3.7*";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublechequeoFaltaParentesis() throws Exception{
         String s="(6.6+7.7";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublechequeoFaltaParentesisGrupo() throws Exception{
         String s="6.5/(2.7+5.7";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublesobraParent() throws Exception{
         String s="(()2.4+6.5)*5.3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublevariosOpSeguidos() throws Exception{
         String s="4.5+*";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublesobraOperadorIncremento() throws Exception{
         String s="7.2+++";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublefaltanParam() throws Exception{
         String s="5.3!6.4";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublefaltanParamOr() throws Exception{
         String s="3.2^";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleParentesisBienColocados() throws Exception{
         String s="7.4*(22.2+4.4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba " + s, as.chequeoSemantico());
      }

      public void testDoubleParentesisNoOP() throws Exception{
         String s="7.2(2.3+5.3)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleParentesisComplementarios() throws Exception{
         String s="(29.4+3.4)*(3.2+4.4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba " + s, as.chequeoSemantico());
      }

      public void testDoubleParentesisComplementariosnoOP() throws Exception{
         String s="(4.2+9.0)(3.0+3.2)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleParentesisComplementariosnoPar() throws Exception{
         String s="(29.2+3.2)+(3.3+39.3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleNofinSentencia() throws Exception{
         String s="(5.5+8.8);*(4.4+7.7)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleNofinSentenciaOperador() throws Exception{
         String s="(333.3+;2.2)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublePalabraReservadaIntOp() throws Exception{
         String s="(29.3+int)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertFalse ("Se comprueba " + s, as.chequeoSemantico());
      }

      public void testDoublePuntoDoubleSobra() throws Exception{
         String s="(29..3+4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testSumaIntyDouble() throws Exception{
         String s="2.5+3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
         assertTrue ("Se comprueba " + s, AS.chequeoSemantico());
      }

      public void testDoubleSobraDecimal() throws Exception{
         String s="(29.4.3+4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleFaltaDecimal() throws Exception{
         String s="(29.+4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleFaltaEntero() throws Exception{
         String s="(.5+4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testTresOpSeguidos() throws Exception{
         String s="3***5";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testCuatroOpSeguidos() throws Exception{
         String s="3****5";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleTresOpSeguidos() throws Exception{
         String s="4.4***7.7";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleCuatroOpSeguidos() throws Exception{
         String s="3.4****2.2";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublePuntoError() throws Exception{
         String s="(4,6+4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublePuntoErrorComilla() throws Exception{
         String s="(4'6+4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublePuntoErrorTriplepunto() throws Exception{
         String s="(6...5+4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoublePuntoErrorBarra() throws Exception{
         String s="(4_6+4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testNombreVarError() throws Exception{
         String s="4a+5";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testDoubleNombreVarError() throws Exception{
         String s="4.3a+5";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
             as.chequeoSemantico();
            fail("Se comprueba " + s);
         } catch (Exception e){
         }
      }

      public void testParentesisNoNecesarios() throws Exception{
         String s="(6+4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testParentesisNoNecesarios2() throws Exception{
         String s="((6+4))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testParentesisNoNecesarios3() throws Exception{
         String s="(((6+4)))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testParentesisNoNecesarios4() throws Exception{
         String s="(6+4)*(7)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testParentesisNoNecesarios5() throws Exception{
         String s="(6+4)+3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         try{
            ArbolSintactico as= new ArbolSintactico(p);
            fail("Se comprueba que " + s + "tiene más paréntesis que " + as.toString());
         }catch (Exception e){
         }
      }

      public void testParentesisNoNecesarios6() throws Exception{
         String s="(6+4) + 5";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
            fail("Se comprueba que " + s + "tiene más paréntesis que " + as.toString());
         }catch (Exception e){
         }
      }

       public void testParentesisNoNecesarios7() throws Exception{
         String s="(6*4)/8";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testParentesisNoNecesarios8() throws Exception{
         String s="(64)+5";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
            fail("Se comprueba que " + s + "tiene más paréntesis que " + as.toString());
         }catch (Exception e){
         }
      }

      public void testParentesisNoNecesarios9() throws Exception{
         String s="(66*4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testDoubleParentesisNoNecesarios() throws Exception{
         String s="(5.5+4.6)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testDoubleParentesisNoNecesarios2() throws Exception{
         String s="((6.6+4.4))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testDoubleParentesisNoNecesarios3() throws Exception{
         String s="(((2.2+1.1)))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testDoubleParentesisNoNecesarios4() throws Exception{
         String s="(1.1+2.2)*(5.5)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testDoubleParentesisNoNecesarios5() throws Exception{
         String s="(3.3-1.1)+3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
            fail("Se comprueba que " + s + "tiene más paréntesis que " + as.toString());
         }catch (Exception e){
         }
      }

      public void testDoubleParentesisNoNecesarios6() throws Exception{
         String s="(6.3+4.3)-5.1";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
            fail("Se comprueba que " + s + "tiene más paréntesis que " + as.toString());
         }catch (Exception e){
         }
      }

       public void testDoubleParentesisNoNecesarios7() throws Exception{
         String s="(6.1*1.0)/8.1";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testDoubleParentesisNoNecesarios8() throws Exception{
         String s="(64.2)+1.1";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
        try{
            ArbolSintactico as= new ArbolSintactico(p);
            fail("Se comprueba que " + s + "tiene más paréntesis que " + as.toString());
         }catch (Exception e){
         }
      }

      public void testDoubleParentesisNoNecesarios9() throws Exception{
         String s="(2.2*11.1)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertTrue ("Se comprueba que " + s + "tiene más paréntesis", as.toString() != s);
      }

      public void testParentesisNecesariosSuma() throws Exception{
         String s="((6+4)*2)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         System.out.println(as.toString());
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosDivision() throws Exception{
         String s="((6+4)/2)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosMultiplicacion() throws Exception{
         String s="(5*(6+4))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosDivisionPrev() throws Exception{
         String s="(1/(6+4))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosSuma() throws Exception{
         String s="((1.2+4.3)*2.6)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosDivision() throws Exception{
         String s="((2.2+5.7)/8.8)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosMultiplicacion() throws Exception{
         String s="(5.2*(6.2+1.1))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosDivisionPrev() throws Exception{
         String s="(1.3/(2.3+3.3))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosSumaGrupo() throws Exception{
         String s="((6+4)*(2+3))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosDivisionGrupo() throws Exception{
         String s="((6+4)/(2-1))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosMultiplicacionGrupo() throws Exception{
         String s="((7-2)*(6+4))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosDivisionGrupo2() throws Exception{
         String s="(2/(6+4)/(3+3))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosSumaGrupo() throws Exception{
         String s="((1.2+4.3)*(2.6+0.1))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosDivisionGrupo() throws Exception{
         String s="((2.2+5.7)/(8.8-1.2))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosMultiplicacionGrupo() throws Exception{
         String s="(5.2*(6.2+1.1)*(7-2))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosDivisionPrevGrupo() throws Exception{
         String s="(1.3/(2.3+3.3)/(2.3-0.1))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosSumaGrupo2() throws Exception{
         String s="((6+4)*3+(2+3))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosDivisionGrupo4() throws Exception{
         String s="((6+4)*4/(2-1))";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosMultiplicacionGrupo2() throws Exception{
         String s="((7-2)*(6+4)*3)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testParentesisNecesariosDivisionGrupo3() throws Exception{
         String s="(2/(6+4)/(3+3)*2^3)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosSumaGrupo2() throws Exception{
         String s="((1.2+4.3)*(2.6+0.1)-5)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosDivisionGrupo2() throws Exception{
         String s="((2.2+5.7)/(8.8-1.2)*4.4)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosMultiplicacionGrupo2() throws Exception{
         String s="(5.2*(6.2+1.1)*(7-2)/6.6)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

      public void testDoubleParentesisNecesariosDivisionPrevGrupo2() throws Exception{
         String s="(1.3/(2.3+3.3)/(2.3-0.1)*5.5)";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico as= new ArbolSintactico(p);
         assertEquals ("Se comprueba que " + s + "tiene los paréntesis necesarios", as.toString(), s);
      }

   }



