package ejercicio_03;

import java.util.Arrays;

public class Ejercicio_03 {

	public static void main(String[] args) {

		int[] vector = new int[10];
		int cambio = 0;

		Arrays.parallelSetAll(vector, i -> (int) (Math.random() * ((11 - 1) + 1)));

		System.out.println(java.util.Arrays.toString(vector));

		for (int i = 0; i < vector.length; i += 2) {
			cambio = vector[i];
			vector[i] = vector[i + 1];
			vector[i + 1] = cambio;
		}

		System.out.println(java.util.Arrays.toString(vector));

	}

}
