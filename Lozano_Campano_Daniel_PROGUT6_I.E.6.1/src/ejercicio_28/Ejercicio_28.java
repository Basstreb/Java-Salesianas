package ejercicio_28;

import java.util.Scanner;

public class Ejercicio_28 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		String cadena = teclado.nextLine();
		cadena = cadena.toLowerCase();
		cadena = cadena.replaceAll("\\s+", "");
		String palindromo = new StringBuilder(cadena).reverse().toString();

		if (cadena.equals(palindromo))
			System.out.println("La palabra introducida es un palindromo");
		else
			System.out.println("La palabra introducida no es un palindromo");
	}

}
