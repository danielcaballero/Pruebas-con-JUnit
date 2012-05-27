package test.evaluador;
import junit.framework.*;
import junit.extensions.*;
import java.io.*;
import java.lang.*;

import evaluador.Lexico.*;
import evaluador.Sintaxis.*;

import test.evaluador.Lexico.*;

public class TestEvaluador extends TestCase{
   
      public static void main(String args[]) throws Exception{
         junit.textui.TestRunner.run(suite());
      }
      public TestEvaluador (String nombre)throws Exception{
         super(nombre);
      }
   
      public void setUp()throws Exception{
      
      }
   
      public static TestSuite suite() throws Exception{
         TestSuite suite=new TestSuite("Todas las pruebas");

         suite.addTestSuite(test.evaluador.Lexico.TestParser.class); 
         suite.addTestSuite(test.evaluador.Sintaxis.TestAST.class); 
         suite.addTestSuite(test.evaluador.Sintaxis.TestEval.class); 

         return suite;
      }
   
   
   }



