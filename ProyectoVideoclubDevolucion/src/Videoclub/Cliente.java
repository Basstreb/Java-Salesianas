package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Cliente {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	Scanner e = new Scanner(System.in);
	
	Excepcion ex = new Excepcion();
	String nombre;
	String direccion;
	String telefono;
	ArrayList<Videojuego> clienteVideojuegos;
	ArrayList<Pelicula> clientePeliculas;
	

	//Constructor vacio para objetos Cliente. No recibe parametros
	Cliente(){
		
	}
	
	//Constructor sobrecargado completo para objetos Cliente.
	Cliente(String nombre, String direccion, String telefono){
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		clientePeliculas=new ArrayList();
		clienteVideojuegos=new ArrayList();
	}
	

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	/**
	 * Sobreescribe el metodo "toString" de la clase Cliente para poder usarlo de forma que nos muestre la informacion del objeto cliente como deseemos(no muestra los productos que tiene alquilados)
	 */
	@Override
	public String toString() {
		return	"[Nombre: " + getNombre() + " Direccion: " + getDireccion() + " Telefono: " + getTelefono() + "]";
	}
	
	/**
	 * Metodo que describe el objeto cliente  mostrando ademas sus los productos que tiene alquilados en el momento
	 */
	public void fichaCliente() {		
		System.out.println(toString() + "\nPeliculas Alquiladas:");
		listarPeliculas();
		System.out.println("Videojuegos Alquilados:");
		listarVideojuegos();
		System.out.println();
	}
	
	/**
	 * metodo que anade el objeto pelicula que entra como parametro a la coleccion de peliculas de ese cliente
	 * @param a 
	 */
	public void addPelicula(Pelicula pelicula) throws IOException {
		
		clientePeliculas.add(pelicula);
	}
	
	/**
	 * metodo que anade el objeto videojuego que entra como parametro a la coleccion de videojuegos de ese cliente
	 * @param videojuego
	 */
	public void addVideojuego(Videojuego videojuego) throws IOException {	
		
		clienteVideojuegos.add(videojuego);
	}
	
	/**
	 * Metodo que lista todas las peliculas de la coleccion de peliculas de un objeto cliente
	 */
	public void listarPeliculas(){
		Iterator<Pelicula> ite = clientePeliculas.iterator();
		while (ite.hasNext()) {
			Pelicula a = ite.next();
			System.out.print(clientePeliculas.indexOf(a) + ": ");
			System.out.println(a.toString());
		}
		if (clientePeliculas.isEmpty()) {
			System.out.println("No se han encontrado peliculas");
		}
	}
	
	/**
	 * Metodo que lista todas las videojuegos de la coleccion de videojuegos de un objeto cliente
	 */
	public void listarVideojuegos(){
		Iterator<Videojuego> ite = clienteVideojuegos.iterator();
		while (ite.hasNext()) {
			Videojuego a = ite.next();
			System.out.print(clienteVideojuegos.indexOf(a) + ": ");
			System.out.println(a.toString());
		}
		if (clienteVideojuegos.isEmpty()) {
			System.out.println("No se han encontrado videojuegos");
		}
	}
	
}
