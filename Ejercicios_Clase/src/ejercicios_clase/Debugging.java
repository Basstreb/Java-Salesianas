package ejercicios_clase;

import java.util.Scanner;

public class Debugging {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		
		/*With this program we will check if a number is prime or not.*/
		int numero;
		
		teclado = new Scanner(System.in);
		numero = teclado.nextInt();
		
		int contador = 2;
		boolean primo = true;
		
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		
		System.out.println(primo);
	}

}
