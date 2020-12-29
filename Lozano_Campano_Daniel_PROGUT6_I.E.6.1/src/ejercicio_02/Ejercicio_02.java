package ejercicio_02;

import java.util.Arrays;

public class Ejercicio_02 {

	public static void main(String[] args) {

		int[] vector = new int[10];
		int suma = 0;

		Arrays.parallelSetAll(vector, i -> (int) (Math.random() * ((11 - 1) + 1)));

		System.out.println(java.util.Arrays.toString(vector));

		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}

		System.out.println(
				"La suma de los elementos del array es " + suma + " y la media es de " + (suma / vector.length));

	}

}
