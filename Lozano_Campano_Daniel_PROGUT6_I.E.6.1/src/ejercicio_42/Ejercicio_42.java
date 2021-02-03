package ejercicio_42;

import java.util.Scanner;

public class Ejercicio_42 {

	private static int num;
	private static boolean check;

	private static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_42.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Ejercicio_42.num;
	}

	public static void burbuja(int[] A) {
		int i, j, aux;
		for (i = 0; i < A.length - 1; i++) {
			for (j = 0; j < A.length - i - 1; j++) {
				if (A[j + 1] < A[j]) {
					aux = A[j + 1];
					A[j + 1] = A[j];
					A[j] = aux;
				}
			}
		}
	}

	public static void llenarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				int aleatorio = (int) (Math.floor(Math.random() * 101));
				matriz[i][j] = aleatorio;
			}
		}
	}

	public static void imprimirMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void guardarFilaMatriz(int matriz[][], int f, int array[]) {
		for (int i = 0; i < matriz.length; i++) {
			array[i] = matriz[f][i];
		}
	}

	public static void guardarMatrizFila(int matriz[][], int f, int array[]) {
		for (int i = 0; i < array.length; i++) {
			matriz[f][i] = array[i];
		}
	}

	public static void guardarDiagonalArray(int matriz[][], int array[]) {
		for (int i = 0; i < matriz.length; i++) {
			array[i] = matriz[i][i];
		}
	}

	public static void guardarDiagonalMatriz(int matriz[][], int array[]) {
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][i] = array[i];
		}
	}

	public static void main(String[] args) {

		int[][] matriz = new int[5][5];
		int[] array = new int[5];
		int fila;

		llenarMatriz(matriz);
		imprimirMatriz(matriz);
		System.out.println();

		System.out.print("Que fila desea ordenar?");
		fila = tryCatchInt();

		guardarFilaMatriz(matriz, fila, array);
		System.out.println(java.util.Arrays.toString(array));
		burbuja(array);
		System.out.println(java.util.Arrays.toString(array));
		guardarMatrizFila(matriz, fila, array);
		System.out.println("");
		imprimirMatriz(matriz);

		guardarDiagonalArray(matriz, array);
		System.out.println(java.util.Arrays.toString(array));
		burbuja(array);
		System.out.println(java.util.Arrays.toString(array));
		guardarDiagonalMatriz(matriz, array);
		System.out.println("");
		imprimirMatriz(matriz);
	}

}
