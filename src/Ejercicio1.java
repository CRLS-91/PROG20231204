
public class Ejercicio1 {

		// TODO Auto-generated method stub
		public static String ocultarCaracteres(String cadena) {
			return String.format("%s%s%s", cadena.charAt(0), "*".repeat(cadena.length() - 2), cadena.charAt(cadena.length() - 1));
		
	
	}

}
