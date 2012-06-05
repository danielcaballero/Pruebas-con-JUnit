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
         TestSuite suite=new TestSuite(TestParser.class);
         return suite;
      }
	  
	    /*
	    INICIO-Conjunto de pruebas clase MToken
		*/
		/*
		INICIO-Conjunto de pruebas metodo esOperador()
		*/			 
	   public void testOperadorSuma()throws Exception{
         String s="+";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("+ se evalua como operador", test);
     }  
	 	 public void testOperadorResta()throws Exception{
         String s="-";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("- se evalua como operador", test);
     }  
	 	  public void testOperadorMultiplicacion()throws Exception{
         String s="*";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("* se evalua como operador", test);
     }  
	 	  public void testOperadorDivision()throws Exception{
         String s="/";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("/ se evalua como operador", test);
     }  
	 	 public void testOperadorExponente()throws Exception{
         String s="^";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("^ se evalua como operador", test);
     }  
	 	  public void testOperadorModulo()throws Exception{
         String s="%";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("% se evalua como operador", test);
     }  
		 public void testOperadorIgual()throws Exception{
         String s="=";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("=se evalua como operador", test);
     }  
		public void testOperadorParentesis1()throws Exception{
         String s="(";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("( se evalua como operador", test);
     }  
		public void testOperadorParentesis2()throws Exception{
         String s=")";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue(") se evalua como operador", test);
     }  
	 	public void testOperadorExclamacion()throws Exception{
         String s="!";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("! se evalua como operador", test);
     }  	 	
		 public void testOperadorPunto()throws Exception{
         String s=".";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue(". se evalua como operador", test);
     }  
	 	public void testOperadorPuntoYComa()throws Exception{
         String s=";";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 boolean test=tk.esOperador();
         assertTrue("; se evalua como operador", test);
     }  
		/*
		FIN-Conjunto de pruebas metodo esOperador()
		*/
		/*
		INICIO-Conjunto de pruebas metodo linea()
		*/
		public void testPrimeraLineaUnCaracter()throws Exception{
         String s="a";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 int test=tk.linea();
         assertEquals("Probando  " + test, test,1);
     }  
	 	public void testPrimeraLineaVariosCaracter()throws Exception{
         String s="abc";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 tk = (MToken)p.nextElement();
		 int test=tk.linea();
        assertEquals("Probando " + test, test,1);
     }  
		public void testSegundaLineaUnCaracter()throws Exception{
         String s="\na";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 tk = (MToken)p.nextElement();
		 int test=tk.linea();
         assertEquals("Probando " + test, test,2);
     }  
		public void testSegundaLineaVariosCaracteres()throws Exception{
         String s="a\na";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 tk = (MToken)p.nextElement();
		 int test=tk.linea();
         assertEquals("Probando " + test, test,2);
     }  
		/*
		FIN-Conjunto de pruebas metodo linea()
		*/
		/*
		INICIO-Conjunto de pruebas metodo posLinea()
		*/
		public void testPrimerCaracterDeLinea()throws Exception{
         String s="abc";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 tk = (MToken)p.nextElement();
		 int test=tk.posLinea();
        assertEquals("Probando " + test, test,0);
     }  
	 
		public void testPrimerCaracterDeLineaSalto()throws Exception{
         String s="abc";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
		 tk = (MToken)p.nextElement();
		 int test=tk.posLinea();
        assertEquals("Probando " + test, test,0);
     }  
		/*
		FIN-Conjunto de pruebas metodo posLinea()
		*/
		/*
		INICIO-Conjunto de pruebas metodo prioridad()
		*/
		public void testPrioridad() throws Exception{
		String s="!^-*/%=";
		Reader fis = new StringReader(s);
        Parser p = new Parser (fis);

		MToken tk1 = (MToken)p.nextElement();
		MToken tk2 = (MToken)p.nextElement();
		MToken tk3 = (MToken)p.nextElement();
		MToken tk4 = (MToken)p.nextElement();
		MToken tk5 = (MToken)p.nextElement();
		MToken tk6 = (MToken)p.nextElement();
		MToken tk7 = (MToken)p.nextElement();
	
		boolean test1=(tk1.prioridad()>tk2.prioridad())&&(tk2.prioridad()>tk3.prioridad())&&(tk3.prioridad()>tk4.prioridad())&&(tk4.prioridad()==tk5.prioridad()&&(tk6.prioridad()>tk7.prioridad()));
        assertTrue("Probando la prioridad de los operadores",test1);
		}
		
		
		/*
		FIN-Conjunto de pruebas metodo prioridad()
		*/
      public void testSacarSiNoHay()throws Exception{
         String s="";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
	 try {
		 tk = (MToken)p.nextElement();
	     tk = (MToken)p.nextElement();
            fail("Más Tokens de los que debería" );
	 } catch (Exception e){      
		}
     }  
	 
	  public void testSiguienteSiNoHay()throws Exception{
         String s="";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 boolean test=p.hasMoreElements();
         assertFalse("Probando si no hay mas elementos", test);
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
	  
	public void testCaracterÑMin ()throws Exception{ 
         String s="ñ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	     MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_IDENTIFICADOR );
      }
	  
	public void testCaracterÑMay ()throws Exception{ 
         String s="Ñ";
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
		INICIO-Conjunto de pruebas lexicas reales
		*/
		/*
		FIN-Conjunto de pruebas lexicas reales
		*/
		

		/*
		INICIO-Conjunto de pruebas lexicas identificador
		*/
			    /*
		FIN-Conjunto de pruebas lexicas identificador
		*/
		
		
		
		/*
		INICIO-Conjunto de caracteres no permitidos(ISO latin 1)
		*/
      public void testIncorrectoCaracterIso1()throws Exception{
         String s="\"";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso2()throws Exception{
         String s="#";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso3()throws Exception{
         String s="$";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso4()throws Exception{
         String s="&";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }
	 
      public void testIncorrectoCaracterIso5()throws Exception{
         String s="'";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso6()throws Exception{
         String s=",";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso7()throws Exception{
         String s=":";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso8()throws Exception{
         String s="<";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }

      public void testIncorrectoCaracterIso9()throws Exception{
         String s=">";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso10()throws Exception{
         String s="?";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso11()throws Exception{
         String s="@";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso12()throws Exception{
         String s="[";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }
	 
      public void testIncorrectoCaracterIso13()throws Exception{
         String s="\\";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso14()throws Exception{
         String s="]";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso15()throws Exception{
         String s="_";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso16()throws Exception{
         String s="`";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }

      public void testIncorrectoCaracterIso17()throws Exception{
         String s="{";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso18()throws Exception{
         String s="|";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso19()throws Exception{
         String s="}";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso20()throws Exception{
         String s="~";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }
	 
      public void testIncorrectoCaracterIso21()throws Exception{
         String s="¢";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso22()throws Exception{
         String s="£";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso23()throws Exception{
         String s="¤";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso24()throws Exception{
         String s="¥";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }

      public void testIncorrectoCaracterIso25()throws Exception{
         String s="¦";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso26()throws Exception{
         String s="§";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso27()throws Exception{
         String s="¨";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso28()throws Exception{
         String s="©";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }
	 
      public void testIncorrectoCaracterIso29()throws Exception{
         String s="ª";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso30()throws Exception{
         String s="«";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso31()throws Exception{
         String s="¬";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso32()throws Exception{
         String s="-";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso33()throws Exception{
         String s="®";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso34()throws Exception{
         String s="¯";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso35()throws Exception{
         String s="°";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso36()throws Exception{
         String s="±";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }
	 
      public void testIncorrectoCaracterIso37()throws Exception{
         String s="²";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso38()throws Exception{
         String s="³";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso39()throws Exception{
         String s="´";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso40()throws Exception{
         String s="µ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }

      public void testIncorrectoCaracterIso41()throws Exception{
         String s="[";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso42()throws Exception{
         String s="¶";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso43()throws Exception{
         String s="·";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso44()throws Exception{
         String s="¸";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }
	 
      public void testIncorrectoCaracterIso45()throws Exception{
         String s="¹";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso46()throws Exception{
         String s="º";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso47()throws Exception{
         String s="»";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso48()throws Exception{
         String s="¼";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }

      public void testIncorrectoCaracterIso49()throws Exception{
         String s="½";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso50()throws Exception{
         String s="¾";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCorcheteAbierto()throws Exception{
         String s="¿";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso52()throws Exception{
         String s="À";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }
	 
      public void testIncorrectoCaracterIso53()throws Exception{
         String s="Á";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso54()throws Exception{
         String s="Â";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso55()throws Exception{
         String s="Ã";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso56()throws Exception{
         String s="Ä";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }

      public void testIncorrectoCaracterIso57()throws Exception{
         String s="Å";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso58()throws Exception{
         String s="Æ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso59()throws Exception{
         String s="Ç";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso60()throws Exception{
         String s="È";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }
	 
      public void testIncorrectoCaracterIso61()throws Exception{
         String s="É";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
	  public void testIncorrectoCaracterIso62()throws Exception{
         String s="Ê";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      } 
	  
      public void testIncorrectoCaracterIso63()throws Exception{
         String s="Ë";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso64()throws Exception{
         String s="Ì";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso65()throws Exception{
         String s="Í";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso66()throws Exception{
         String s="Î";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso67()throws Exception{
         String s="Ï";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso68()throws Exception{
         String s="Ð";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso69()throws Exception{
         String s="Ñ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso70()throws Exception{
         String s="Ò";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso71()throws Exception{
         String s="Ó";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso72()throws Exception{
         String s="Ô";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso73()throws Exception{
         String s="Õ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso74()throws Exception{
         String s="Ö";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso75multiplicacion()throws Exception{
         String s="×";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso76()throws Exception{
         String s="Ø";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso77()throws Exception{
         String s="Ù";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso78()throws Exception{
         String s="Ú";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso79()throws Exception{
         String s="Û";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso80()throws Exception{
         String s="Ü";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso81()throws Exception{
         String s="Ý";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso82()throws Exception{
         String s="Þ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso83()throws Exception{
         String s="ß";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso84()throws Exception{
         String s="à";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso85()throws Exception{
         String s="á";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso87()throws Exception{
         String s="â";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso88()throws Exception{
         String s="ã";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso89()throws Exception{
         String s="ä";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso90()throws Exception{
         String s="å";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso91()throws Exception{
         String s="æ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso92()throws Exception{
         String s="ç";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso93()throws Exception{
         String s="è";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso94()throws Exception{
         String s="é";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso95()throws Exception{
         String s="ê";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso96()throws Exception{
         String s="ë";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso97()throws Exception{
         String s="ì";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso98()throws Exception{
         String s="í";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso99()throws Exception{
         String s="î";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso100()throws Exception{
         String s="ï";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso101()throws Exception{
         String s="ð";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso102()throws Exception{
         String s="ñ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso103()throws Exception{
         String s="ò";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso104()throws Exception{
         String s="ó";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso105()throws Exception{
         String s="ô";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso106()throws Exception{
         String s="õ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso107()throws Exception{
         String s="ö";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso108()throws Exception{
         String s="÷";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso109()throws Exception{
         String s="ø";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso110()throws Exception{
         String s="ù";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso112()throws Exception{
         String s="ú";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso113()throws Exception{
         String s="û";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso114()throws Exception{
         String s="ü";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso115()throws Exception{
         String s="ý";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  
      public void testIncorrectoCaracterIso116()throws Exception{
         String s="þ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  

      public void testIncorrectoCaracterIso117()throws Exception{
         String s="ÿ";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
	  

		/*
		FIN-Conjunto de caracteres no permitidos(ISO latin 1)
		*/
   
   }



