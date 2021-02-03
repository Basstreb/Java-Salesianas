package ejercicio_14;

import java.util.Scanner;

public class Ejercicio_14 {

	private static int num;
	private static boolean check;

	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_14.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);
		return Ejercicio_14.num;
	}

	public static void main(String[] args) {

		Integer[] A = new Integer[5];
		boolean check = false;

		for (int i = 0; i < A.length; i++) {

			Ejercicio_14.tryCatchInt();

			A[i] = Ejercicio_14.num;
		}

		System.out.println("Introduzca el numero a buscar");
		Ejercicio_14.tryCatchInt();

		for (int i = 0; i < A.length; i++) {
			if (A[i] == Ejercicio_14.num) {
				check = true;
			}
		}

		if (check) {
			System.out.println("El numero se encuentra dentro del array");
		} else {
			System.out.println("El numero no se encuentra dentro del array");
		}

	}

}
