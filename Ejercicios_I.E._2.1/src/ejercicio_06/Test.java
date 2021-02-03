package ejercicio_06;

/**
 * Clase Test para Empleado y Persona
 * @author Dani
 *
 */
public class Test {

	public static void main(String[] args) {

		/**
		 * Creamos dos objetos, uno persona que tendra su nombre y edad. Y otro empleado
		 * que tendra los atributos nombre y edad de la clase Persona y ademas añade el
		 * sueldo de la clase Empleado.
		 */
		Persona p1 = new Persona("Paco", 22);
		Empleado em1 = new Empleado("Jose", 30, 1200);

		/**
		 * Imprimimos los datos de p1 de la clase Persona, además de los datos de em1
		 * cuyos atributos estan en la clase Persona, junto a su atributo de la clase
		 * Empleado que es sueldo.
		 */
		System.out.println(p1.datosPersonales());
		System.out.println(em1.datosPersonales());
		System.out.println(em1.imprimirSueldo());

	}

}
