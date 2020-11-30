package ejercicio_01;

import java.util.Scanner;

public class Pelicula {

	public static void main(String[] args) {

		DVDCine pelicula = new DVDCine("Origen (Inception)", "Christopher Nolan", "Leonardo DiCaprio y Ellen Page",
				"Thriller", 148);

		System.out.println(pelicula.muestraDVDCine());
		System.out.println(pelicula.esThriller());
		System.out.println(pelicula.tieneResumen());
		System.out.println(pelicula.muestraDuracion());
		
		System.out.println("Cree su propia información del DVD");
		Scanner input = new Scanner(System.in);
		
		DVDCine peliusuari = new DVDCine();
		
		System.out.println("\nIntroduzca el nombre de la pelicula:");
		peliusuari.setTitulo(input.next());
		System.out.println("Introduzca el director:");
		peliusuari.setDirector(input.next());
		System.out.println("Escriba los actores principales:");
		peliusuari.setActores(input.next());
		System.out.println("Escriba de que genero es la pelicula:");
		peliusuari.setGenero(input.next());
		System.out.println("Escribla cuantos minutos dura la pelicula:");
		peliusuari.setDuracion(input.nextInt());
		System.out.println("Escriba un resumen de esta si lo ve necesario");
		peliusuari.setResumen(input.next());
		System.out.println(" ");
		
		
		System.out.println(peliusuari.muestraDVDCine());

	}

}
