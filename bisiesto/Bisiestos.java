import java.lang.IllegalArgumentException;
import java.util.*;

public class Bisiestos{
	//@param a un numero entero positivo
	// @return true si a es un año bisiesto
	//	   false en caso contrario
	//@throws InvalidParameter si a no es un parámetro valido

	public static boolean esBisiesto(int a) throws IllegalArgumentException{
		if(a<= 0){
			throw new IllegalArgumentException("Parameter must be positive");
		}
		if(a % 4 == 0){
		    if( a % 100 == 0){
		        if ( a % 400 == 0){
		            return true;
		        }else{
		            return false;
		   	 }
		    }else{
		        return true;
			}
		}else {
		    return false;
		}

	}
	
	
}

