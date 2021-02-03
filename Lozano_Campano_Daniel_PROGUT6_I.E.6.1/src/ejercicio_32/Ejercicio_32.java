package ejercicio_32;

import java.util.Scanner;

public class Ejercicio_32 {

	private static int num;
	private static boolean check;

	private static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_32.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Ejercicio_32.num;
	}

	private static boolean esCapicua(int numero) {
		
		int comp = numero;
		int inverso = 0;

		while (comp != 0) {
			inverso = inverso * 10 + comp % 10;
			comp = comp / 10;
		}
		if (numero == inverso)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		System.out.println("Introduzca un numero para comprobar si es o no capicua");
		tryCatchInt();
		System.out.println(esCapicua(num));

	}

}
