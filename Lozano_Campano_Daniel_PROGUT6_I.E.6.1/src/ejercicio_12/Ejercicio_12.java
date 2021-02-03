package ejercicio_12;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_12 {

	static int masRepetido(Integer[] array, int n) {
		int contador = 1;
		int check = array[0];
		int contador2 = 1;

		for (int i = 1; i < n; i++) {
			if (array[i] == array[i - 1])
				contador2++;
			else {
				if (contador2 > contador) {
					contador = contador2;
					check = array[i - 1];
				}
				contador2 = 1;
			}
		}

		// Si el ultimo elemento es el mas frecuentado
		if (contador2 > contador) {
			contador = contador2;
			check = array[n - 1];
		}

		return check;
	}

	public static void main(String[] args) {

		Integer[] array = new Integer[1000];
		int a = array.length;
		Random r = new Random();

		int mayor = 0;
		int menor = Integer.MAX_VALUE;
		int sumatorio = 0;

		Arrays.parallelSetAll(array, i -> r.nextInt(71) + 10);
		Arrays.parallelSort(array);

		System.out.println(java.util.Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
			if (array[i] < menor) {
				menor = array[i];
			}

			sumatorio += array[i];
		}

		System.out.println("El mayor es " + mayor + "\nEl menor es " + menor);
		System.out.println("La media es de " + (sumatorio / array.length));

		System.out.println("El mas repetido es el numero " + masRepetido(array, a));
	}

}
