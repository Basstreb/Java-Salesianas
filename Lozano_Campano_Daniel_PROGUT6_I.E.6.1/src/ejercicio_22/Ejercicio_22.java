package ejercicio_22;

import java.util.Arrays;
import java.util.Collections;

public class Ejercicio_22 {

	public static void main(String[] args) {

		Integer[][] matriz = new Integer[3][3];
		Integer[] array = new Integer[3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (int) (Math.random() * ((11 - 1) + 1));
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < matriz.length; i++) {
			array[i] = matriz[i][i];
		}

		System.out.println(java.util.Arrays.toString(array));
		Collections.reverse(Arrays.asList(array));
		System.out.println(Arrays.asList(array));

		for (int i = 0; i < matriz.length; i++) {
			matriz[i][i] = array[i];
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
