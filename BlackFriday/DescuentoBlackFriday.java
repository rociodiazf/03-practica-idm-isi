import java.lang.IllegalArgumentException;
import java.util.*;

public class DescuentoBlackFriday{
	/*
	 * @param precioOriginal es el precio de un producto marcado en la etiqueta
	 * 				porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
	 * @return el precio final teniendo en cuenta que si es blackFriday (29 de noviembre)
	 * 				 se aplica un descuento de porcentajeDescuento
	 * @throws IllegalArgumentException si precioOriginal es negativo o si porcentaje
	 *			   es negativo o mayor que 100.
	 */

	 public static double precioFinal(double precioOriginal, double porcentajeDescuento,
	 	 Calendar fecha) throws IllegalArgumentException{

		 if (porcentajeDescuento >= 100 || porcentajeDescuento < 0 || precioOriginal < 0) {
			 throw new IllegalArgumentException("DescuentoBlackFriday.precioFinal");
		 }

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

}
