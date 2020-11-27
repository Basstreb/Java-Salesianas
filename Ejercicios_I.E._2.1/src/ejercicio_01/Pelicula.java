package ejercicio_01;

public class Pelicula {

	public static void main(String[] args) {

		DVDCine pelicula = new DVDCine("Origen (Inception)", "Christopher Nolan", "Leonardo DiCaprio y Ellen Page",
				"Thriller", 148);

		System.out.println(pelicula.muestraDVDCine());
		System.out.println(pelicula.esThriller());
		System.out.println(pelicula.tieneResumen());
		System.out.println(pelicula.muestraDuracion());

	}

}
