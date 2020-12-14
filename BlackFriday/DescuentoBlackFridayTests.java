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
   private double pOriginal;
   private double porcDescuento;

   private static final double DELTA = 1e-15;

   // Test en función del tipo de parámetro
   //test que implementa la caracterización del bloque b1.1 y b2.1
   @Test
   public void test_b11_b21()
   {
    pOriginal = -5.00;
    porcDescuento = -10.00;

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
    pOriginal = 80.00;
    porcDescuento = -10.00;

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
    pOriginal = -80.00;
    porcDescuento = 50.00;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
    }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
   }

   //test que implementa la caracterización del bloque b1.1 y b2.3
   @Test
   public void test_b11_b23()
   {
    pOriginal = -80.00;
    porcDescuento = 0.00;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
    }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
   }

   //test que implementa la caracterización del bloque b1.3 y b2.1
   @Test
   public void test_b13_b21()
   {
    pOriginal = 0.00;
    porcDescuento = -80.00;

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
  pOriginal = 80.00;
  porcDescuento = 50.00;

  assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 40.00, DELTA);
  }

  //test que implementa la caracterización del bloque b1.3 y b2.2
  @Test
  public void test_b13_b22()
  {
   pOriginal = 0.00;
   porcDescuento = 50.00;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 0.00, DELTA);
  }

  //test que implementa la caracterización del bloque b1.2 y b2.3
  @Test
  public void test_b12_b23()
  {
   pOriginal = 45.00;
   porcDescuento = 0.00;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 45.00, DELTA);
  }

  //test que implementa la caracterización del bloque b1.3 y b2.3
  @Test
  public void test_b13_b23()
  {
   pOriginal = 0.00;
   porcDescuento = 0.00;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 0.00, DELTA);
  }

  //Segun el porcentaje de descuento...
  //Test que implementa la caracterización del bloque b2.2.1
  @Test
  public void test_b221()
  {
   pOriginal = 50.00;
   porcDescuento = 150.00;
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
   pOriginal = 50.00;
   porcDescuento = 100.00;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
   }catch (IllegalArgumentException e) {
      return;
   }
   fail ("Illegal Argument Exception expected");
  }



  //Test que implementa una caso frontera
  @Test
  public void test_CasoFrontera2()
  {
   pOriginal = 50.00;
   porcDescuento = 0.00;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento), 50.00, DELTA);

  }


  //Duda
  //Test que implementa la caracterización del bloque b1.1 y b2.2.1
  @Test
  public void test_b11_b221()
  {
   pOriginal = -50.00;
   porcDescuento = 200.00;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
   }catch (IllegalArgumentException e) {
      return;
   }
   fail ("Illegal Argument Exception expected");
  }

  //Test que implementa la caracterización del bloque b1.1 y b2.2.2
  @Test
  public void test_b11_b222()
  {
   pOriginal = -50.00;
   porcDescuento = 10.00;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
   }catch (IllegalArgumentException e) {
      return;
   }
   fail ("Illegal Argument Exception expected");
  }
  //Test que implementa la caracterización del bloque b1.1 y b2.2.2
  //Caso frontera
  @Test
  public void test_b11_b221_forentera1()
  {
   pOriginal = -50.00;
   porcDescuento = 100.00;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
   }catch (IllegalArgumentException e) {
      return;
   }
   fail ("Illegal Argument Exception expected");
  }
  //Test que implementa la caracterización del bloque b1.1 y b2.2.2
  //Caso frontera
  @Test
  public void test_b11_b221_frontera2()
  {
   pOriginal = -50.00;
   porcDescuento = 100.00;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento);
   }catch (IllegalArgumentException e) {
      return;
   }
   fail ("Illegal Argument Exception expected");
  }


}
