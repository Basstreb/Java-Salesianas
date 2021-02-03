package ejercicio_06;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_06 {

	private static int num;
	private static boolean check;

	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_06.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);
		return Ejercicio_06.num;
	}

	public static void main(String[] args) {

		int[] vector = new int[10];

		Arrays.parallelSetAll(vector, i -> (int) (Math.random() * ((11 - 1) + 1)));

		System.out.println(java.util.Arrays.toString(vector));

		System.out.println("Indique que numero desea buscar en la secuencia");
		Ejercicio_06.tryCatchInt();

		for (int i = 0; i < vector.length; i++) {

			if (Ejercicio_06.num == vector[i]) {

				System.out.println("Coincidencia de numero, el numero se encuentra en la posicion " + i);

			}

		}

	}

}
