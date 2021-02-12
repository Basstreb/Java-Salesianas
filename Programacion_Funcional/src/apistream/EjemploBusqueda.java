package apistream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EjemploBusqueda {

	public static void main(String[] args) {

		List<String> capitales = Arrays.asList("Jaen", "Cordoba", "Sevilla", "Huelva", "Cadiz", "Malaga", "Almeria");

		/**
		 * Verificamos si todos los elementos cumplen una condicion En particular que la
		 * longitud de la cadena de caracteres sea mayor o igual a 4
		 */
		boolean longitud = capitales.stream().allMatch(s -> s.length() >= 4);

		String mensajeLongitud = (longitud) ? "Todas las capitales tienen 4 o mas caracteres"
				: "Hay alguna capital con menos de 4 caracteres";

		System.out.println(mensajeLongitud);

		System.out.println("");

		// Verificamos si Alguno de los elementos cumple con una condicion
		boolean jaen = capitales.stream().anyMatch((s) -> s.equalsIgnoreCase("jaen"));
		
		String mensajeJaen = (jaen) ? "Jaen esta en la lista de capitales" : "Jaen no esta en la lista de capitales";
		
		System.out.println(mensajeJaen);
		
		System.out.println("");
		
		// La inversa de allMatch es noneMatch
//		boolean noneMatchLongitud = capitales.stream().noneMatch(s ->)
		
		//Localiza algun elemento (cualquiera) del Stream. Recomendado para streams paralelos
		Optional<String> unaCapital = capitales.parallelStream().findAny();
		System.out.println(unaCapital.orElse("No quedan capitales en el Stream"));
		System.out.println("");
		//Localiza el primer elemento del Stream. No recomendado para streams paralelos.
		Optional<String> primeraCapital = capitales.stream().findFirst();
		System.out.println(unaCapital.orElse("No quedan capitales en el Stream"));
		System.out.println("");
	}
}
