package test.evaluador.Sintaxis;
import junit.framework.*;
import junit.extensions.*;
import java.io.*;
import java.lang.*;

import evaluador.Lexico.*;
import evaluador.Sintaxis.*;

public class TestEval extends TestCase{
   
      public static void main(String args[]) throws Exception{
         junit.textui.TestRunner.run(suite());
      }
      public TestEval (String nombre)throws Exception{
         super(nombre);
      }
   
      public void setUp()throws Exception{
      
      }
   
      public static TestSuite suite() throws Exception{
         TestSuite suite=new TestSuite(TestEval.class); 
         return suite;
      }
   /*INICIO-Conjunto pruebas operadores binarios sobre enteros
   */
      public void testSumaEnterosDaUnEntero()throws Exception{
         String s="2+3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Integer);
      }       
	  
	  public void testSumaEnteros()throws Exception{
         String s="2+3";
		 int res=5;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Integer in = (Integer) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, in.intValue());
      } 
	  
	   public void testRestaEnterosDaUnEntero()throws Exception{
         String s="3-2";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Integer);
      }       
	  
	  public void testRestaEnteros()throws Exception{
         String s="3-2";
		 int res=1;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Integer in = (Integer) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, in.intValue());
      } 
	  
	  	
	   public void testMultiplicaEnterosDaUnEntero()throws Exception{
         String s="3*2";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Integer);
      }       
	  
	  public void testMultiplicaEnteros()throws Exception{
         String s="3*2";
		 int res=6;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Integer in = (Integer) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, in.intValue());
      } 
	  
	  public void testDivideEnterosDaUnEntero()throws Exception{
         String s="6/2";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Integer);
      }       
	  
	  public void testDivideEnteros()throws Exception{
         String s="6/2";
		 int res=3;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Integer in = (Integer) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, in.intValue());
      } 
	  
	  public void testModuloEnterosDaUnEntero()throws Exception{
         String s="6%2";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Integer);
      }       
	  
	  public void testModuloEnteros()throws Exception{
         String s="7%2";
		 int res=1;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Integer in = (Integer) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, in.intValue());
      } 
	  
	  
	  
   /*
   *FIN-Conjunto pruebas operadores binarios sobre enteros
   */
   
    /*
   *INICIO-Conjunto pruebas operadores binarios sobre reales
   */
	  public void testSumaRealesDaUnReal()throws Exception{
         String s="2.0+31.0";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }
	  
	  public void testSumaReales()throws Exception{
         String s="2.9+0.1";
		 double res=3.0;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
	  
	  public void testRestaRealesDaUnReal()throws Exception{
         String s="2.0-31.0";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }
	  
	  public void testRestaReales()throws Exception{
         String s="2.9-0.1";
		 double res=2.8;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
	  
	  public void testMultiplicaRealesDaUnReal()throws Exception{
         String s="2.0*31.0";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }
	  
	  public void testMultiplicaReales()throws Exception{
         String s="2.9*0.1";
		 double res=0.29;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
	  
	    public void testDivideRealesDaUnReal()throws Exception{
         String s="31.0/2.0";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }
	  
	  public void testDivideReales()throws Exception{
         String s="31.0/2.0";
		 double res=15.5;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	
	  
	  public void testExponenciaRealesDaUnReal()throws Exception{
         String s="31.0^2";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }
	  
	  public void testExponenciaReales()throws Exception{
         String s="31.0^2";
		 double res=961;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	
	/*
   *FIN-Conjunto pruebas operadores binarios sobre reales
   */
   	/*
   *INICIO-Conjunto pruebas operadores binarios sobre reales y enteros
   */
	  public void testSumaRealMasEnteroDaUnReal()throws Exception{
         String s="2.0+31";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }

	    public void testSumaRealMasEntero()throws Exception{
         String s="2.0+31";
		 double res=33.0;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
		public void testRestaRealYEnteroDaUnReal()throws Exception{
         String s="2.0-31";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }

	    public void testRestaRealYEntero()throws Exception{
         String s="2.0-31";
		 double res=-29.0;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
	  
	    public void testMultiplicaRealYEnteroDaUnReal()throws Exception{
         String s="2.0*31";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }

	    public void testMultiplicaRealYEntero()throws Exception{
         String s="2.0*31";
		 double res=62.0;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
	  
	  	  
	  public void testDivideRealYEnteroDaUnReal()throws Exception{
         String s="2.0/31";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }

	   public void testDivideRealYEntero()throws Exception{
         String s="95.0/4";
		 double res=23.75;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
	  
	  public void testExponenciaRealYEnteroDaUnReal()throws Exception{
         String s="3.0^2";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }

	   public void testExponenciaRealYEntero()throws Exception{
         String s="2.0^3";
		 double res=8.0;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
	  
	  	  
	  public void testExponenciaEnteroYRealDaUnReal()throws Exception{
         String s="3^2.0";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Object o = AS.Eval ();
	     assertTrue (o instanceof Double);
      }

	   public void testExponenciaEnteroYReal()throws Exception{
         String s="2^3.0";
		 double res=8.0;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
	  
  /*
   *FIN-Conjunto pruebas operadores binarios sobre reales y enteros
   */

	
	
	   /*
	INICIO-Conjunto pruebas operadores unarios sobre reales
	*/
	   public void testMenosUnarioReal()throws Exception{
         String s="-3.0";
		 double res=-3.0;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d = (Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  	 
   /*
	FIN-Conjunto pruebas operadores unarios sobre reales
	*/		 
	
	/*
	INICIO-Conjunto pruebas operadores unarios sobre enteros
	*/
	   public void testMenosUnarioEntero()throws Exception{
         String s="-2";
		 int res=-2;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Integer in = (Integer) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, in.intValue());
      }  	 
	  	 public void testExclamacionUnarioEntero()throws Exception{
         String s="3!";
		 int res=6;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     Integer in = (Integer) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, in.intValue());
      }  	 
   /*
	FIN-Conjunto pruebas operadores unarios sobre enteros
	*/		
	
	
	
	/*
	INICIO-Conjunto pruebas agrupamiento operadores binarios
	*/
		 public void testAgrupaExponentesCorrecto()throws Exception{
         String s="2^3^4";
	     double res=4096.0;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d=(Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  
   
   		 public void testExpresionComplejaTodos()throws Exception{
         String s="(4.5^2+3.1*8+(5!)/5)/2";
	     double res=34.525;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d=(Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  
	    
		public void testExpresionPrioridadesAlReves()throws Exception{
         String s="3-2*5/3^3!";
	     double res=2.9862825788751714677640603566529;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d=(Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  
   

   
	/*
	FIN-Conjunto pruebas agrupamiento operadores binarios
	*/

	/*
	INICIO-Conjunto pruebas agrupamiento operadores por prioridad
	*/
	/*
	FIN-Conjunto pruebas agrupamiento operadores por prioridad
	*/
	
	
	/*
	INICIO-Conjunto pruebas evaluar mas de una expresion
	*/   		 
	public void testEvaluaDosExpresiones()throws Exception{
         String s="(4.5^2+3.1*8+(5!)/5)/2;3-2*5/3^3!";
	     double res=2.9862825788751714677640603566529;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d=(Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  
	    
   
	
	/*
	FIN-Conjunto pruebas evaluar mas de una expresion
	*/
	
		/*
	INICIO-Conjunto pruebas declaracion y asignacion
	*/
	
		public void testAsignaExpresionReal()throws Exception{
         String s="real x;x=3-2*5/3^3!";
	     double res=2.9862825788751714677640603566529;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d=(Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  
	  
	  public void testAsignaExpresionEntera()throws Exception{
         String s="entero x;x=2*3";
	     int res=6;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 ArbolSintactico AS= new ArbolSintactico(p);
	     Integer in = (Integer) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, in.intValue());
		 
      } 
	  
	  public void testDevuelveValorVariableEntera()throws Exception{
         String s="entero x;x=2*3;x";
	     int res=6;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
		 ArbolSintactico AS= new ArbolSintactico(p);
	     Integer in = (Integer) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, in.intValue());
		 
      } 
	  
	  public void testDevuelveValorVariableReal()throws Exception{
         String s="real x;x=3-2*5/3^3!;x";
	     double res=2.9862825788751714677640603566529;
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	     double d=(Double) AS.Eval ();
	     assertEquals ("Evaluo "+s + " y espero " + res, res, d);
      }  
	  
	  public void testAsignaSinDeclararReal()throws Exception{
         String s="x=3-2*5/3^3!";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
		  try {
			double d=(Double) AS.Eval ();
            fail("Deja asignar real sin declarar" );
			} catch (Exception e){      
	      }  
	  }
	  
	  public void testAsignaSinDeclararEntero()throws Exception{
         String s="x=2*3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
		  try {
			Integer in = (Integer) AS.Eval ();
            fail("Deja asignar entero sin declarar" );
			} catch (Exception e){      
	      }  
	  }
	  
	  public void testDeclaraEnteroYaDeclarado()throws Exception{
         String s="entero x;entero x;x=3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
		  try {
			Integer in = (Integer) AS.Eval ();
            fail("Deja declarar dos veces la misma variable entera x: "+in );
			} catch (Exception e){      
	      }  
	  }
	  
	  public void testDeclaraRealYaDeclarado()throws Exception{
         String s="real x;real x;x=3.0";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
		  try {
			double d=(Double) AS.Eval ();
            fail("Deja declarar dos veces la misma variable real x: " +d );
			} catch (Exception e){      
	      }  
	  }
	  
	  public void testDeclaraRealNoInicializado()throws Exception{
         String s="real x;x";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
		  try {
			double d=(Double) AS.Eval ();
            fail("Deja utilizar la variable real x sin inicializar: " +d );
			} catch (Exception e){      
	      }  
	  }
	  
	   public void testDeclaraEnteroNoInicializado()throws Exception{
         String s="entero x;x";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
		  try {
			Integer in = (Integer) AS.Eval ();
            fail("Deja utilizar la variable entera x sin inicializar: "+in );
			} catch (Exception e){      
	      }  
	  } 
	  }
	/*
	FIN-Conjunto pruebas asignacion
	*/

