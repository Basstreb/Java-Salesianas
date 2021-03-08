package Peaje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static HashMap<String, VehiculoA> vehiculos = new HashMap<>();
	private static List<CabinaPeajeA> cabinas = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	private static String matricula, res;
	private static int pesoTotal, ejes, pasajeros;
	private static CamionA cam;
	private static AutobusA aut;

	public static void main(String[] args) {

		while (true) {
			do {
				System.out.println("\n--- Operaciones de la Tienda ---");
				System.out.println(" 1 - Crear Vehiculo. ");
				System.out.println(" 2 - Crear Cabina. ");
				System.out.println(" 3 - Calcular Peaje. ");
				System.out.println(" 4 - Mostrar datos de Cabina. ");
				System.out.println(" 5 - Realizar Recaudacion. ");
				System.out.println(" 6 - Ver Vehiculos que han pasado. ");
				System.out.println(" 7 - Borrar Vehiculos que han pasado. ");
				System.out.println(" 8 - Salir. ");
				System.out.println(" Seleccione la operación: ");
				res = sc.next();
			} while (!res.equals("1") && !res.equals("2") && !res.equals("3") && !res.equals("4") && !res.equals("5")
					&& !res.equals("6") && !res.equals("7") && !res.equals("8"));
			// alta
			if (res.equals("1")) {
				crearVehiculo();
			}
			// baja
			else if (res.equals("2")) {
				crearCabina();
			}
			// consulta
			else if (res.equals("3")) {
				calculoPeaje();
			}
			// venta
			else if (res.equals("4")) {
				muestraDato();
			}
			// reponer
			else if (res.equals("5")) {
				recaudacion();
			}
			// modifica
			else if (res.equals("6")) {
				cantidadVehiculos();
			} else if (res.equals("7")) {
				borrarCantidad();
			}
			// salir
			else if (res.equals("8"))
				System.exit(0);
		}
	}

	private static void crearVehiculo() {
		System.out.println("\n -- Crear Vehículo -- ");
		System.out.println("Introduzca la Matricula del Vehículo: ");
		matricula = sc.next();
		do {
			System.out.println("Introduzca tipo de vehículo (1-Camion, 2-Autobus): ");
			res = sc.next();
		} while (!res.equals("1") && !res.equals("2"));
		if (res.equals("1")) {
			pesoTotal = LecturaTeclado("Introduzca el peso del Camion: ");
			ejes = LecturaTeclado("Introduzca la cantidad de Ejes del Camion: ");
			cam = new CamionA(matricula, pesoTotal, ejes);
			vehiculos.put(matricula, cam);
			System.out.println("\nVehiculo creado: " + cam.toString());
		} else {
			pesoTotal = LecturaTeclado("Introduzca el peso del Autobus: ");
			pasajeros = LecturaTeclado("Introduzca la cantidad de Pasajeros del Autobus: ");
			aut = new AutobusA(matricula, pesoTotal, pasajeros);
			vehiculos.put(matricula, aut);
			System.out.println("\nVehiculo creado: " + aut.toString());
		}
	}

	private static void crearCabina() {
		CabinaPeajeA cabina = new CabinaPeajeA();
		cabinas.add(cabina);
	}

	private static void calculoPeaje() {
		int numCabina = LecturaTeclado("Introduzca el numero de la cabina por la que pasa el Vehiculo: ");

		if (cabinas.isEmpty())
			System.out.println("No existen Cabinas en este Peaje");
		else {
			if (cabinas.size() < 0 || cabinas.size() < numCabina)
				System.out.println("Numero de Cabina incorrecto");
			else {
				System.out.print("Introduzca la Matricula del Vehículo: ");
				matricula = sc.next();
				if (vehiculos.containsKey(matricula))
					cabinas.get(numCabina).calculaPeaje(vehiculos.get(matricula));
				else
					System.out.println("No existe tal vehiculo");
			}
		}
	}

	private static void muestraDato() {
		int numCabina = LecturaTeclado("Introduzca el numero de la cabina de la cual quiera ver los datos: ");

		if (cabinas.isEmpty())
			System.out.println("No existen Cabinas en este Peaje");
		else {
			if (cabinas.size() < 0 || cabinas.size() < numCabina)
				System.out.println("Numero de Cabina incorrecto");
			else
				cabinas.get(numCabina).muestraDatos();
		}
	}

	private static void recaudacion() {
		int numCabina = LecturaTeclado("Introduzca el numero de la cabina de la cual quiera hacer la Recaudación: ");

		if (cabinas.isEmpty())
			System.out.println("No existen Cabinas en este Peaje");
		else {
			if (cabinas.size() < 0 || cabinas.size() < numCabina)
				System.out.println("Numero de Cabina incorrecto");
			else
				cabinas.get(numCabina).recaudar();
		}
	}

	private static void cantidadVehiculos() {
		System.out.println("Total vehículos de todas las cabinas: " + VehiculoA.getCantidad());
	}

	private static void borrarCantidad() {
		VehiculoA.borraCantidad();
	}

	private static int LecturaTeclado(String string) {
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

}
