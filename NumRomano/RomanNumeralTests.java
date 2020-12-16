//
// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MinTest.java
//
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.lang.IllegalArgumentException;

public class RomanNumeralTests
{


  // Test en función del tipo de parámetro
  //test que implementa C1, B1 y B3
  @Test
  public void test_C1_B1_1()
  {
   String s = new String ("XVIIIR");

   try {
     RomanNumeral.convierte(s);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }

  //test que implementa C1, B1 y B3
  @Test
  public void test_C1_B1_2()
  {
   String s = new String ("XVIII");

   assertEquals(RomanNumeral.convierte(s), 18);

  }
  // Test en función del tipo de parámetro
  //test que implementa C1, B1 y B3
  @Test
  public void test_C1_B1_3()
  {
   String s = new String ("437");

   try {
     RomanNumeral.convierte(s);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }
  // Test en función del tipo de parámetro
  //test que implementa C1, B1 y B3
  @Test
  public void test_C1_B1_4()
  {
   String s = new String ("xviii");

   try {
     RomanNumeral.convierte(s);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }

  // Test en función del tipo de parámetro
  //test que implementa C1, B1 y B3
  @Test
  public void test_C2_B1_5()
  {
   String s = new String ("SMCTX");

   try {
     RomanNumeral.convierte(s);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }


  //test que implementa C1, B2
  @Test
  public void test_C1_B2()
  {
   String s = new String ("");

   try {
     RomanNumeral.convierte(s);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }


  // Test en función de la funcionalidad del parámetro
  //test que implementa C2, B4
  @Test
  public void test_C1_B4()
  {
   String s = new String ("VVVI");

   try {
     RomanNumeral.convierte(s);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }

  // Test en función de la funcionalidad del parámetro
  //test que implementa C2, B4
  @Test
  public void test_C1_B4_2()
  {
   String s = new String ("DDV");

   try {
     RomanNumeral.convierte(s);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }

  //test que implementa C2, B5
  @Test
  public void test_C1_B5()
  {
   String s = new String ("XVIIII");

   try {
     RomanNumeral.convierte(s);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }
  //test que implementa C2, B5
  @Test
  public void test_C1_B5_2()
  {
   String s = new String ("XXXXVIII");

   try {
     RomanNumeral.convierte(s);
   }catch (IllegalArgumentException e) {
       return;
   }
   fail ("Illegal Argument Exception expected");
  }

  //Test dia Black Friday

}
