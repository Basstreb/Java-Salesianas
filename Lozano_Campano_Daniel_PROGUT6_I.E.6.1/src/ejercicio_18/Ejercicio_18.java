package ejercicio_18;

import java.util.Arrays;

public class Ejercicio_18 {

	public static void main(String[] args) {

		Integer[] A = new Integer[20];
		int suma = 0;
		int mayor = 0;
		
		Arrays.parallelSetAll(A, i -> (int) (Math.random() * ((51 - 1) + 1)));
		System.out.println(java.util.Arrays.toString(A));
		
		for (int i = 1; i < A.length; i+=2) {
			suma += A[i];
		}
		
		for (int i = 0; i < A.length; i+=2) {
			if (A[i] > mayor) {
				mayor = A[i];
			}
		}
		
		System.out.println(suma);
		System.out.println(mayor);
		
	}

}
