package ejercicio_43;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_43 {

	private static int num;
	private static boolean check;

	private static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_43.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Ejercicio_43.num;
	}

	/**
	 * Metodo para la ordenacion por burbuja
	 * 
	 * @param A
	 */
	public static void burbuja(int[] A) {
		int aux;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 0; j < A.length - i - 1; j++) {
				if (A[j + 1] < A[j]) {
					aux = A[j + 1];
					A[j + 1] = A[j];
					A[j] = aux;
				}
			}
		}
	}

	/**
	 * Metodo para la ordenacion por insercion directa
	 * 
	 * @param A
	 */
	public static void insercionDirecta(int[] A) {
		int j;
		int aux;
		for (int i = 1; i < A.length; i++) { // desde el segundo elemento hasta
			aux = A[i]; // el final, guardamos el elemento y
			j = i - 1; // empezamos a comprobar con el anterior
			while ((j >= 0) && (aux < A[j])) { // mientras queden posiciones y el
												// valor de aux sea menor que los
				A[j + 1] = A[j]; // de la izquierda, se desplaza a
				j--; // la derecha
			}
			A[j + 1] = aux; // colocamos aux en su sitio
		}
	}

	/**
	 * Metodo java de ordenación por selección
	 * 
	 * @param A
	 */
	public static void seleccion(int[] A) {
		int menor, pos, tmp;
		for (int i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
			menor = A[i]; // de los elementos que quedan por ordenar
			pos = i; // y guardamos su posición
			for (int j = i + 1; j < A.length; j++) { // buscamos en el resto
				if (A[j] < menor) { // del array algún elemento
					menor = A[j]; // menor que el actual
					pos = j;
				}
			}
			if (pos != i) { // si hay alguno menor se intercambia
				tmp = A[i];
				A[i] = A[pos];
				A[pos] = tmp;
			}
		}
	}

	/**
	 * Metodo java de ordenación quicksort
	 * 
	 * @param A
	 * @param izq
	 * @param der
	 */
	public static void quicksort(int[] A, int izq, int der) {
		int pivote = A[izq]; // tomamos primer elemento como pivote
		int i = izq; // i realiza la búsqueda de izquierda a derecha
		int j = der; // j realiza la búsqueda de derecha a izquierda
		int aux;
		while (i < j) { // mientras no se crucen las búsquedas
			while (A[i] <= pivote && i < j)
				i++; // busca elemento mayor que pivote
			while (A[j] > pivote)
				j--; // busca elemento menor que pivote
			if (i < j) { // si no se han cruzado
				aux = A[i]; // los intercambia
				A[i] = A[j];
				A[j] = aux;
			}
		}
		A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
		A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
		if (izq < j - 1)
			quicksort(A, izq, j - 1); // ordenamos subarray izquierdo
		if (j + 1 < der)
			quicksort(A, j + 1, der); // ordenamos subarray derecho
	}

	public static void llenarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				int aleatorio = (int) (Math.floor(Math.random() * 11));
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

	public static void llenarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int aleatorio = (int) (Math.floor(Math.random() * 11));
			array[i] = aleatorio;
		}
	}

	public static void imprimirArray(int array[]) {
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {

		System.out.println("Defina las dimensiones de la matriz y del array");
		int dim = tryCatchInt();
		int col = 0;
		int menu;
		boolean check = false;
		int[][] matriz = new int[dim][dim];
		int[] array = new int[dim];

		do {
			llenarMatriz(matriz);
			llenarArray(array);

			int j = 0, cont = 0;
			for (int i = 0; i < array.length; i++) {
				cont = 0;
				for (int h = 0; h < array.length; h++) {
					if (matriz[h][j] == array[h]) {
						cont++;
					}
					if (cont == array.length) {
						check = true;
						System.out.println("El vector esta contenido en la columna " + j);
						col = j;
					}
				}
				j++;
			}
		} while (check != true);

		System.out.println();
		imprimirMatriz(matriz);
		imprimirArray(array);
		System.out.println();

		System.out.println("Se va a ordenar la columna " + col + " que metodo de ordenacion desea usar?");
		System.out.println("1. Burbuja\n2. Insercion Directa\n3. Seleccion\n4. Quicksort");
		menu = tryCatchInt();
		switch (menu) {
		case 1:
			burbuja(array);
			break;
		case 2:
			insercionDirecta(array);
			break;
		case 3:
			seleccion(array);
			break;
		case 4:
			quicksort(array, 0, array.length - 1);
			break;
		}

		System.out.print("El array ordenado es: ");
		imprimirArray(array);
	}

}
