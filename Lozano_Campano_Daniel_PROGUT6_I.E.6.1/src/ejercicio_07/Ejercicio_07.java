package ejercicio_07;

import java.util.Arrays;

/**
 * El algoritmo de busqueda dicotomita o binaria funciona sobre arreglos
 * ordenados y es utilizado para buscar un elemento en los mismos.
 * 
 * @author Dani
 *
 */
public class Ejercicio_07 {

	public static void main(String[] args) {

		int[] array = { 10, 15, 20, 40, 50, 100, 120, 200, 400, 500, 600, 800, 2222 };

		// El array debe estar ordenado para que funcione correctamente la busqueda
		// dicotomica o binaria
		// En caso de que no lo esté se debe usar Arrays.parallelSort(nombreArray);
		// En este caso seria Arrays.parallelSort(array);

		int result = Arrays.binarySearch(array, 400);
		System.out.println(String.format("Result %d", result));

	}

}
