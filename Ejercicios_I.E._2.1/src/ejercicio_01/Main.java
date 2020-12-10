package ejercicio_01;

/**
 * Clase Main que testea los metodos y contructores de la clase DVDCine
 * 
 * @author Dani
 *
 */
public class Main {

	public static void main(String[] args) {

		// Creamos la primera pelicula sin introducir un resumen
		DVDCine pelicula1 = new DVDCine("Origen (Inception)", "Christopher Nolan", "Leonardo DiCaprio y Elliot Page",
				"Thriller", 148);

		// Probamos los metodos con el objeto pelicula1
		System.out.println(pelicula1.muestraDVDCine());
		System.out.println(pelicula1.esThriller());
		System.out.println(pelicula1.tieneResumen());
		System.out.println(pelicula1.muestraDuracion());

		// Esta vez en la creacion del objeto usamos el atributo resumen
		DVDCine pelicula2 = new DVDCine("Matrix", "Hermanas Wachowski", "Keanu Reeves y Laurence Fishburne", "Accion",
				136,
				"Un experto en computadoras descubre que su mundo es una simulacion total creada con maliciosas intenciones por parte de la ciberinteligencia.");

		// Esta vez tendremos diferentes resultados en los metodos al incluir el
		// atributo resumen.
		System.out.println(" ");
		System.out.println(pelicula2.muestraDVDCine());
		System.out.println(pelicula2.esThriller());
		System.out.println(pelicula2.tieneResumen());
		System.out.println(pelicula2.muestraDuracion());
	}

}
