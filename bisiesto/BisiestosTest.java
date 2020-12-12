//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java 
//


import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTest
{

   private int year;  // Test fixture

   //BLOQUE 1

    //test que implementa la caracterización del bloque b1.1 y b2.1.1 y b2.2.2 y b2.3.2
   @Test
   public void test_b11_b211()
   {
   	year = -4;
   	try {
		Bisiestos.esBisiesto(year);
	}catch (InvalidParameter e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.1.2 y b2.2.2 y b2.3.2
   @Test
   public void test_b11_b212()
   {
   	year = -1;
   	try {
		Bisiesto.esBisiesto(year);
	}catch (InvalidParameter e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.2.1 
   // negativo multiplo de 100 y no de 400
   @Test
   public void test_b11_b221()
   {
   	year = -100;
   	try {
		Bisiesto.esBisiesto(year);
	}catch (InvalidParameter e) {
		return;
	}
	fail ("InvalidParameter Exception expected");
   }
   
   
   //test que implementa la caracterización del bloque b1.1 y b2.3.1
   //numero negaativo multiplo de 4, 100 y 400
   @Test
   public void test_b11_b231()
   {
   	year = -400;
   	try {
		Bisiesto.esBisiesto(year);
	}catch (InvalidParameter e) {
		return;
	}
	fail ("InvalidParameter Exception expected");
   }
   //test que implementa la caracterización del bloque b1.1 y b2.3.2 y b2.2.1
   //numero negativo multiplo de 100 pero no de 400
   @Test
   public void test_b11_b232()
   {
   	year = -200;
   	try {
		Bisiesto.esBisiesto(year);
	}catch (InvalidParameter e) {
		return;
	}
	fail ("InvalidParameter Exception expected");
   }
   --------
   //BLOQUE 2
   //test que implementa la caracterización del bloque b1.2 y b2.1.1 y b2.2.2 y b2.3.2
   @Test
   public void test_b12_b211()
   {
   	year = 4;
   	assertTrue(Bisiestos.esBisiesto(year));

   }
   //test que implementa la caracterización del bloque b1.2 y b2.1.2 y b2.2.2 y b2.3.2
   @Test
   public void test_b12_b212()
   {
   	year = 1;
   	assertFalse(Bisiestos.esBisiesto(year));

   }
   //test que implementa la caracterización del bloque b1.2 y b2.2.1 
   // positivo multiplo de 100 y no de 400
   @Test
   public void test_b12_b221()
   {
   	year = 100;
   	assertFalse(Bisiestos.esBisiesto(year));
   }
   
   
   //test que implementa la caracterización del bloque b1.2 y b2.3.1
   //numero positivo multiplo de 4, 100 y 400
   @Test
   public void test_b12_b231()
   {
   	year = 400;
   	assertTrue(Bisiestos.esBisiesto(year));
   }
   //test que implementa la caracterización del bloque b1.2 y b2.3.2 y b2.2.1
   //numero positivo multiplo de 100 pero no de 400
   @Test
   public void test_b12_b232()
   {
   	year = 200;
   	assertFalse(Bisiestos.esBisiesto(year));
   }
   // -------
   //BLOQUE 3
   @Test
   public void test_b13()
   {
   	year = 0;
   	try {
		Bisiesto.esBisiesto(year);
	}catch (InvalidParameter e) {
		return;
	}
	fail ("InvalidParameter Exception expected");
   }
  
}
