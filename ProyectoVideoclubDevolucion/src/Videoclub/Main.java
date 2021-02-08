package Videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	static FuncionCliente FunCliente = new FuncionCliente();
	static FuncionPelicula FunPelicula = new FuncionPelicula();
	static FuncionVideojuego FunVideojuego = new FuncionVideojuego();
	static FuncionRegistroAlquiler FunRegistroAlquiler = new FuncionRegistroAlquiler();

//	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	static Excepcion ex = new Excepcion();

	public static void main(String[] args) throws IOException {

		int opcion;

		do {

			menu();

			opcion = ex.pedirInt();

			switch (opcion) {

			case 0:
				System.out.println("Cerrando programa...");
				break;

			case 1:
				switch (elegirProducto()) {
				case 1:
					FunPelicula.listarPeliculaInventario();
					break;

				case 2:
					FunVideojuego.listarVideojuegosInventario();
					break;

				default:
					break;
				}
				break;

			case 2:
				switch (elegirProducto()) {
				case 1:
					FunPelicula.addPelicula();
					break;

				case 2:
					FunVideojuego.addVideojuego();
					break;

				default:
					break;
				}
				break;

			case 3:
				switch (elegirProducto()) {
				case 1:
					FunPelicula.fichaPelicula();
					break;

				case 2:
					FunVideojuego.fichaVideojuego();
					break;

				default:
					break;
				}
				break;

			case 4:
				switch (elegirProducto()) {
				case 1:
					FunPelicula.eliminarPelicula();
					break;

				case 2:
					FunVideojuego.eliminarVideojuego();
					break;

				default:
					break;
				}
				break;

			case 5:
				FunCliente.listarCliente();
				break;

			case 6:
				FunCliente.ficharSoloCliente();
				break;

			case 7:
				FunCliente.addCliente();
				break;

			case 8:
				FunCliente.eliminarCliente();
				break;

			case 9:
				alquilar();
				break;

			case 10:
				devolucion();
				break;

			case 11:
				FunRegistroAlquiler.listarRegistroAlquiler();
				break;

			default:
				System.out.println("Opcion no valida. Introduzca una opcion valida, por favor.");
				break;
			}

			System.out.println("");

		} while (opcion != 0);

	}

	/**
	 * Metodo que muestra un menu de cara a la eleccion de funcionalidades
	 */
	public static void menu() {

		System.out.println("GESTION VIDEOCLUB");
		System.out.println("=================");
		System.out.println("0. Salir del programa");
		System.out.println("1. Listado de productos");
		System.out.println("2. Anadir productos");
		System.out.println("3. Ficha de producto");
		System.out.println("4. Eliminar producto");
		System.out.println("5. Listado de clientes");
		System.out.println("6. Ficha de cliente");
		System.out.println("7. Anadir cliente");
		System.out.println("8. Eliminar cliente");
		System.out.println("9. Alquilar producto");
		System.out.println("10. Devolucion producto");
		System.out.println("11. Listado de los registros de alquiler");

	}

	/**
	 * Metodo que muestra las dos posibilidades de producto (pelicula y videojuego)
	 * y guarda el "int" correspondiente a la opcion elegida
	 * 
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static int elegirProducto() throws NumberFormatException, IOException {
		int opcion = 0;

		do {
			System.out.println("Elija el tipo de producto: ");
			System.out.println("1. Peliculas");
			System.out.println("2. Videojuegos");
			opcion = ex.pedirInt();

			if (opcion < 1 || opcion > 2) {
				System.out.println("Opcion no valida. Introduzca una opcion valida, por favor: ");
			}
		} while (opcion < 1 || opcion > 2);

		return opcion;
	}

	/**
	 * Metodo que permite alquilar productos a clientes. Involucra tanto la eleccion
	 * del cliente como del producto ademas de crear y almacenar un registro cuando
	 * se produce el alquiler
	 */
	public static void alquilar() throws IOException {

		Cliente ClienteTemporal = null;

		if (FunCliente.listaCliente.isEmpty()) {
			System.out.println("No hay ningun cliente");
		} else {
			FunCliente.listarCliente();
			System.out.println("Introduzca el identificador del cliente: ");
			int eleccion;
			boolean ok = true;
			do {
				eleccion = ex.pedirInt();
				if (FunCliente.listaCliente.containsKey(eleccion)) {
					ClienteTemporal = FunCliente.listaCliente.get(eleccion);
					ok = true;
				} else {
					System.out.println("Cliente incorrecto. Vuelva a introducir otro cliente");
					FunCliente.listarCliente();
					ok = false;
				}
			} while (ok == false);

			switch (elegirProducto()) {
			case 1:

				if (FunPelicula.listaPelicula.isEmpty()) {
					System.out.println("No hay ninguna pelicula");
				} else {
					FunPelicula.listarPeliculaDisponibles();
					System.out.println("Introduzca el identificador de la pelicula: ");

					boolean aux = true;

					do {

						eleccion = ex.pedirInt();

						if (eleccion < FunPelicula.listaPelicula.size() && eleccion >= 0) {

							if (FunPelicula.listaPelicula.get(eleccion).isAlquilado() == true) {
								System.out.println("Este producto no esta disponible");
								aux = true;

							} else {
								Pelicula peliculaTemporal = FunPelicula.listaPelicula.get(eleccion);

								peliculaTemporal.setAlquilado(true);

								ClienteTemporal.addPelicula(peliculaTemporal);

								FunRegistroAlquiler.addRegistroPelicula(ClienteTemporal, peliculaTemporal);
								aux = true;

							}

						} else {

							System.out.println("Codigo incorrecto, por favor introduzca otro");
							aux = false;
						}
					} while (aux == false);
				}

				break;

			case 2:

				if (FunVideojuego.listaVideojuego.isEmpty()) {
					System.out.println("No hay ningun videojuego");
				} else {
					FunVideojuego.listarVideojuegosDisponibles();
					System.out.println("Introduzca el identificador del videojuego: ");

					boolean aux1 = true;

					do {

						eleccion = ex.pedirInt();

						if (eleccion < FunVideojuego.listaVideojuego.size() && eleccion >= 0) {

							if (FunVideojuego.listaVideojuego.get(eleccion).isAlquilado() == true) {
								System.out.println("Este producto no esta disponible");
								aux1 = true;

							} else {

								System.out.println("Introduzca el identificador del videojuego:");
								Videojuego VideojuegoTemporal = FunVideojuego.listaVideojuego.get(eleccion);

								ClienteTemporal.addVideojuego(VideojuegoTemporal);

								VideojuegoTemporal.setAlquilado(true);

								FunRegistroAlquiler.addRegistroVideojuego(ClienteTemporal, VideojuegoTemporal);

								aux1 = true;
							}

						} else {

							System.out.println("Codigo incorrecto, por favor introduzca otro");
							aux1 = false;
						}
					} while (aux1 == false);
				}

				break;

			default:
				break;
			}

		}

	}

	public static void devolucion() throws IOException {

		if (FunCliente.listaCliente.isEmpty()) {
			System.out.println("No hay ningun cliente");
		} else {
			FunCliente.listarCliente();
			System.out.println("Introduzca el identificador del cliente: ");
			int eleccion;
			boolean ok = false;
			do {
				eleccion = ex.pedirInt();
				if (FunCliente.listaCliente.containsKey(eleccion)) {
					int a = elegirProducto();
					switch (a) {
					case 1:
						if (FunCliente.listaCliente.get(eleccion).clientePeliculas.isEmpty()) {
							System.out.println("No hay peliculas");
						} else {
							FunCliente.listaCliente.get(eleccion).listarPeliculas();
							System.out.println("Seleccione la pelicula a devolver:");

							boolean okay = false;

							do {
								int opcion = ex.pedirInt();
								if (opcion < 0 || opcion >= FunPelicula.listaPelicula.size()) {
									System.out.println("Opcion no valida. Introduzca otra opcion: ");

								} else {
									for (Pelicula peli : FunPelicula.listaPelicula) {
										if (FunCliente.listaCliente.get(eleccion).clientePeliculas.get(opcion)
												.equals(peli)) {
											FunCliente.listaCliente.get(eleccion).clientePeliculas.remove(opcion);
											peli.setAlquilado(false);
											okay = true;
										}
									}

								}
							} while (okay == false);
						}

						break;

					case 2:
						if (FunCliente.listaCliente.get(eleccion).clienteVideojuegos.isEmpty()) {
							System.out.println("No hay videojuegos");
						} else {

							FunCliente.listaCliente.get(eleccion).listarVideojuegos();
							System.out.println("Seleccione el videojuego a devolver:");

							boolean okay2 = false;

							do {
								int opcion2 = ex.pedirInt();
								if (opcion2 < 0 || opcion2 >= FunVideojuego.listaVideojuego.size()) {
									System.out.println("Opcion no valida. Introduzca otra opcion: ");

								} else {
									for (Videojuego game : FunVideojuego.listaVideojuego) {
										if (FunCliente.listaCliente.get(eleccion).clienteVideojuegos.get(opcion2)
												.equals(game)) {
											FunCliente.listaCliente.get(eleccion).clienteVideojuegos.remove(opcion2);
											game.setAlquilado(false);
										}
									}
									okay2 = true;
								}
							} while (okay2 == false);
						}

						break;

					default:
						break;
					}

					ok = true;
				} else {

				}
			} while (ok == false);

		}
	}
}
