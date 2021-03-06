package ejercicio_01;

import java.util.*;

public class Biblioteca implements Interface{

	static Scanner sc = new Scanner(System.in);
	private static List<Libro> libros = new ArrayList<>();
	private static List<Socio> socios = new ArrayList<>();
	static int i = 0;

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
		opcion = LecturaTeclado("Introduce opcion(1 a 9): ", 1, 9);
		return opcion;
	}

	public static void verSociosBiblio() {
		if (socios.size() == 0) {
			System.out.println("No hay ningun socio en la Biblioteca.");
		} else {
			recorrerSocios();
		}
	}

	public static void verLibrosBiblio() {
		if (libros.size() == 0) {
			System.out.println("No hay ningun libro en la Biblioteca.");
		} else {
//			for(Libro li : libros) {
//				System.out.println(li);
//			}
			recorrerLibros();
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
		recorrerLibros();
		int libro = LecturaTeclado("Introduzca el numero del libro a  borrar: ");

		if (libros.size() <= libro) {
			System.out.println("No existe el libro indicado.");
		} else {
			if (libros.get(libro).getSocio() == null) {
				libros.remove(libro);
				System.out.println("Libro removido satisfactoriamente");
			} else {
				System.out.println("El libro no esta en la biblioteca, lo tiene el socio numero: "
						+ libros.get(libro).getSocio().getNumCarnet());
			}
		}
	}

	public static void borrarSocioBiblio() {
		verSociosBiblio();
		int borrar = LecturaTeclado("Introduzca el numero del carnet del socio a Borrar: ");
		boolean check = false;
		int socio = 0;

		for (Socio soci : socios) {
			if (soci.getNumCarnet() == borrar) {
				check = true;
			}

			if (!check) {
				System.out.println("Este socio no existe.");
			} else {
				System.out.println("Socio borrado correctamente.");
				soci.getLibros().stream().forEach(li -> li.setSocio(null));
				socio = socios.indexOf(soci);
				socios.remove(socio);
			}
		}
	}

	public static void sacarLibroSocio() {
		recorrerSocios();
		int numSocio = LecturaTeclado("Introduzca el numero de socio al que va a dar el libro: ");
		recorrerLibros();
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
			System.out.println("El numero introducido no corresponde a algun Socio.");
			return;
		}
		if (numLibro < 0 || numLibro >= libros.size()) {
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
		recorrerSocios();
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
			System.out.println("El numero introducido no corresponde a un socio.");
		else {
			if (socios.get(num).getLibros().size() == 0) {
				System.out.println("El socio introduzido no ha sacado ningun libro.");
			} else {
				for (int j = 0; j < socios.get(num).getLibros().size(); j++) {
					System.out.println(j + ". Titulo: " + socios.get(num).getLibros().get(j).getTitulo() + ", Autor: "
							+ socios.get(num).getLibros().get(j).getAutor());
					int libro = LecturaTeclado("Que libro quiere devolver?\n");
					if (libro < 0 || libro >= socios.get(num).getLibros().size()) {
						System.out.println("El numero introducido no corresponde a ningun libro.");
					} else {
						socios.get(num).getLibros().get(libro).setSocio(null);
						socios.get(num).getLibros().remove(libro);
						System.out.println("Libro devuelto satisfactoriamente.");
					}
				}
			}
		}
	}

	public static void recorrerLibros() {
		i = 0;
		libros.stream().forEach(li -> {
			System.out.print(i);
			i++;
			System.out.println(li);
		});
	}

	public static void recorrerSocios() {
		i = 0;
		socios.stream().forEach(so -> {
			System.out.print(i);
			i++;
			System.out.println(so);
		});
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