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
		int litros_restantes;
		if(pequenas < 0 || grandes < 0 || total < 0){
			throw new NoSolution("All parameters must be positives");
		}
		litros_restantes = total;
		litros_restantes = litros_restantes - (litros_grandes*grandes);
		if(litros_restantes<=0){
			return 0; //hemos embotellado todo el líquido con botellas grandes
		}
		bp_necesarias = litros_restantes - pequenas;
		if(bp_necesarias > 0){
			throw new NoSolution("There aren't any solution for these parameters");
		}
		return litros_restantes;
	}
	
}

