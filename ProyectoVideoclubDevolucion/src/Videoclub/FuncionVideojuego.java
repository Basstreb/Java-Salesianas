package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Esta clase contiene las funciones relacionadas con los objetos Videojuego
 */
public class FuncionVideojuego {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	Excepcion ex = new Excepcion();
	ArrayList<Videojuego> listaVideojuego = new ArrayList<>();
	
	/**
	 * Metodo que crea y anade un videojuego a la coleccion de videojuegos
	 */
	public void addVideojuego() throws IOException {
		System.out.println("Introduzca el titulo del videojuego: ");
		String titulo = teclado.readLine();
		System.out.println("Introduzca el precio del alquiler del producto: ");
		double precioD = 0;
		precioD = ex.pedirDouble();
		System.out.println("Introduzca el plazo del alquiler(dias): ");
		int plazo = ex.pedirInt();
		System.out.println("Elija el estilo del videojuego: ");
		System.out.println("ESTILOS:\n 1. Accion\n 2.Deportes\n 3. Aventuras\n 4. Puzzle\n 5. Infantil");
		Enum estilo = null;
		int a;
		do {
			a = ex.pedirInt();
			switch (a) {
			case 1:
				estilo = Estilo.ACCION;
				break;
	
			case 2:
				estilo = Estilo.DEPORTES;
				break;
			
			case 3:
				estilo = Estilo.AVENTURAS;
				break;
			
			case 4:
				estilo = Estilo.PUZZLE;
				break;
			
			case 5:
				estilo = Estilo.INFANTIL;
				break;
				
			default:
				System.out.println("Opcion introducida ni valida");
				break;
			}
		}while(a<1 || a>5);
		
		System.out.println("PLATAFORMA:\n 1. Xbox\n 2.PlayStation\n 3. WII");
		Enum plataforma = null;
		int b;
		do {
			b = ex.pedirInt();
			switch (b) {
			case 1:
				plataforma = Plataforma.XBOX;
				break;
	
			case 2:
				plataforma = Plataforma.PLAYSTATION;
				break;
			
			case 3:
				plataforma = Plataforma.WII;
				break;
				
			default:
				System.out.println("Opcion introducida ni valida");
				break;
			}
		}while(b<1 || b>3);
		
		
		listaVideojuego.add(new Videojuego(titulo, precioD, plazo, false, estilo, plataforma));
		
	}
	
	/**
	 * Metodo que lista todos los videojuegos de la coleccion videojuego junto con su posicion en la coleccion
	 */
	public void listarVideojuegosInventario() {
		
		Iterator<Videojuego> ite = listaVideojuego.iterator();
		
		System.out.println("Este es el listado de los videojuegos: ");
		
		if (listaVideojuego.isEmpty()) {
			System.out.println("No se han encontrado videojuegos");
		}else{
			
			while (ite.hasNext()) {
		
			Videojuego a = ite.next();
			System.out.print(listaVideojuego.indexOf(a) + ": ");
			System.out.println(a.toString());
			
			}
			
		}
	}
	
	public void listarVideojuegosDisponibles() {
		
		Iterator<Videojuego> ite = listaVideojuego.iterator();
		
		System.out.println("Este es el listado de los videojuegos: ");
		
		if (listaVideojuego.isEmpty()) {
			System.out.println("No se han encontrado videojuegos");
		}else{
			
			while (ite.hasNext()) {
		
			Videojuego a = ite.next();
			if (listaVideojuego.get(listaVideojuego.indexOf(a)).isAlquilado() == false) {
				System.out.print(listaVideojuego.indexOf(a) + ": ");
				System.out.println(a.toString());
			}else {
				
				System.out.println("El videojuego [" + listaVideojuego.indexOf(a) + "] esta alquilado en estos momentos.");
			}
			
			}
			
		}
	}
	
	/**
	 * Metodo que ficha un videojuego es decir, lo describe. El videojuego que va a ser descrito es elegido primero.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public void fichaVideojuego() throws IOException {
		if (listaVideojuego.isEmpty() ) {
			System.out.println("No se han encontrado videojuegos");
			
		}else {
			int opcion = 0;
			do {
				try {
					listarVideojuegosInventario();
					System.out.println("Introduzca el identificador de la pelicula: ");
					opcion = ex.pedirInt();
					System.out.println(listaVideojuego.get(opcion).toString());
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Introduzca una opcion valida");
				}
			}while(opcion < 0 || opcion >= listaVideojuego.size());
			
		}
	}
	
	/**
	 * Metodo que permite elegir un videojuego para luego eliminarlo de la coleccion de Videojuegos
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public void eliminarVideojuego() throws NumberFormatException, IOException {
		
		boolean aux=false;
		int opcion = 0;
		
		if (listaVideojuego.isEmpty()) {
			System.out.println("No se han encontrado videojuegos");
		}else {
			do {
				listarVideojuegosDisponibles();
				System.out.println("Introduzca el identificador del videojuego a eliminar: ");
				opcion = ex.pedirInt();
				if (opcion < 0 || opcion >= listaVideojuego.size()) {
					System.out.println("Numero incorrecto");
				}else {
					aux=true;
					
				}
			} while (aux==false);
			
			if (listaVideojuego.get(opcion).isAlquilado() == false) {
				listaVideojuego.remove(opcion);
				System.out.println("Videojuego eliminado correctamente");
				
			}else {
				System.out.println("El producto seleccionado se encuentra alquilado en estos momentos. No es posible la eliminacion.");
				
			}
			
		}
		
	}
	
}