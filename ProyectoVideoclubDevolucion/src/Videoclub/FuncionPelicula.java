package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.time.LocalDate;

/**
 * Esta clase contiene las funciones relacionadas con los objetos Pelicula
 */
public class FuncionPelicula {
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Pelicula> listaPelicula = new ArrayList<>();
	Excepcion ex = new Excepcion();
	
	FuncionPelicula(){}
	
	/**
	 * Metodo que crea y anade una pelicula a la coleccion de peliculas
	 */
	public void addPelicula() throws IOException {
		//Director (String)
		System.out.println("-ANIADIR PELICULA- \nTitulo de la pelicula");
		String titulo = teclado.readLine();
		
		//Anio. De cara al anio, se ha controlado que el anio introducido tan solo pueda ser posterior a 1950 (fecha arbitraria) y equivalente al anio en el que se ejecuta el sistema (String)
		System.out.println("Anio:");
		int cont;
		int num;
		String anio = null;
		do {
			
			num = ex.pedirInt();
			int date= LocalDate.now().getYear();
			
			if(num<1950 || num>(int)date) {
				cont=1;
				System.out.println("Anio no valido");
				
			}else {
				anio = String.valueOf(num);
				cont=0;
			}
		} while (cont==1);
		
		//Director
		System.out.println("Director:");
		String director = teclado.readLine();
		
		//Interpretes (String)
		System.out.println("Interpretes:");
		String interpretes = teclado.readLine();
		
		//Genero. Se obtiene las posibles opciones de la clse Enum "Genero"
		System.out.println("Genero:\nOpcion 1 para Accion\nOpcion 2 para Drama\nOpcion 3 para Aventuras\nOpcion 4 para Infantil");
		Genero genero=null;
		int k;
		do {
			k= ex.pedirInt();
		switch(k) {
			case 1:
				genero= Genero.ACCION;
				break;
			case 2: 
				genero= Genero.DRAMA;
				break;
			case 3:
				genero = Genero.AVENTURAS;
				break;
			case 4:
				genero = Genero.INFANTIL;
				break;
			default:
				System.out.println("Opcion no valida");
				break;
		}
		}while(k<=0 || k>4);
		
		//Plazo del alquiler (int)
		System.out.println("Plazo de alquiler (Introduzca los dias):");
		int plazoAlquiler =ex.pedirInt();
		
		//Precio (double)
		System.out.println("Precio (Si pone decimales, use un punto en vez de una coma):");
		double precioD=ex.pedirDouble();
		
		//Se crea el objeto pelicula. Por defecto, el atributo boolean "alquilado" es false.
		listaPelicula.add(new Pelicula(titulo, precioD, plazoAlquiler, false, genero, anio, director, interpretes));
	}
	
	/**
	 * Metodo que lista todas las peliculas de la coleccion Pelicula junto con su posicion en la coleccion
	 */
	public void listarPeliculaInventario(){
		Iterator<Pelicula> ite = listaPelicula.iterator();
		if (listaPelicula.isEmpty()) {
			System.out.println("No se han encontrado peliculas");
		}else {
			
			while (ite.hasNext()) {
				Pelicula p = ite.next();
				System.out.print(listaPelicula.indexOf(p));
				System.out.println(p.toString());
				
			}
		
		}
	}
	
	public void listarPeliculaDisponibles(){
		Iterator<Pelicula> ite = listaPelicula.iterator();
		if (listaPelicula.isEmpty()) {
			System.out.println("No se han encontrado peliculas");
		}else {
			
			while (ite.hasNext()) {
				Pelicula p = ite.next();
				if (listaPelicula.get(listaPelicula.indexOf(p)).isAlquilado() == false) {
					System.out.print(listaPelicula.indexOf(p));
					System.out.println(p.toString());
				}else {
					
					System.out.println("La pelicula [" + listaPelicula.indexOf(p) + "] esta alquilado en estos momentos.");
				}
				
			}
		
		}
	}
	
	/**
	 * Metodo que ficha una pelicula, es decir, la describe. La pelicula que va a ser descrita es elegida primero.
	 */
	public void fichaPelicula() throws IOException {
		if (listaPelicula.isEmpty()) {
			System.out.println("No hay ninguna pelicula");
		}else {
			int opcion = 0;
			do {
				try {
					listarPeliculaInventario();
					System.out.println("Ponga el numero que identifique a la pelicula");
					opcion = ex.pedirInt();
					
					System.out.println(listaPelicula.get(opcion).toString());
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Introduzca una opcion valida");
				}
			} while (opcion < 0 || opcion >= listaPelicula.size());
			
				
		}
	}
	
	/**
	 * Metodo que permite elegir una pelicula para luego eliminarla de la coleccion de Peliculas
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public void eliminarPelicula() throws NumberFormatException, IOException {
		boolean aux = false;
		int c = 0;
		if (listaPelicula.isEmpty()) {
			System.out.println("No hay ninguna pelicula");
		}else {
			do {
				listarPeliculaDisponibles();
				System.out.println("Introduzca el identificador de la pelicula a eliminar: ");
				c = ex.pedirInt();
				if (c < 0 || c >= listaPelicula.size()) {
					System.out.println("Numero incorrecto");
				}else {
					aux = true;
				}
				
			} while (aux == false);

			if (listaPelicula.get(c).isAlquilado() == false) {
				listaPelicula.remove(c);
			System.out.println("Pelicula eliminada correctamente");	
			
			}else {
				System.out.println("El producto seleccionado se encuentra alquilado en estos momentos. No es posible la eliminacion.");
				
			}
			
		}
	}
}
