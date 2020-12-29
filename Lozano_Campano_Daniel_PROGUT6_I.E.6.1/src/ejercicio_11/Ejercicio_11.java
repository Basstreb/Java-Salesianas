package ejercicio_11;

import java.util.Arrays;

public class Ejercicio_11 {

	public static void main(String[] args) {
		
		Integer[] array = new Integer[1000];

		Arrays.parallelSetAll(array, i -> (int) (Math.random() * ((10001 - 1) + 1)));
		Arrays.parallelSort(array);

		System.out.print("[");
		for (int i = (array.length-10); i < array.length-1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print(array[array.length-1] + "]");
		
		
		
	}
	
}
