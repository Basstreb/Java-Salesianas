package ejercicio_01;

import java.util.Arrays;

public class Ejercicio_01 {

	public static void main(String[] args) {

		int[] vector = new int[5];

		Arrays.parallelSetAll(vector, i -> (int) (Math.random() * ((11 - 1) + 1)));

		System.out.println(java.util.Arrays.toString(vector));

	}

}
