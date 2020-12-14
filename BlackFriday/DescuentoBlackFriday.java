import java.security.InvalidParameterException;
import java.util.*;

public class DescuentoBlackFriday{
	/*
	 * @param precioOriginal es el precio de un producto marcado en la etiqueta
	 * 				porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
	 * @return el precio final teniendo en cuenta que si es blackFriday (29 de noviembre)
	 * 				 se aplica un descuento de porcentajeDescuento
	 * @throws InvalidParameterException si precioOriginal es negativo o si porcentaje
	 *			   es negativo o mayor que 100.
	 */

//Cambiar static a public!!
	 static double precioFinal(double precioOriginal, double porcentajeDescuento)
	 throws InvalidParameterException{
		 Calendar fecha = new GregorianCalendar();

		 //Proponer Fecha
		 //fecha.set(2000, Calendar.NOVEMBER, 29);

		 int mes = fecha.get(Calendar.MONTH);
		 int dia = fecha.get(Calendar.DAY_OF_MONTH);



		 if ((mes+1) == 11 && dia == 29) {
			 // Es Black Friday
			 System.out.println("Es blackFryday");
			 //Actualizamos el precio del producto
			 //Calculamos el precio del porcentaje
			 double resto = (precioOriginal*porcentajeDescuento)/100.00;
			 //Calculamos el resultado:
			 double resultado = precioOriginal -resto;
			 return resultado;
		 }else{
			 System.out.println("No es Black Friday");
			 return precioOriginal;
		 }

	 }
	 public static void main(String[] args) {
		 double result = precioFinal(40.00, 50.00);
		 System.out.println("Precio Final:" + result );
	 }

}
