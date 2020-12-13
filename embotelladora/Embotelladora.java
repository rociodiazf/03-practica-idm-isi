//import java.security.InvalidParameterException;
import java.util.*;

public class Embotelladora{
	
	//@param pequenas: número de botellas en almacén de 1L
	//	 grandes: número de botellas en almacén de 5L
	//	 total: número total de litros que hay embotellar
	// @return número de botellas pequeñas necesarias para embotellar el total de líquido, teniendo
	//	   en cuenta que hay que minimizar el número de botellas pequeñas: Primero se rellenan las grandes
	//@throws NoSolution si no es posible embotellar todo el líquido

	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {
		int bp_necesarias = 0; //botellas pequeñas necesarias para embotellar todo el líquido
		int litros_grandes = 5; //litros que caben en una botella grande
		if(pequenas < 0 || grandes < 0 || total < 0){
			throw new NoSolution("All parameters must be positives");
		}
		bp_necesarias = total%(grandes*litros_grandes);
		if(bp_necesarias > pequenas){
			throw new NoSolution("There aren't any solution for these parameters");
		}
		return bp_necesarias;
	}
	
}

