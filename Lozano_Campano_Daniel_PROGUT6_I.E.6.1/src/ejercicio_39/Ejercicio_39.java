package ejercicio_39;

import java.util.Scanner;

public class Ejercicio_39 {

	private static int num;
	private static boolean check;

	private static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_39.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Ejercicio_39.num;
	}

	public static int fibonacci(int i) {
		if (i > 1) {
			return fibonacci(i - 1) + fibonacci(i - 2);
		} else if (i == 1) {
			return 1;
		} else if (i == 0) {
			return 0;
		} else {
			System.out.println("Debe insertar un numero mayor o igual a 1");
			return 0;
		}
	}

	public static void main(String[] args) {

		System.out.println("Cuantos numero quiere sacar de la serie de Fibonacci");
		int fibo = tryCatchInt();
		for (int i = 0; i < fibo; i++) {
			System.out.println(fibonacci(i));
		}
	}

}
