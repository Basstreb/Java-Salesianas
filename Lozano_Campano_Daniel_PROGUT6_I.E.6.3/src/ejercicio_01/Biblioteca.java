package ejercicio_01;

import java.util.*;

public class Biblioteca {

	static Scanner sc = new Scanner(System.in);
	private static List<Libro> libros = new ArrayList<>();
	private static List<Socio> socios = new ArrayList<>();

	public static void main(String[] args) {

		inicializar();
		int opcion;

		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				verLibrosBiblio();
				break;
			case 2:
				verSociosBiblio();
				break;
			case 3:
				aniadirLibroBiblio();
				break;
			case 4:
				aniadirSocioBiblio();
				break;
			case 5:
				borrarLibroBiblio();
				break;
			case 6:
				borrarSocioBiblio();
				break;
			case 7:
				sacarLibroSocio();
				break;
			case 8:
				dejarLibroSocio();
				break;
			case 9:
				break;
			}
		} while (opcion != 9);

	}

	public static void inicializar() {
		Socio socio1 = new Socio("Paco");
		Socio socio2 = new Socio("Luis");
		socios.add(socio1);
		socios.add(socio2);

		Libro libro1 = new Libro("Harry Potter", "J.K. Rowling");
		Libro libro2 = new Libro("Seis de Cuervos", "Leigh Bardugo");
		libros.add(libro1);
		libros.add(libro2);
	}

	public static int menu() {
		int opcion;
		System.out.println("======================================");
		System.out.println("1. Ver Libros de la Biblioteca.");
		System.out.println("2. Ver Socios de la Biblioteca.");
		System.out.println("3. Aniadir Libros de la Biblioteca.");
		System.out.println("4. Aniadir Socios de la Biblioteca.");
		System.out.println("5. Borrar Libro de la Biblioteca.");
		System.out.println("6. Borrar Socio de la Biblioteca.");
		System.out.println("7. Extraer Libro para un Socio.");
		System.out.println("8. Devolver Libro de un Socio.");
		System.out.println("9. Salir de la Aplicacion.");
		System.out.println("======================================");
		opcion = LecturaTeclado("Introduce opci�n(1 a 9): ", 1, 9);
		return opcion;
	}

	public static void verSociosBiblio() {
		if (socios.size() == 0) {
			System.out.println("No hay ningun socio en la Biblioteca.");
		} else {
			for (int i = 0; i < socios.size(); i++) {
				System.out.println(i + ". Nombre: " + socios.get(i).getNombre() + ", numero de carnet: "
						+ socios.get(i).getNumCarnet());
			}
		}
	}

	public static void verLibrosBiblio() {
		if (libros.size() == 0) {
			System.out.println("No hay ningun libro en la Biblioteca.");
		} else {
			for (int i = 0; i < libros.size(); i++) {
				System.out
						.println(i + ". Titulo: " + libros.get(i).getTitulo() + ", Autor: " + libros.get(i).getAutor());
			}
		}
	}

	public static void aniadirLibroBiblio() {
		System.out.println("Introduza Titulo del libro.");
		String titulo = sc.next();
		System.out.println("Introduza Autor del libro.");
		String autor = sc.next();
		Libro libro = new Libro(titulo, autor);
		libros.add(libro);
	}

	public static void aniadirSocioBiblio() {
		System.out.println("Introduza el nombre del Socio");
		String nombre = sc.next();
		Socio socio = new Socio(nombre);
		socios.add(socio);
	}

	public static void borrarLibroBiblio() {
		int libro = LecturaTeclado("Introduzca el numero del libro a  borrar: ");
		if (libros.get(libro).getSocio() == null) {
			libros.remove(libro);
		} else {
			System.out.println("El libro no esta en la biblioteca, lo tiene el socio numero: "
					+ libros.get(libro).getSocio().getNumCarnet());
		}
	}

	public static void borrarSocioBiblio() {
		int borrar = LecturaTeclado("Introduzca el numero del carnet del socio a Borrar: ");
		boolean check = false;
		int socio = 0;

		for (int i = 0; i < socios.size(); i++) {
			if (socios.get(i).getNumCarnet() == borrar) {
				check = true;
				socio = i;
			}
		}
		System.err.println(socio);
		if (!check) {
			System.out.println("Este socio no existe.");
		} else {
			System.out.println("Socio borrado correctamente.");
			for (int i = 0; i < socios.get(socio).getLibros().size(); i++) {
				socios.get(socio).getLibros().get(i).setSocio(null);
			}
			socios.remove(socio);
		}
	}

	public static void sacarLibroSocio() {
		int numSocio = LecturaTeclado("Introduzca el numero de socio al que va a dar el libro: ");
		int numLibro = LecturaTeclado("Introduzca el numero de libro que quiera sacar: ");
		boolean check = false;
		int num = 0;

		for (int i = 0; i < socios.size(); i++) {
			if (socios.get(i).getNumCarnet() == numSocio) {
				check = true;
				num = i;
			}
		}
		if (!check) {
			System.out.println("El numero introducido no corresponde a algun Socio,");
			return;
		}
		if (numLibro < 0 || numLibro > socios.get(numSocio).getLibros().size()) {
			System.out.println("El numero introducido no corresponde a ningun Libro.");
			return;
		}

		if (libros.get(numLibro).getSocio() == null && check) {
			System.out.println("Libro asignado al socio correctamente.");
			socios.get(num).setLibro(libros.get(numLibro));
			libros.get(numLibro).setSocio(socios.get(num));
		} else {
			System.out.println("El numero del libro o el de socio son incorrectos o el libro ya ha sido sustraido.");

		}
	}

	public static void dejarLibroSocio() {
		int numSocio = LecturaTeclado("Introduzca el carnet de socio que desea devolver un libro: ");
		boolean check = false;
		int num = 0;

		for (int i = 0; i < socios.size(); i++) {
			if (socios.get(i).getNumCarnet() == numSocio) {
				check = true;
				num = i;
			}
		}
		if (!check)
			System.out.println("El numero introducido no corresponde a un socio");
		else {
			if (socios.get(num).getLibros().size() == 0) {
				System.out.println("El socio introduzido no ha sacado ningun libro");
			} else {
				for (int j = 0; j < socios.get(num).getLibros().size(); j++) {

					System.out.println(j + ". Titulo: " + socios.get(num).getLibros().get(j).getTitulo() + ", Autor: "
							+ socios.get(num).getLibros().get(j).getAutor());
					int libro = LecturaTeclado("Que libro quiere devolver?");
					if (libro < 0 || libro >= socios.get(num).getLibros().size()) {
						System.out.println("El numero introducido no corresponde a ningun libro");
					} else {
						socios.get(num).getLibros().get(libro).setSocio(null);
						socios.get(num).getLibros().remove(libro);
					}
				}
			}
		}
	}

	public static int LecturaTeclado(String string) {
		boolean sal = false;
		int entero = 0;
		do {
			try {
				System.out.print(string);
				entero = sc.nextInt();
				sc.nextLine();
				if (entero >= 0) {
					sal = true;
				}
			} catch (InputMismatchException i) {
				sc.nextLine();
			}
		} while (!sal);

		return entero;
	}// LecturaEntero

	public static int LecturaTeclado(String string, int min, int max) {
		boolean sal = false;
		int entero = 0;
		do {
			try {
				System.out.print(string);
				entero = sc.nextInt();
				sc.nextLine();
				if (entero >= min && entero <= max) {
					sal = true;
				}
			} catch (InputMismatchException i) {
				sc.nextLine();
			}
		} while (!sal);

		return entero;
	}// LecturaEntero
}