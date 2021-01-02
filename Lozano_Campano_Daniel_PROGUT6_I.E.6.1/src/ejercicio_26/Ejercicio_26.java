package ejercicio_26;

public class Ejercicio_26 {

	private static String cifrar(String texto) {
		final String alfabeto = "abcdefghijklmnñopqrstuvwxyz";

		String cifrado = "";
		for (int i = 0; i < texto.length(); i++) {
			int posicion = alfabeto.indexOf(texto.charAt(i));
			/**
			 * Declaramos el if posicion >= 0 porque si hay algun caracter que no
			 * corresponde a alguna letra del abecedario el resultado seria -1 y por ello no
			 * se alteraria su valor
			 */
			if (posicion >= 0) {
				/**
				 * En esta operación usamos el modulo para cuando estemos con las ultimas letras
				 * del abecedario, el resto de esta operacion nos dara 1, 2 o 3
				 */
				cifrado += alfabeto.charAt((posicion + 3) % alfabeto.length());
			} else {
				cifrado += texto.charAt(i);
			}
		}

		return cifrado;
	}

	public static void main(String[] args) {

		String cadena = "prueba de encriptado";
		String cadenaConNumeros = "prueba con 123456 cambio";

		System.out.println(cifrar(cadena));
		System.out.println(cifrar(cadenaConNumeros));
	}

}
