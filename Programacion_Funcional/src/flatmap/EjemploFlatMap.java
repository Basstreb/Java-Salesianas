/**
 * 
 */
package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

/**
 * @author DAM
 *
 */
public class EjemploFlatMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Persona> lista = init();

		// "Old style", con bucles for
		System.out.println("PAISES A LOS QUE VIAJAN ALGUNAS PERSONAS (OLD STYLE)");
		for (Persona p : lista)
			for (Viaje v : p.getViajes())
				System.out.println(v.getPais());
		System.out.println("");

		// Como podriamos hacer para identificar los paieses diferentes? :S

		// Con el nuevo estilo podemos a�adir al vuelo la opci�n de filtrar repetidos
		System.out.println("PAISES (DIFERENTES, SIN REPETIDOS) A LOS QUE VIAJAN ALGUNAS PERSONAS");
		lista.stream() // Stream <Persona>
				.map(persona -> persona.getViajes()) // Stream <List<Viaje>>
				.flatMap(viajes -> viajes.stream()) // Stream<Viaje>
				.map(viaje -> viaje.getPais()) // Stream <String> Espania, Francia, Espania, Alemania
				.distinct() // Stream <String> Espania, Francia, Alemania
				.forEach(System.out::println);
		System.out.println("");

		// Para los tipos de datos primitivos, tambien tenemos sus versiones
		// flatMapToXXX
		// Si tan solo los queremos unificar, podemos usar la funcion
		// Function.identity()
		int[][] numeros = { { 1, 2, 2, 3, 1, 4 }, { 4, 2, 3, 3, 1, 1 } };

		Arrays.stream(numeros).flatMapToInt(x -> Arrays.stream(x)).map(IntUnaryOperator.identity()).distinct()
				.forEach(System.out::println);

	}

	public static List<Persona> init() {

		Persona p1 = new Persona("Luismi");
		p1.getViajes().add(new Viaje("Espania"));
		p1.getViajes().add(new Viaje("Italia"));
		p1.getViajes().add(new Viaje("Francia"));

		Persona p2 = new Persona("Miguel");
		p2.getViajes().add(new Viaje("Italia"));
		p2.getViajes().add(new Viaje("Alemania"));
		p2.getViajes().add(new Viaje("Holanda"));

		Persona p3 = new Persona("Alicia");
		p3.getViajes().add(new Viaje("Francia"));
		p3.getViajes().add(new Viaje("Marruecos"));
		p3.getViajes().add(new Viaje("Polonia"));

		return Arrays.asList(p1, p2, p3);
	}

}
