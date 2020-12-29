package ejercicio_13;

import java.util.Arrays;

public class Ejercicio_13 {

	public static void main(String[] args) {

		Integer[] A = new Integer[15];
		Integer[] B = new Integer[15];
		Integer[] C = new Integer[15];

		int mayorC = 0;

		Arrays.parallelSetAll(A, i -> (int) (Math.random() * ((11 - 1) + 1)));
		Arrays.parallelSetAll(B, i -> (int) (Math.random() * ((11 - 1) + 1)));

		System.out.println(java.util.Arrays.toString(A));
		System.out.println(java.util.Arrays.toString(B));

		for (int i = 0; i < C.length; i++) {
			C[i] = A[i] + B[i];

			if (C[i] > mayorC) {
				mayorC = C[i];
			}
		}

		System.out.println(java.util.Arrays.toString(C));
		System.out.println("El numero mayor del array C es " + mayorC);

	}

}
