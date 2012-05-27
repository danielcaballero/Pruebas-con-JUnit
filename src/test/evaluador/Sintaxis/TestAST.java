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
   
      public static TestSuite suite() throws Exception{
         TestSuite suite=new TestSuite("Pruebas del Parser");
      
         suite.addTest(new TestAST ("testASTVacio"));
         suite.addTest(new TestAST ("testSumaEnteros"));
	 //Aquí añadir más pruebas

         return suite;
      }
   
      public void testASTVacio()throws Exception{
         String s="";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	 try {
           ArbolSintactico AS= new ArbolSintactico(p);
	   fail ("Ha construido un AST vacio");
	 } catch (Exception e){
	 }
      }  
      public void testSumaEnteros()throws Exception{
         String s="2+3";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
         ArbolSintactico AS= new ArbolSintactico(p);
	 assertTrue (true);
      }  
   
   }



