
import java.util.*;

public class Bisiestos{
	//@param a un numero entero positivo
	// @return true si a es un año bisiesto
	//	   false en caso contrario
	//@throws InvalidParameter si a no es un parámetro valido
a
	public boolean esbisiesto(int a) throws InvalidParameter{
		if(a<= 0){
			throw new InvalidParameter;
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

