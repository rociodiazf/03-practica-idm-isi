//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java
//


import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.lang.IllegalArgumentException;

public class DescuentoBlackFridayTests
{
   private int precioOriginal;
   private int porcentajeDescuento;

   // Test en función del tipo de parámetro
   //test que implementa la caracterización del bloque b1.1 y b2.1
   @Test
   public void test_b11_b21()
   {
    pOriginal = -5;
    porcDescuento = -10;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
    }catch (IllegalArgumentException e) {
		    return;
	  }
	  fail ("Illegal Argument Exception expected");
   }

   //test que implementa la caracterización del bloque b1.2 y b2.1
   @Test
   public void test_b12_b21()
   {
    pOriginal = 80;
    porcDescuento = -10;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
    }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
   }

   //test que implementa la caracterización del bloque b1.1 y b2.2
   @Test
   public void test_b11_b22()
   {
    pOriginal = -80;
    porcDescuento = 50;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
    }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
   }


  //test que implementa la caracterización del bloque b1.2 y b2.2
  @Test
  public void test_b12_b22()
  {
  pOriginal = 80;
  porcDescuento = 50;

  assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 40);
  }

  //test que implementa la caracterización del bloque b1.3 y b2.2
  @Test
  public void test_b13_b22()
  {
   pOriginal = 0;
   porcDescuento = 50;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 0);
  }

  //test que implementa la caracterización del bloque b1.2 y b2.3
  @Test
  public void test_b11_b22()
  {
   pOriginal = 45;
   porcDescuento = 0;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 45);
  }

  //test que implementa la caracterización del bloque b1.3 y b2.3
  @Test
  public void test_b13_b23()
  {
   pOriginal = 0;
   porcDescuento = 0;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 0);
  }

  //Segun el porcentaje de descuento...
  //Test que implementa la caracterización del bloque b2.2.1
  @Test
  public void test_b221()
  {
   pOriginal = 50;
   porcDescuento = 150;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
   }catch (IllegalArgumentException e) {
      return;
   }
   fail ("Illegal Argument Exception expected");
  }

  //Test que implementa una caso frontera
  @Test
  public void test_CasoFrontera1()
  {
   pOriginal = 50;
   porcDescuento = 100;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 0);

  }

  //Test que implementa una caso frontera
  @Test
  public void test_CasoFrontera2()
  {
   pOriginal = 50;
   porcDescuento = 0;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 50);

  }

}
