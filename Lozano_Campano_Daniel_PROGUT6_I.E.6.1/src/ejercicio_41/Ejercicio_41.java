package ejercicio_41;

import java.util.Scanner;

public class Ejercicio_41 {

	private static int num;
	private static boolean check;

	private static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_41.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Ejercicio_41.num;
	}
	
	private static void llenarMatrizEspiral(String matriz[][]) {
		int a = 0;
		int b = matriz.length - 1;
		int valor = 1;

		for (int j = 0; j < matriz.length; j++) {
			
			for (int i = a; i <= b; i++) {
				matriz[a][i] = valor++ + " \t";
			}

			for (int i = a + 1; i <= b; i++) {
				matriz[i][b] = valor++ + " \t";
			}

			for (int i = b - 1; i >= a; i--) {
				matriz[b][i] = valor++ + " \t";
			}

			for (int i = b - 1; i >= a + 1; i--) {
				matriz[i][a] = valor++ + " \t";
			}
			
			a++; 
			b--;
		}
	}
	
	private static void imprimirMatriz(String matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int dim = tryCatchInt();
		String[][] matriz = new String[dim][dim];
		llenarMatrizEspiral(matriz);
		imprimirMatriz(matriz);

	}

}
