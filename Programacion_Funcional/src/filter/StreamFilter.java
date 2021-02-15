/**
 * 
 */
package filter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author DAM
 *
 */
public class StreamFilter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Persona> personas = Arrays.asList(
				new Persona("Ana", LocalDate.of(1930, 12, 20)),
				new Persona("Jesus", LocalDate.of(1931, 3, 13)),
				new Persona("Miguel", LocalDate.of(1943, 8, 1)),
				new Persona("Simon", LocalDate.of(1949, 5, 22)),
				new Persona("Luisa", LocalDate.of(1949, 8, 28)),
				new Persona("Antonio", LocalDate.of(1965, 4, 28)),
				new Persona("Alicia", LocalDate.of(1982, 2, 10)),
				new Persona("Angel", LocalDate.of(1982, 10, 12)),
				new Persona("Alberto", LocalDate.of(2001, 1, 2)),
				new Persona("Maria", LocalDate.of(2001, 4, 21))
				);

		
		
		// Obtener todas las personas mayores de edad
		System.out.println("PERSONAS MAYORES DE 18 ANIOS");
		personas
			.stream()
			.filter(p -> p.getEdad() >= 18)
			.map(Persona::getNombre)//Es lo mismo que .map(p->p.getNombre())
			.forEach(System.out::println);
//			.forEach(p->System.out.println(p)); Esto tambien es valido Ambos metodos hacen lo mismo
		System.out.println("");
		
		
		// Obtener todas las personas en edad activa
		System.out.println("PERSONAS EN EDAD ACTIVA (18-65 ANIOS)");
		personas
			.stream()
			.filter(p -> p.getEdad() >= 18 && p.getEdad() <= 65)
//			.forEach(persona -> System.out.printf("%s (%d anios)%n", persona.getNombre(), persona.getEdad()));
			.forEach(p -> System.out.printf("%s (%d anios)%n", p.getNombre(), p.getEdad()));
		System.out.println("");

		// Obtener el numero de personas que cumplen una condicion
		long nPersonas = personas
				.stream()
				.filter(p -> p.getFechaNacimiento().getYear() >= 2000)
				.count();
		System.out.printf("NUMERO DE PERSONAS QUE HAN NACIDO EN EL SIGLO XXI: %d%n", nPersonas);
		
		// Agrupar las personas que cumplen una condicion
		System.out.println("PERSONAS MAYORES DE EDAD, AGRUPADOS POR EDAD");
		personas
				.stream()
				.filter(p -> p.getEdad() >= 18)
				.collect(Collectors.groupingBy(Persona::getEdad, Collectors.counting()))
				.forEach((edad, numero) -> System.out.printf("%d anios: %d personas%n", edad, numero));
				
		
		// Condiciones "mas complejas"
		
		Persona p1 = personas
						.stream()
						.filter(p -> p.getNombre().equalsIgnoreCase("Andres"))
						.findAny()
						.orElse(new Persona());
		
		System.out.println(p1);
		
		
		Predicate<Persona> predicate = (Persona p) -> p.getNombre().toLowerCase().contains("s") && (p.getEdad() >= 60 && p.getEdad() <= 90);
		
		Persona p2 = personas
						.stream()
						.filter(predicate)
						.findAny()
						.orElse(new Persona());
		
		System.out.println(p2);
		
		
		personas
			.stream()
			.filter(predicate)
			.findFirst()
			.ifPresent(System.out::println);
			
		
		
	}

}
