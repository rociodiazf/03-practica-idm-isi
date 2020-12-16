import java.lang.IllegalArgumentException;
import java.util.*;

public class RomanNumeral{
	/*
	* @param s es un número romano
	* @return el número s en base 10
	* @throws IllegalArgumentException si s no es un número romano
	*/

	private static void letrasProhibidasRepetidas(String s){
		//Letras repetidas prohibidas
		char [] letrasProhibidas = {'V','L','D'};

		for (int i = 0; i < letrasProhibidas.length; i++) {
			//letra
			char letra = letrasProhibidas[i];

			for (int j = 0; j < s.length(); j++) {
				if (j + 2 <= s.length()) {
					if (s.charAt(j) == letra && s.charAt(j+1) == letra) {
							throw new IllegalArgumentException("RomanNumeral.convierte");
					}
				}
			}
		}
	}

	private static void letrasReperticionesPermitidas(String s){

		//Máximo 3 repeticiones de las permitidas
		char [] letrasPermitidas = {'I','X','C', 'M'};
		for (int i = 0; i < letrasPermitidas.length; i++) {
			//letra
			char letra = letrasPermitidas[i];

			for (int j = 0; j < s.length(); j++) {
				if (j + 4 <= s.length()) {
					if (s.charAt(j) == letra && s.charAt(j+1) == letra
							&& s.charAt(j+2) == letra && s.charAt(j+3) == letra) {
							throw new IllegalArgumentException("RomanNumeral.convierte");
					}
				}
			}
		}
	}




	public static int convierte(String s)throws IllegalArgumentException{

		//Diccionario
		HashMap<Character, Integer> diccionario = new HashMap<Character, Integer>();
		//Metemos la info
		diccionario.put('I', 1);
		diccionario.put('V', 5);
		diccionario.put('X', 10);
		diccionario.put('L', 50);
		diccionario.put('C', 100);
		diccionario.put('D', 500);
		diccionario.put('M', 1000);


		//Variable resultado
		int res = 0;

		//String null
		if (s == null || s.length() == 0) {
			throw new IllegalArgumentException("RomanNumeral.convierte");
		}

		//Letras dentro del diccionario
		for (int i = 0; i < s.length(); i++ ) {
			if(diccionario.get(s.charAt(i)) == null){
				throw new IllegalArgumentException("RomanNumeral.convierte");
			}
		}

		letrasProhibidasRepetidas(s);

		letrasReperticionesPermitidas(s);


		//conversión
		for (int j = 0; j < s.length(); j++ ) {
			//Cogemos el símbolo s[i]
			int s1 = diccionario.get(s.charAt(j));

			//En caso de que no sea el final
			if (j + 1 < s.length()) {
				//Cogemos el siguiente valor
				int s2 = diccionario.get(s.charAt(j+1));

				//Comparamos valores
				if (s1 >= s2) {
					res = res + s1;
				}else{
					res = res +s2 -s1;
					j++;
				}
			}else{
				res = res + s1;
			}

		}

		return res;

	}
}
