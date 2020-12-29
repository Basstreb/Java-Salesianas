package ejercicio_05;

import java.util.Scanner;

public class Ejercicio_05 {

	private static int num;
	private static boolean check;

	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_05.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);
		return Ejercicio_05.num;
	}

	public static void main(String[] args) {

		int[] vector = new int[10];

		for (int i = 0; i < vector.length; i++) {

			do {
				Ejercicio_05.tryCatchInt();
			} while (Ejercicio_05.num % 3 != 0);

			vector[i] = Ejercicio_05.num;

		}

		System.out.println(java.util.Arrays.toString(vector));

	}

}
