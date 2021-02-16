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
				sacarDinero();
				break;
			case 6:
				consultarSaldo();
				break;
			case 7:
				revisionMensual();
				break;
			case 8:
				cambiarComision();
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
		} else {
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
		if (cuentas.size() == 1000) {
			System.out.println("No se pueden crear mas cuentas");
		} else {
			if (clientes.size() == 0) {
				System.out.println("No hay ningun cliente al que crear cuenta");
			} else {
				double saldo = LecturaTecladoDou("Cuando dinero desea ingresar en la cuenta creada?\n");
				Cuenta cuenta = new Cuenta(saldo);
				cuentas.add(cuenta);
				check = false;
				do {
					System.out.println("A que Cliente quiere asignar la cuenta, introduzca su DNI");
					clientes.stream().forEach(c -> System.out.println(
							"Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " DNI: " + c.getDni()));
					String dni = sc.next();
					clientes.stream().filter(c -> c.getDni().equalsIgnoreCase(dni)).forEach(c -> {
						c.setCuenta(cuenta);
						cuenta.setCliente(c);
						check = true;
						System.out.println("Cuenta aniadida correctamente al Cliente");
					});
				} while (!check);
			}
		}
	}

	public static void listarClientesCuentas() {
		if (clientes.size() == 0) {
			System.out.println("No hay Clientes para Mostrar");
		} else {
			System.out.println("Clientes: ");
			clientes.stream().forEach(
					c -> System.out.println("Nombre: " + c.getNombre() + " | Apellido: " + c.getApellido() + " | DNI: "
							+ c.getDni() + " | Direccion: " + c.getDireccion() + " | Telefono: " + c.getTelefono()));
		}

		System.out.println("");

		if (cuentas.size() == 0) {
			System.out.println("No hay Cuentas para Mostrar");
		} else {
			System.out.println("Cuentas:");
			cuentas.stream().forEach(
					cu -> System.out.println("Numero Cuenta: " + cu.getNumCuenta() + " | Saldo: " + cu.getSaldo()
							+ " | DNI Cliente: " + cu.getCliente().getDni() + " Comision: " + cu.getComision()));
		}
	}

	public static void ingresarDinero() {
		if (cuentas.size() == 0) {
			System.out.println("No existen cuentas a las que ingresar dinero");
		} else {
			System.out.println("Introduzca DNI del Cliente");
			String dni = sc.next();
			check = false;

			cuentas.stream().filter(cu -> cu.getCliente().getDni().equalsIgnoreCase(dni)).forEach(cu -> {
				System.out.println("Numero de Cuenta: " + cu.getNumCuenta() + " DNI: " + cu.getCliente().getDni());
				check = true;
			});

			if (check) {
				check = false;
				double saldo = LecturaTecladoDou("Introduzca cantidad de saldo a ingresar:\n");
				do {
					long cuenta = LecturaTeclado("Introduzca el numero de cuenta en el que quiere ingresar dinero:\n");
					cuentas.stream().filter(cu -> cu.getNumCuenta() == cuenta).forEach(cu -> {
						cu.ingresarDinero(saldo);
						check = true;
					});
					if (!check)
						System.out.println("Numero de cuenta incorrecto");
				} while (!check);
			} else {
				System.out.println("El DNI del Cliente no es correcto.");
			}
		}
	}

	public static void sacarDinero() {
		if (cuentas.size() == 0) {
			System.out.println("No existen cuentas a las que ingresar dinero");
		} else {
			System.out.println("Introduzca DNI del Cliente");
			String dni = sc.next();
			check = false;

			cuentas.stream().filter(cu -> cu.getCliente().getDni().equalsIgnoreCase(dni)).forEach(cu -> {
				System.out.println("Numero de Cuenta: " + cu.getNumCuenta() + " DNI: " + cu.getCliente().getDni());
				check = true;
			});

			if (check) {
				check = false;
				double saldo = LecturaTecladoDou("Introduzca cantidad de saldo a retirar:\n");
				do {
					long cuenta = LecturaTeclado(
							"Introduzca el numero de cuenta en el que quiere cambiar la comision:\n");
					cuentas.stream().filter(cu -> cu.getNumCuenta() == cuenta).forEach(cu -> {
						cu.sacarDinero(saldo);
						check = true;
					});
					if (!check)
						System.out.println("Numero de cuenta incorrecto");
				} while (!check);
			} else {
				System.out.println("El DNI del Cliente no es correcto.");
			}
		}
	}

	public static void consultarSaldo() {
		if (cuentas.size() == 0) {
			System.out.println("No existen cuentas a las que ingresar dinero");
		} else {
			System.out.println("Introduzca DNI del Cliente");
			String dni = sc.next();
			check = false;

			cuentas.stream().filter(cu -> cu.getCliente().getDni().equalsIgnoreCase(dni)).forEach(cu -> {
				System.out.println("Numero de Cuenta: " + cu.getNumCuenta() + " Saldo: " + cu.getSaldo() + " DNI: "
						+ cu.getCliente().getDni());
				check = true;
			});

			if (!check)
				System.out.println("El DNI introducido no corresponde a ningun Cliente");
		}
	}

	public static void revisionMensual() {
		if (cuentas.size() == 0) {
			System.out.println("No existen cuentas a las que ingresar dinero");
		} else {
			System.out.println("Introduzca DNI del Cliente");
			String dni = sc.next();
			check = false;

			cuentas.stream().filter(cu -> cu.getCliente().getDni().equalsIgnoreCase(dni)).forEach(cu -> {
				System.out.println("Numero de Cuenta: " + cu.getNumCuenta() + " DNI: " + cu.getCliente().getDni());
				check = true;
			});

			if (check) {
				check = false;
				do {
					long cuenta = LecturaTeclado(
							"Introduzca el numero de cuenta en el que quiere realizar la revision mensual:\n");
					cuentas.stream().filter(cu -> cu.getNumCuenta() == cuenta).forEach(cu -> {
						cu.revisionMensual();
						check = true;
					});
					if (!check)
						System.out.println("Numero de cuenta incorrecto");
					else
						System.out.println("Revision mensual realizada correctamente");
				} while (!check);
			} else {
				System.out.println("El DNI del Cliente no es correcto.");
			}
		}
	}

	public static void cambiarComision() {
		if (cuentas.size() == 0) {
			System.out.println("No existen cuentas a las que ingresar dinero");
		} else {
			System.out.println("Introduzca DNI del Cliente");
			String dni = sc.next();
			check = false;

			cuentas.stream().filter(cu -> cu.getCliente().getDni().equalsIgnoreCase(dni)).forEach(cu -> {
				System.out.println("Numero de Cuenta: " + cu.getNumCuenta() + " DNI: " + cu.getCliente().getDni());
				check = true;
			});

			if (check) {
				check = false;
				double comision = LecturaTecladoDou("Introduzca la nueva comision:\n");
				do {
					long cuenta = LecturaTeclado(
							"Introduzca el numero de cuenta en el que quiere cambiar la comision:\n");
					cuentas.stream().filter(cu -> cu.getNumCuenta() == cuenta).forEach(cu -> {
						cu.setComision(comision);
						check = true;
					});
					if (!check)
						System.out.println("Numero de cuenta incorrecto");
					else
						System.out.println("Comision cambiada correctamente");
				} while (!check);
			} else {
				System.out.println("El DNI del Cliente no es correcto.");
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
