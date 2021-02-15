package ejercicio_02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Banco {

	private static Scanner sc = new Scanner(System.in);
	private static List<Cuenta> cuentas = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();
	private static boolean check;

	public static void main(String[] args) {
		int opcion;
		
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				crearCliente();
				break;
			case 2:
				crearCuenta();
				break;
			case 3:
				listarClientesCuentas();
				break;
			case 4:
				ingresarDinero();
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 0:
				break;
			}
		} while (opcion != 0);
	}

	public static int menu() {
		int opcion;
		System.out.println("=======================");
		System.out.println("1. Nuevo Cliente");
		System.out.println("2. Nueva Cuenta");
		System.out.println("3. Listar Clientes y Cuentas");
		System.out.println("4. Ingresar Dinero");
		System.out.println("5. Sacar Dinero");
		System.out.println("6. Consultar Saldo");
		System.out.println("7. Revision Mensual");
		System.out.println("8. Cambiar Comision Mensual");
		System.out.println("0. Salir");
		System.out.println("=======================");
		opcion = LecturaTeclado("Introduce opcion(0 a 8): ", 0, 8);
		return opcion;
	}

	public static void crearCliente() {
		if (clientes.size() == 1000) {
			System.out.println("No se pueden crear mas clientes");
		}else {
			System.out.println("Introduzca el DNI del Cliente");
			String dni = sc.next();
			System.out.println("Introduzca el nombre del Cliente");
			String nombre = sc.next();
			System.out.println("Introduzca el apellido del Cliente");
			String apellido = sc.next();
			System.out.println("Introduzca la direccion del Cliente");
			String direccion = sc.next();
			int telefono = LecturaTeclado("Introduzca el telefono del Cliente.\n");
			Cliente cliente = new Cliente(dni, nombre, apellido, direccion, telefono);
			clientes.add(cliente);
		}
	}

	public static void crearCuenta() {
		if (clientes.size() == 0) {
			System.out.println("No hay ningun cliente al que crear cuenta");
		} else {
			double saldo = LecturaTecladoDou("Cuando dinero desea ingresar en la cuenta creada?\n");
			Cuenta cuenta = new Cuenta(saldo);
			cuentas.add(cuenta);
			check = false;
			do {
				System.out.println("A que Cliente quiere asignar la cuenta, introduzca su DNI");
				clientes.stream().forEach(c -> System.out
						.println("Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " DNI: " + c.getDni()));
				String dni = sc.next();
				clientes
					.stream()
					.filter(c -> c.getDni().equalsIgnoreCase(dni))
					.forEach(c -> {
						c.setCuenta(cuenta);
						cuenta.setCliente(c);
						check = true;
						System.out.println("Cuenta aniadida correctamente al Cliente");});
			} while (!check);
		}
	}

	public static void listarClientesCuentas() {
		clientes
			.stream()
			.forEach(c -> System.out.println("Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " DNI: " + c.getDni()));
	}
	
	public static void ingresarDinero() {
		System.out.println("Introduzca DNI del Cliente");
		String dni = sc.next();
		cuentas
			.stream()
			.filter(cu -> cu.getCliente().getDni().equalsIgnoreCase(dni))
			.forEach(cu -> System.out.println(cu.getNumCuenta()));
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

	public static double LecturaTecladoDou(String string) {
		boolean sal = false;
		double entero = 0;
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
