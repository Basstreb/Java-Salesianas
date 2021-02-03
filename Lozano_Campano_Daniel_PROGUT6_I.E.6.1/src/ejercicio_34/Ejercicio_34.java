package ejercicio_34;

import java.util.Scanner;

public class Ejercicio_34 {

	private static int num;
	private static boolean check;

	private static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_34.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Ejercicio_34.num;
	}

	public static void main(String[] args) {

		System.out.println("Defina el tamaño del cuadrado para que se genere el cuadrado latino");
		int dim = tryCatchInt();
		int[][] cuadraroLatino = new int[dim][dim];

		//Primer recorrido para iniciar los valores del array
		for (int i = 0; i < cuadraroLatino.length; i++) {
			for (int j = 0; j < cuadraroLatino.length; j++) {
				cuadraroLatino[i][j] = 0;
			}
		}
		
		//Ciclo for que recorre las primeras diagonales hasta alcanzar la diagonal secundaria
		for (int k = 0; k < dim; k++) {
			for (int j = 0; j <= k; j++) {
				int i = k - j;
				cuadraroLatino[i][j] = k + 1;
			}
		}
		
		//Ciclo for que recorre la segunda mitad del array
		for (int k = dim - 2; k >= 0; k--) {
			for (int j = 0; j <= k; j++) {
				int i = k - j;
				cuadraroLatino[dim - j - 1][dim - i - 1] = dim - k - 1;
			}
		}
		
		//Ciclo for que imprime el array bidimentional
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				System.out.print(cuadraroLatino[i][j] + " ");
			}
			System.out.println();
		}
	}

}
