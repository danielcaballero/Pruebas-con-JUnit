package test.evaluador.Lexico;
import junit.framework.*;
import junit.extensions.*;
import java.io.*;
import java.lang.*;
import evaluador.Lexico.*;
import evaluador.Sintaxis.*;

public class TestParser extends TestCase{
   
      public static void main(String args[]) throws Exception{
         junit.textui.TestRunner.run(suite());
      }
      public TestParser (String nombre)throws Exception{
         super(nombre);
      }
   
      public void setUp()throws Exception{
      
      }
   
      public static TestSuite suite() throws Exception{
         TestSuite suite=new TestSuite("Pruebas del Parser");
         suite.addTest(new TestParser ("testSacarSiNoHay"));
         suite.addTest(new TestParser ("testNoToken"));
         suite.addTest(new TestParser ("testENTERO"));
         suite.addTest(new TestParser ("testREAL"));
         suite.addTest(new TestParser ("testENTEROPalabraReservada"));
         suite.addTest(new TestParser ("testIncorrectoCorcheteAbierto"));
	 

         return suite;
      }
   
      public void testSacarSiNoHay()throws Exception{
         String s="";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
	 try {
		 tk = (MToken)p.nextElement();
	     tk = (MToken)p.nextElement();
            fail("M·s Tokens de los que deberÌa" );
	 } catch (Exception e){      
		}
     }  

