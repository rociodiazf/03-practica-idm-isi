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

   //TESTS QUE COMBINAN BLOQUES PARA NÚMEROS POSITIVOS Y NEGATIVOS

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
   public void test_b12_b22_b32_b41()
   {
   	yb_p = 1;
   	b_g = 1;
   	litros = 1;
   	assertEquals(Embotelladora.calcularBotellasPequenas(b_p, b_g, litros), 0);
   }
   //test que implementa la caracterización del bloque b1.2 y b2.2 y b3.2 y b4.2
   @Test
   public void test_b12_b22_b32_b42()
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
   
   //test que implementa la caracterización del bloque b1.3 y b2.3 y b3.3 y b4.2
   @Test
   public void test_b12_b22_b31()
   {
   	yb_p = 0;
   	b_g = 0;
   	litros = 0;
   	assertEquals(Embotelladora.calcularBotellasPequenas(b_p, b_g, litros), 0);

   }
   //TESTS QUE COMBINA NÚMEROS NEGATIVOS Y EL 0
   
    
   //test que implementa la caracterización del bloque b1.3 y b2.3 y b3.1
   @Test
   public void test_b13_b23_b31()
   {
   	b_p = 0;
   	b_g = 0;
   	litros = -1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.3 y b2.1 y b3.3
   @Test
   public void test_b13_b21_b33()
   {
   	b_p = 0;
   	b_g = -1;
   	litros = 0;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.3 y b2.1 y b3.1
   @Test
   public void test_b13_b21_b31()
   {
   	b_p = 0;
   	b_g = -15;
   	litros = -1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.3 y b3.3
   @Test
   public void test_b11_b23_b33()
   {
   	b_p = -1;
   	b_g = 0;
   	litros = 0;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.3 y b3.1
   @Test
   public void test_b11_b23_b31()
   {
   	b_p = -1;
   	b_g = 0;
   	litros = -1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.1 y b3.3
   @Test
   public void test_b11_b21_b33()
   {
   	b_p = -1;
   	b_g = -1;
   	litros = 0;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //TESTS QUE COMBINAN BLOQUES PARA NÚMEROS POSITIVOS Y CERO

    //test que implementa la caracterización del bloque b1.3, b2.3 y b3.2 y b4.2
   @Test
   public void test_b13_b23_b32()
   {
   	b_p = 0;
   	b_g = 0;
   	litros = 1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (NoSolution e) {
		return;
	}
	fail ("NoSolution Exception expected");

   }
   //test que implementa la caracterización del bloque b1.3 y b2.2 y b3.3 y b4.1
   @Test
   public void test_b13_b22_b33()
   {
   	b_p = 0;
   	b_g = 1;
   	litros = 0;
   	assertEquals(Embotelladora.calcularBotellasPequenas(b_p, b_g, litros), 0);

   }
   //test que implementa la caracterización del bloque b1.3 y b2.2 y b3.2 y b4.1
   @Test
   public void test_b13_b22_b32()
   {
   	b_p = 0;
   	b_g = 1;
   	litros = 1;
   	assertEquals(Embotelladora.calcularBotellasPequenas(b_p, b_g, litros), 0);

   }
   //test que implementa la caracterización del bloque b1.2 y b2.3 y b3.3 y b4.1
   @Test
   public void test_b12_b23_b33()
   {
   	b_p = 1;
   	b_g = 0;
   	litros = 0;
   	assertEquals(Embotelladora.calcularBotellasPequenas(b_p, b_g, litros), 0);

   }
   //test que implementa la caracterización del bloque b1.2 y b2.3 y b3.2 y b4.1
   @Test
   public void test_b12_b23_b32_b41()
   {
   	b_p = 1;
   	b_g = 0;
   	litros = 1;
   	assertEquals(Embotelladora.calcularBotellasPequenas(b_p, b_g, litros), 1);

   }
   //test que implementa la caracterización del bloque b1.2 y b2.3 y b3.2 y b4.2
   @Test
   public void test_b12_b23_b32_b41()
   {
   	b_p = 1;
   	b_g = 0;
   	litros = 2;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (NoSolution e) {
		return;
	}
	fail ("NoSolution Exception expected");

   }
   //test que implementa la caracterización del bloque b1.2 y b2.2 y b3.3
   @Test
   public void test_b12_b22_b33()
   {
   	b_p = 1;
   	b_g = 1;
   	litros = 0;
   	assertEquals(Embotelladora.calcularBotellasPequenas(b_p, b_g, litros), 0);

   }
   //------------
   //TEST QUE ALTERNAN NÚMEROS NEGATIVOS, POSITIVOS Y EL CERO
   //test que implementa la caracterización del bloque b1.3 y b2.1 y b3.2
   @Test
   public void test_b13_b21_b32()
   {
   	b_p = 0;
   	b_g = -1;
   	litros = 1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.3 y b2.2 y b3.1
   @Test
   public void test_b13_b22_b31()
   {
   	b_p = 0;
   	b_g = 1;
   	litros = -1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
  //test que implementa la caracterización del bloque b1.2 y b2.1 y b3.3
   @Test
   public void test_b12_b21_b33()
   {
   	b_p = 1;
   	b_g = -1;
   	litros = 0;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.2 y b3.3
   @Test
   public void test_b11_b22_b33()
   {
   	b_p = -1;
   	b_g = 1;
   	litros = 0;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.1 y b2.3 y b3.2
   @Test
   public void test_b11_b23_b32()
   {
   	b_p = -1;
   	b_g = 0;
   	litros = 1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");

   }
   //test que implementa la caracterización del bloque b1.2 y b2.3 y b3.1
   @Test
   public void test_b12_b23_b31()
   {
   	b_p = 1;
   	b_g = 0;
   	litros = -1;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (InvalidParameterException e) {
		return;
	}
	fail ("InvalidParameter Exception expected");
   }
   //-----
   //TEST EXTRA PARA PROBAR LA FUNCIONALIDAD MÁS A FONDO
   
   //test que implementa la caracterización del bloque b1.2 y b2.2 y b3.2 y b4.1
   @Test
   public void test_b12_b22_b32_b41_Extra()
   {
   	yb_p = 10;
   	b_g = 4;
   	litros = 27;
   	assertEquals(Embotelladora.calcularBotellasPequenas(b_p, b_g, litros), 7);
   }
   //test que implementa la caracterización del bloque b1.2 y b2.2 y b3.2 y b4.2
   @Test
   public void test_b12_b22_b32_b42_Extra()
   {
   	yb_p = 2;
   	b_g = 4;
   	litros = 27;
   	try {
		Embotelladora.calcularBotellasPequenas(b_p, b_g, litros);
	}catch (NoSolution e) {
		return;
	}
	fail ("NoSolution Exception expected");
   }
}
