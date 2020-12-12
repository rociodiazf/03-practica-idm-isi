import java.security.InvalidParameterException;
import java.util.*;

public class Bisiestos{
	//@param a un numero entero positivo
	// @return true si a es un año bisiesto
	//	   false en caso contrario
	//@throws InvalidParameter si a no es un parámetro valido

	public static boolean esBisiesto(int a) throws InvalidParameterException{
		if(a<= 0){
			throw new InvalidParameterException("Parameter must be positive");
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

