package ejercicio_29;

import java.util.Scanner;

public class Ejercicio_29 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un DNI");
		String nif = teclado.next();
		String regex = "[0-9]+";

		/**
		 * Esta condicion nos permite comprobar si todo lo introducido del DNI es
		 * correcto primero comprueba que la longitud sea de 9 caracteres segundo que el
		 * ultimo caracter de la cadena sea una letra y por ultimo que los 8 primeros
		 * caracteres tengan un valor del 0 al 9 y si todo lo anterior es verdadero nos
		 * imprimira solo los numeros de dicho DNI
		 */
		if (nif.length() == 9 && Character.isLetter(nif.charAt(nif.length() - 1))
				&& nif.substring(0, 8).matches(regex)) {
			System.out.println(nif.substring(0, 8));
		} else {
			System.out.println("NIF no valido");
		}
	}

}
