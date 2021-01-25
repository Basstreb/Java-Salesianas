/**
 * 
 */
package set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import modelo.Persona;

/**
 * @author DAM
 *
 */
public class EjemploSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<Persona> juntaDirectiva = new HashSet<>();
		//Set<Persona> juntaDirectiva = new TreeSet<>(); //Para ordenar, Persona debe implementar Comparable
		//Set<Persona> juntaDirectiva = new LinkedHashSet<>();
		
		
		juntaDirectiva.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		juntaDirectiva.add(new Persona("23456789B", "Juan", "Martinez", LocalDate.of(1991, 2, 3)));
		juntaDirectiva.add(new Persona("34567890C", "Ana", "Ramirez", LocalDate.of(1992, 3, 4)));
		juntaDirectiva.add(new Persona("45678901D", "Maria", "Lopez", LocalDate.of(1993, 4, 5)));
		
		//Si tratamos de anadir un elemento repetido...
		juntaDirectiva.add(new Persona("45678901D", "Maria", "Lopez", LocalDate.of(1993, 4, 5)));
		
		//Comprobamos que al listarlos todos, no aparece duplicado
		for(Persona p : juntaDirectiva)
			System.out.println(p);
		
		
	}

}
