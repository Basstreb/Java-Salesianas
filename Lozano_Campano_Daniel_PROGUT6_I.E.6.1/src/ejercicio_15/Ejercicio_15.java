package ejercicio_15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_15 {

	private static int num;
	private static boolean check;

	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_15.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);
		return Ejercicio_15.num;
	}

	public static void main(String[] args) {

		Integer[] array = new Integer[5];

		for (int i = 0; i < array.length; i++) {

			int factorial = 1;
			Ejercicio_15.tryCatchInt();

			for (int j = 1; j <= Ejercicio_15.num; j++) {
				factorial *= j;
			}

			array[i] = factorial;
		}

		System.out.println(Arrays.asList(array));
	}

}
