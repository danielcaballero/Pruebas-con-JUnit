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
         TestSuite suite=new TestSuite("Pruebas del Parser");
      
         suite.addTest(new TestEval ("testSumaEnterosDaUnEntero"));
         suite.addTest(new TestEval ("testSumaEnteros"));
	 //Aquí añadir más pruebas

         return suite;
      }
   
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
   
   }



