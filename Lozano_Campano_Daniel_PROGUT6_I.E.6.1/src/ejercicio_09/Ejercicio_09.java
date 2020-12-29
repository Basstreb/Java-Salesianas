package ejercicio_09;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_09 {

	private static int num;
	private static boolean check;

	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_09.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);
		return Ejercicio_09.num;
	}

	public static void main(String[] args) {

		Integer[] array = new Integer[20];

		for (int i = 0; i < array.length; i++) {

			Ejercicio_09.tryCatchInt();

			array[i] = Ejercicio_09.num;
		}

		Collections.reverse(Arrays.asList(array));
		System.out.println(Arrays.asList(array));

	}

}
