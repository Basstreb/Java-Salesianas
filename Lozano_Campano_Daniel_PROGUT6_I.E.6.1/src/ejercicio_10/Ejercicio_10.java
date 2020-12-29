package ejercicio_10;

import java.util.Arrays;

public class Ejercicio_10 {

	public static void main(String[] args) {

		Integer[] array = new Integer[15];

		Arrays.parallelSetAll(array, i -> (int) (Math.random() * ((51 - 1) + 1)));
		System.out.println(java.util.Arrays.toString(array));

		int mayor1 = 0;
		int mayor2 = 0;
		int save = 0;

		for (int i = 0; i < array.length; i++) {

			if (mayor1 < array[i]) {
				save = mayor1;
				mayor1 = array[i];
			} else if (mayor2 < array[i] & array[i] < mayor1) {
				mayor2 = array[i];
			} else if (mayor2 < save) {
				mayor2 = save;
			}

		}

		System.out.println("Los dos mayores serian " + mayor1 + " y " + mayor2);

	}

}
