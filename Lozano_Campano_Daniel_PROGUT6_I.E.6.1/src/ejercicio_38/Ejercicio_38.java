package ejercicio_38;

import java.util.Scanner;

public class Ejercicio_38 {

	private static int num;
	private static boolean check;

	private static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_38.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Ejercicio_38.num;
	}

	public static int fact(int num) {
		if (num >= 2)
			return (num * fact(num - 1));
		else if (num == 1)
			return num;
		else
			return 0;
	}

	public static void main(String[] args) {
		System.out.println("De que numero desea saber el factorial:");
		int factorial = fact(tryCatchInt());
		System.out.println(factorial);
	}

}
