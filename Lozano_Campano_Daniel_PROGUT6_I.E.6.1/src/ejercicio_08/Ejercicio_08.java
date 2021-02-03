package ejercicio_08;

import java.util.Scanner;

public class Ejercicio_08 {

	private static int num;
	private static boolean check;

	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_08.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);
		return Ejercicio_08.num;
	}
	
	public static void lecturaArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			Ejercicio_08.tryCatchInt();
			array[i] = Ejercicio_08.num;
		}
	}

	public static void main(String[] args) {

		int[] array = new int[25];
		int cont = 0;

		lecturaArray(array);

		System.out.println(java.util.Arrays.toString(array));

		System.out.println("Introduzca el n�mero que desea ver cuantas veces ha introducido");
		Ejercicio_08.tryCatchInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == Ejercicio_08.num) {
				cont++;
			}
		}
		
		if (cont == 1) {
			System.out.println("El numero ha salido un total de " + cont + " vez");
		}else {
			System.out.println("El numero ha salido un total de " + cont + " veces");
		}

	}

}
