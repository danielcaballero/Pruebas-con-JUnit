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
	 //Aquí añadir más pruebas

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
            fail("Más Tokens de los que debería" );
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
      public void testENTERO()throws Exception{
         String s="23";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ENTERO );
      }  

      public void testENTEROPalabraReservada()throws Exception{
         String s="entero";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_TIPO_ENTERO );
      }  

      public void testREAL()throws Exception{
         String s="23.0";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_REAL );
      }  

      public void testIncorrectoCorcheteAbierto()throws Exception{
         String s="[";
         Reader fis = new StringReader(s);
         Parser p = new Parser (fis);
	 MToken tk = (MToken)p.nextElement();
         assertEquals("Probando " + s, tk.tipo(),MToken.TK_ERROR );
      }  
   
   
   }



