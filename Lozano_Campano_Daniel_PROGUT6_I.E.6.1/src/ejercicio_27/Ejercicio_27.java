package ejercicio_27;

import java.util.Scanner;

public class Ejercicio_27 {

	private static int conteoVocales(String texto, char vocal) {

		int contVocal = 0;

		for (int i = 0; i < texto.length(); i++) {
			char vocales = texto.charAt(i);
			if (vocales == vocal)
				contVocal++;
		}
		return contVocal;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		String cadena = "cadena de prueba para el ejercicio";
		String invertida = new StringBuilder(cadena).reverse().toString();

		System.out.println(cadena);
		System.out.println(invertida);
		System.out.println(conteoVocales(cadena, 'a'));
		
		if (conteoVocales(cadena, 'a')>10) {
			System.out.println("Exceso de a");
		}
		
		System.out.println(conteoVocales(cadena, 'o'));
		
		if (conteoVocales(cadena, 'o')>5) {
			System.out.println("Exceso de o");
		}
		
		System.out.println(conteoVocales(cadena, 'e'));
		
		if (conteoVocales(cadena, 'e')>3) {
			System.out.println("Exceso de e");
		}
		
		System.out.println("Introduzca la palabra a buscar");
		String busqueda = teclado.next();
		if (cadena.indexOf(busqueda) >= 0) {
			System.out.println("La palabra se encuentra en la posicion " + cadena.indexOf(busqueda));
		}else {
			System.out.println("La palabra no se encuentra dentro de la cadena");
		}
	}
}
