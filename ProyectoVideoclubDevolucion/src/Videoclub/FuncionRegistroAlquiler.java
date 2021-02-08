package Videoclub;

import java.util.ArrayList;
import java.util.Iterator;

public class FuncionRegistroAlquiler {

	static ArrayList<RegistroAlquiler> listaRegistroAlquiler = new ArrayList<>();
	
	/**
	 * Metodo que crea y anade un registro para un producto de tipo Videojuego a la coleccion de registros
	 */
	public void addRegistroVideojuego(Cliente cliente, Videojuego videojuego) {
		
		listaRegistroAlquiler.add(new RegistroAlquiler(cliente, videojuego, videojuego.getPrecioAlquiler()));
		
	}
	
	/**
	 * Metodo que crea y anade un registro para un producto de tipo Pelicula a la coleccion de registros
	 */
	public void addRegistroPelicula(Cliente e, Pelicula pelicula) {

		listaRegistroAlquiler.add(new RegistroAlquiler(e, pelicula, pelicula.getPrecioAlquiler()));
		
	}
	/**
	 * Metodo que lista todos los registros de la coleccion de registros
	 */
	public void listarRegistroAlquiler() {
		
		if (listaRegistroAlquiler.isEmpty()) {
			System.out.println("No se ha producido ningun alquiler");
		}else {
		
			Iterator<RegistroAlquiler> ite = listaRegistroAlquiler.iterator();
			
			while (ite.hasNext()) {
				
				System.out.println(ite.next().toString());
			}
		}
	}
	
	
}
