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

   /*Debemos tener una variable DELTA a causa de que el uso normal de
    *assertEquals de jUnit está obsoleto.
    *La solución que he encontrado es usar esta variable como tamaño del
    *error para poder comparar dos tipos DOUBLE.
    */
   private static final double DELTA = 1e-15;

   private static Calendar dameFechaHoy(){
    Calendar fechaHoy = new GregorianCalendar();
    return fechaHoy;
   }

   private static Calendar dameFechaBlackFriday(){
    Calendar fechaBK = new GregorianCalendar();
    fechaBK.set(2000, Calendar.NOVEMBER, 29);
    return fechaBK;
   }

   private Calendar fechaHoy = dameFechaHoy();
   private Calendar fechaBK = dameFechaBlackFriday();


   // Test en función del tipo de parámetro

   //test que implementa C1: B1.1 y C2 : B3.1
   @Test
   public void test_b11_b31()
   {

    pOriginal = -5.00;
    porcDescuento = -10.00;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK);
    }catch (IllegalArgumentException e) {
		    return;
	  }
	  fail ("Illegal Argument Exception expected");
   }

   //test que implementa C1: B1.2 y C2 : B3.1
   @Test
   public void test_b12_b31()
   {
    pOriginal = 80.00;
    porcDescuento = -10.00;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK);
    }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
   }

   //test que implementa C1: B1.1 y C2 : B3.2
   @Test
   public void test_b11_b32()
   {
    pOriginal = -80.00;
    porcDescuento = 50.00;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK);
    }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
   }

   //test que implementa C1: B1.1 y C2 : B4
   @Test
   public void test_b11_b5()
   {
    pOriginal = -80.00;
    porcDescuento = 0.00;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento,fechaBK);
    }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
   }

   //test que implementa C1: B4 y C2 : B3.1
   @Test
   public void test_b4_b31()
   {
    pOriginal = 0.00;
    porcDescuento = -80.00;

    try {
      DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento,fechaBK);
    }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
   }


  //test que implementa C1: B1.2 y C2 : B3.2
  @Test
  public void test_b12_b32()
  {
  pOriginal = 80.00;
  porcDescuento = 50.00;

  assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK), 40.00, DELTA);
  }

  //test que implementa C1: B2 y C2 : B3.2
  @Test
  public void test_b2_b32()
  {
   pOriginal = 0.00;
   porcDescuento = 50.00;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK), 0.00, DELTA);
  }

  //test que implementa C1: B1.2 y C2 : B4
  @Test
  public void test_b12_b4()
  {
   pOriginal = 45.00;
   porcDescuento = 0.00;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK), 45.00, DELTA);
  }

  //test que implementa C1: B2 y C2 : B4
  @Test
  public void test_b2_b4()
  {
   pOriginal = 0.00;
   porcDescuento = 0.00;
   assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK), 0.00, DELTA);
  }

  //Segun el porcentaje de descuento...

  //test que implementa C1: B1.2 y C3 : B5.1
  @Test
  public void test_b12_b51()
  {
   pOriginal = 50.00;
   porcDescuento = 150.00;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK);
   }catch (IllegalArgumentException e) {
      return;
   }
   fail ("Illegal Argument Exception expected");
  }

  //caso frontera
  @Test
  public void test_CasoFrontera1()
  {
   pOriginal = 50.00;
   porcDescuento = 100.00;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK);
   }catch (IllegalArgumentException e) {
      return;
   }
   fail ("Illegal Argument Exception expected");
  }



  //Test que implementa una caso frontera
  @Test
  public void test_CasoFrontera2()
  {
     pOriginal = 0.50;
     porcDescuento = 0.00;
     assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK), 0.50, DELTA);

  }
  //TEST extras
  //Test que implementa la caracterización del bloque b1.1 y b2.2.1
  @Test
  public void test_b11_b221()
  {
   pOriginal = -50.00;
   porcDescuento = 200.00;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK);
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
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK);
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
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK);
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
   porcDescuento = 0.00;
   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK);
   }catch (IllegalArgumentException e) {
      return;
   }
   fail ("Illegal Argument Exception expected");
  }

  @Test
  public void test_CasoExtremo()
  {
     pOriginal = 5.99;
     porcDescuento = 20.00;
     assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaBK), 4.792, DELTA);

  }


  //AHORA REPETIMOS TEST, CUANDO NO SEA EL DIA DE BLACKFRIDAY
  // Test en función del tipo de parámetro

  //test que implementa C1: B1.1 y C2 : B3.1
  @Test
  public void test_b11_b31_NoBK()
  {

   pOriginal = -5.00;
   porcDescuento = -10.00;

   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }

  //test que implementa C1: B1.2 y C2 : B3.1
  @Test
  public void test_b12_b31_NoBK()
  {
   pOriginal = 80.00;
   porcDescuento = -10.00;

   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy);
   }catch (IllegalArgumentException e) {
      return;
  }
  fail ("Illegal Argument Exception expected");
  }

  //test que implementa C1: B1.1 y C2 : B3.2
  @Test
  public void test_b11_b32_NoBK()
  {
   pOriginal = -80.00;
   porcDescuento = 50.00;

   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy);
   }catch (IllegalArgumentException e) {
      return;
  }
  fail ("Illegal Argument Exception expected");
  }

  //test que implementa C1: B1.1 y C2 : B4
  @Test
  public void test_b11_b5_NoBK()
  {
   pOriginal = -80.00;
   porcDescuento = 0.00;

   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento,fechaHoy);
   }catch (IllegalArgumentException e) {
      return;
  }
  fail ("Illegal Argument Exception expected");
  }

  //test que implementa C1: B4 y C2 : B3.1
  @Test
  public void test_b4_b31_NoBK()
  {
   pOriginal = 0.00;
   porcDescuento = -80.00;

   try {
     DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento,fechaHoy);
   }catch (IllegalArgumentException e) {
      return;
  }
  fail ("Illegal Argument Exception expected");
  }


 //test que implementa C1: B1.2 y C2 : B3.2
 @Test
 public void test_b12_b32_NoBK()
 {
 pOriginal = 80.00;
 porcDescuento = 50.00;

 assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy), 80.00, DELTA);
 }

 //test que implementa C1: B2 y C2 : B3.2
 @Test
 public void test_b2_b32_NoBK()
 {
  pOriginal = 0.00;
  porcDescuento = 50.00;
  assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy), 0.00, DELTA);
 }

 //test que implementa C1: B1.2 y C2 : B4
 @Test
 public void test_b12_b4_NoBK()
 {
  pOriginal = 45.00;
  porcDescuento = 0.00;
  assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy), 45.00, DELTA);
 }

 //test que implementa C1: B2 y C2 : B4
 @Test
 public void test_b2_b4_NoBK()
 {
  pOriginal = 0.00;
  porcDescuento = 0.00;
  assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy), 0.00, DELTA);
 }

 //Segun el porcentaje de descuento...

 //test que implementa C1: B1.2 y C3 : B5.1
 @Test
 public void test_b12_b51_NoBK()
 {
  pOriginal = 50.00;
  porcDescuento = 150.00;
  try {
    DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy);
  }catch (IllegalArgumentException e) {
     return;
  }
  fail ("Illegal Argument Exception expected");
 }

 //caso frontera
 @Test
 public void test_CasoFrontera1_NoBK()
 {
  pOriginal = 50.00;
  porcDescuento = 100.00;
  try {
    DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy);
  }catch (IllegalArgumentException e) {
     return;
  }
  fail ("Illegal Argument Exception expected");
 }



 //Test que implementa una caso frontera
 @Test
 public void test_CasoFrontera2_NoBK()
 {
    pOriginal = 50.00;
    porcDescuento = 0.00;
    assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy), 50.00, DELTA);

 }


 //Duda ¿Son REALMENTE necesarios?
 //Ya se calcula el error de cada uno de ellos por separado en los test anteriores
 //Test que implementa la caracterización del bloque b1.1 y b2.2.1
 @Test
 public void test_b11_b221_NoBK()
 {
  pOriginal = -50.00;
  porcDescuento = 200.00;
  try {
    DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy);
  }catch (IllegalArgumentException e) {
     return;
  }
  fail ("Illegal Argument Exception expected");
 }

 //Test que implementa la caracterización del bloque b1.1 y b2.2.2
 @Test
 public void test_b11_b222_NoBK()
 {
  pOriginal = -50.00;
  porcDescuento = 10.00;
  try {
    DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy);
  }catch (IllegalArgumentException e) {
     return;
  }
  fail ("Illegal Argument Exception expected");
 }
 //Test que implementa la caracterización del bloque b1.1 y b2.2.2
 //Caso frontera
 @Test
 public void test_b11_b221_forentera1_NoBK()
 {
  pOriginal = -50.00;
  porcDescuento = 100.00;
  try {
    DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy);
  }catch (IllegalArgumentException e) {
     return;
  }
  fail ("Illegal Argument Exception expected");
 }
 //Test que implementa la caracterización del bloque b1.1 y b2.2.2
 //Caso frontera
 @Test
 public void test_b11_b221_frontera2_NoBK()
 {
  pOriginal = -50.00;
  porcDescuento = 100.00;
  try {
    DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy);
  }catch (IllegalArgumentException e) {
     return;
  }
  fail ("Illegal Argument Exception expected");
 }
 // ES dia de blackFriday
 @Test
 public void test_29Nov_NoBK()
 {
    pOriginal = 50.00;
    porcDescuento = 0.00;
    assertEquals(DescuentoBlackFriday.precioFinal(pOriginal, porcDescuento, fechaHoy), 50.00, DELTA);

 }

}
