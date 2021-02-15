package apistreamdani;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.security.auth.x500.X500Principal;

public class A_EjemplosCreacionStreams {

	public static void main(String[] args) {

		// Algunas formas de obtener un Stream

		// Un stream a partir de una serie de elementos
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Un sream a partir de un array
		IntStream stream2 = Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

		// Un stream vacio
		Stream<String> stream3 = Stream.empty();

		// Un stream infinito
		Stream<Integer> stream4 = Stream.iterate(1, x -> x + 2);
		
		// Un stream infinito, pero limitado
		Stream<Integer> stream5 = Stream.iterate(0, x -> x + 2).limit(100);
		
		//Un stream a partir de una colleccion
		Stream<String> stream6 = Arrays.asList("En", "un", "lugar", "de", "la", "Mancha").parallelStream();
		
		//Un stream a partir de un supplier<t>
		Stream<Integer> stream7 = Stream.generate(new Random()::nextInt);
	}

}