      public void testNoToken()throws Exception{
         String s="";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_FIN_DE_ENTRADA );
      }  
	  

	 public void testREAL()throws Exception{
         String s="23.0";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_REAL );
      }

      public void testENTEROPalabraReservada()throws Exception{
         String s="entero";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_TIPO_ENTERO );
      } 
	
      public void testREALPalabraReservada ()throws Exception{ 
         String s="real";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_TIPO_REAL );
      }
		/*
		Conjunto de pruebas simbolos del alfabeto
		*/
	public void testCaracterAMin ()throws Exception{ 
         String s="a";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterAMay ()throws Exception{ 
         String s="A";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	
	public void testCaracterBMin ()throws Exception{ 
         String s="b";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterBMay ()throws Exception{ 
         String s="B";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterCMin ()throws Exception{ 
         String s="c";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterCMay ()throws Exception{ 
         String s="C";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterDMin ()throws Exception{ 
         String s="d";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	
	public void testCaracterDMay ()throws Exception{ 
         String s="D";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	
	public void testCaracterEMin ()throws Exception{ 
         String s="e";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterEMay ()throws Exception{ 
         String s="E";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterFMin ()throws Exception{ 
         String s="f";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterFMay ()throws Exception{ 
         String s="F";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }

	public void testCaracterGMin ()throws Exception{ 
         String s="g";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterGMay ()throws Exception{ 
         String s="G";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterHMin ()throws Exception{ 
         String s="h";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterHMay ()throws Exception{ 
         String s="H";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }

	public void testCaracterIMin ()throws Exception{ 
         String s="i";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterIMay ()throws Exception{ 
         String s="I";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	
	public void testCaracterJMin ()throws Exception{ 
         String s="j";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterJMay ()throws Exception{ 
         String s="J";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterKMin ()throws Exception{ 
         String s="k";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterKMay ()throws Exception{ 
         String s="K";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterLMin ()throws Exception{ 
         String s="l";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	
	public void testCaracterLMay ()throws Exception{ 
         String s="L";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	
	public void testCaracterMMin ()throws Exception{ 
         String s="m";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterMMay ()throws Exception{ 
         String s="M";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracter—Min ()throws Exception{ 
         String s="Ò";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracter—May ()throws Exception{ 
         String s="—";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }

	public void testCaracterOMin ()throws Exception{ 
         String s="o";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterOMay ()throws Exception{ 
         String s="O";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterPMin ()throws Exception{ 
         String s="p";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterPMay ()throws Exception{ 
         String s="P";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }	  

	  	public void testCaracterQMin ()throws Exception{ 
         String s="q";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterQMay ()throws Exception{ 
         String s="Q";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	
	public void testCaracterRMay ()throws Exception{ 
         String s="R";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterRMin ()throws Exception{ 
         String s="r";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterSMay ()throws Exception{ 
         String s="S";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterSMin ()throws Exception{ 
         String s="s";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	
	public void testCaracterTMay ()throws Exception{ 
         String s="T";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	
	public void testCaracterTMin ()throws Exception{ 
         String s="t";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterUMay ()throws Exception{ 
         String s="U";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterUMin ()throws Exception{ 
         String s="u";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterVMay ()throws Exception{ 
         String s="V";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }

	public void testCaracterVMin ()throws Exception{ 
         String s="v";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterXMay ()throws Exception{ 
         String s="X";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterXMin ()throws Exception{ 
         String s="x";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterYMay ()throws Exception{ 
         String s="Y";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterYMin ()throws Exception{ 
         String s="y";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterZMay ()throws Exception{ 
         String s="Z";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }

	public void testCaracterZMin ()throws Exception{ 
         String s="z";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracter0 ()throws Exception{ 
         String s="0";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }

	public void testCaracter1 ()throws Exception{ 
         String s="1";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }
	  
	public void testCaracter2 ()throws Exception{ 
         String s="2";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }
	  
	public void testCaracter3 ()throws Exception{ 
         String s="3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }
	  
	public void testCaracter4 ()throws Exception{ 
         String s="4";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }
	  
	public void testCaracter5 ()throws Exception{ 
         String s="5";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }
	  
	public void testCaracter6 ()throws Exception{ 
         String s="6";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }

	public void testCaracter7 ()throws Exception{ 
         String s="7";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }

	public void testCaracter8 ()throws Exception{ 
         String s="8";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }

	public void testCaracter9 ()throws Exception{ 
         String s="9";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }
	  
	public void testCaracterAbreParentesis ()throws Exception{ 
         String s="(";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ABRE_PARENTESIS);
      }

	public void testCaracterCierraParentesis ()throws Exception{ 
         String s=")";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_CIERRA_PARENTESIS );
      }
	  
	public void testCaracterSuma ()throws Exception{ // da MToken=13
         String s="+";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_SUMA );
      }

	public void testCaracterResta ()throws Exception{ 
         String s="-";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_MENOS_UNARIO );
      }
	  
	public void testCaracterAsterisco ()throws Exception{ 
         String s="*";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_MULTIPLICACION );
      }
	  
	public void testCaracterSlash ()throws Exception{ 
         String s="/";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_DIVISION );
      }
	  
	public void testCaracterModulo ()throws Exception{ 
         String s="%";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_MODULO );
      }
	  
	public void testCaracterCircunflejo ()throws Exception{ 
         String s="^";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_EXPONENCIACION );
      }
	  
	public void testCaracterCierraExclamacion ()throws Exception{ 
         String s="!";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_FACTORIAL);
      }

	public void testCaracterIgual ()throws Exception{ 
         String s="=";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ASIGNACION );
      }

	public void testCaracterPunto ()throws Exception{ 
         String s=".";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }
	  
	public void testCaracterPuntoYComa ()throws Exception{ 
         String s=";";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_PUNTO_Y_COMA );
      }
	  
	public void testCaracterBarraN ()throws Exception{ 
         String s="\n";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_FIN_DE_ENTRADA );
      }

	public void testCaracterBarraT ()throws Exception{ 
         String s="\t";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_FIN_DE_ENTRADA );
      }

	public void testCaracterBarraR ()throws Exception{ 
         String s="\r";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_FIN_DE_ENTRADA );
      }

	public void testCaracterEspacio ()throws Exception{ 
         String s=" ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
		 assertEquals("Probando " + s, tk.tipo(),MToken.TK_FIN_DE_ENTRADA );
      }

	  
	  /*
		FIN-Conjunto de pruebas simbolos del alfabeto
		*/
		
	  /*
		INICIO-Conjunto de pruebas lexicas enteros
		*/
      public void testENTERO()throws Exception{
         String s="23";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }  
	  
	  public void testMaxENTERO()throws Exception{
         String s=Integer.toString(Integer.MAX_VALUE);
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }  
	  
	  public void testMinENTERO()throws Exception{
         String s=Integer.toString(Integer.MIN_VALUE);
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }  
	  
	    /*
		FIN-Conjunto de pruebas lexicas enteros
		*/
		
		/*
		INICIO-Conjunto de caracteres no permitidos
		*/
      public void testIncorrectoCorcheteAbierto()throws Exception{
         String s="[";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
		/*
		FIN-Conjunto de caracteres no permitidos
		*/
   
   }



