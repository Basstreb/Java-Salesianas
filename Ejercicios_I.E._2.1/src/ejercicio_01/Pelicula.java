package ejercicio_01;

public class Pelicula {

	public static void main(String[] args) {

		DVDCine pelicula1 = new DVDCine("Origen (Inception)", "Christopher Nolan", "Leonardo DiCaprio y Elliot Page",
				"Thriller", 148);

		System.out.println(pelicula1.muestraDVDCine());
		System.out.println(pelicula1.esThriller());
		System.out.println(pelicula1.tieneResumen());
		System.out.println(pelicula1.muestraDuracion());

		DVDCine pelicula2 = new DVDCine("Matrix", "Hermanas Wachowski", "Keanu Reeves y Laurence Fishburne", "Accion",
				136,
				"Un experto en computadoras descubre que su mundo es una simulacion total creada con maliciosas intenciones por parte de la ciberinteligencia.");
		
		System.out.println(" ");
		System.out.println(pelicula2.muestraDVDCine());
		System.out.println(pelicula2.esThriller());
		System.out.println(pelicula2.tieneResumen());
		System.out.println(pelicula2.muestraDuracion());
	}

}
