//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java 
//


import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.security.InvalidParameterException;

public class EmbotelladoraTests
{

   private int b_p;  
   private int b_g;
   private int litros;

   //TEST PARA ALGÚN NÚMERO NEGATIVO

    //test que implementa la caracterización del bloque b1.1, b2.1 y b3.1
   @Test
   public void test_b11_b21_b31()
   {
   	b_p = -4;
   	b_g = -9;
   	litros = -1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.1 y b3.2
   @Test
   public void test_b11_b21_b32()
   {
   	b_p = -4;
   	b_g = -9;
   	litros = 1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.2 y b3.2
   @Test
   public void test_b11_b22_b32()
   {
   	b_p = -4;
   	b_g = 1;
   	litros = 1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.2 y b3.1
   @Test
   public void test_b11_b22_b31()
   {
   	b_p = -4;
   	b_g = 1;
   	litros = -1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.2 y b2.1 y b3.1
   @Test
   public void test_b12_b21_b31()
   {
   	b_p = 1;
   	b_g = -1;
   	litros = -1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.2 y b2.1 y b3.2
   @Test
   public void test_b12_b21_b32()
   {
   	b_p = 1;
   	b_g = -1;
   	litros = 1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.2 y b2.2 y b3.1
   @Test
   public void test_b12_b22_b31()
   {
   	b_p = 1;
   	b_g = 1;
   	litros = -1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //------------
   // TESTS TODOS POSITIVOS
   //test que implementa la caracterización del bloque b1.2 y b2.2 y b3.2 y b4.1
   @Test
   public void test_b13()
   {
   	yb_p = 1;
   	b_g = 1;
   	litros = 1;
   	assertTrue(Embotelladora.calcularBotellasPequenas(b_p, b_g, litros));
   }
   //test que implementa la caracterización del bloque b1.2 y b2.2 y b3.2 y b4.2
   @Test
   public void test_b13()
   {
   	yb_p = 1;
   	b_g = 1;
   	litros = 500;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (NoSolution e) {
		return;
	}
	fail ("NoSolution Exception expected");
   }
   //------------
   // TESTS CON ALGÚN 0 EN LOS PARÁMETROS
   
   //test que implementa la caracterización del bloque b1.2 y b2.1.1 y b2.2.2 y b2.3.2
   @Test
   public void test_b12_b211()
   {
   	year = 4;
   	assertTrue(Bisiestos.esBisiesto(year));

   }
   
   
  
}