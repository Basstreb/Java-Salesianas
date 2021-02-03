package ejercicio_04;

import java.util.Arrays;

public class Ejercicio_04 {

	public static void main(String[] args) {

		int[] vector = new int[10];
		int mayor = 0;
		int menor = Integer.MAX_VALUE;
		int suma = 0;

		Arrays.parallelSetAll(vector, i -> (int) (Math.random() * ((11 - 1) + 1)));

		System.out.println(java.util.Arrays.toString(vector));

		for (int i = 0; i < vector.length; i++) {

			suma += vector[i];

			if (vector[i] > mayor) {
				mayor = vector[i];
			} else if (vector[i] < menor) {
				menor = vector[i];
			}
		}

		System.out.println("El número mayor del array es " + mayor + " el menor es " + menor + " y la media es de "
				+ (suma / vector.length));

	}

}
