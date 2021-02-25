package ejercicio_abstracta;

import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static HashSet<CuentaCorriente> cuentasCorrientes = new HashSet<>();
	static HashSet<CuentaAhorro> cuentasAhorro = new HashSet<>();

	public static void main(String[] args) {
		
		inicializar();

		int opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				crearCuenta();
				break;
			case 2:
				visualizarCuentas();
				break;
			case 3:
				ingresarDinero();
				break;
			case 4:
				retirarDinero();
				break;
			case 5:
				actualizarSaldo();
				break;
			case 6:
				cambiarInteres();
				break;
			case 0:
				break;
			}
		} while (opcion != 0);
	}
	
	private static void inicializar() {
		Persona per1 = new Persona("Daniel", "Lozano Campano", "77847769Z");
		CuentaCorriente cu1 = new CuentaCorriente(per1);
		cuentasCorrientes.add(cu1);
		
		Persona per2 = new Persona("David", "Aguilar Martin", "58632918H");
		CuentaAhorro cu2 = new CuentaAhorro(per2, 2.0f, 1000);
		cuentasAhorro.add(cu2);
	}

	private static int menu() {
		int opcion;
		System.out.println("======================================");
		System.out.println("1. Crear Cuenta.");
		System.out.println("2. Ver todas las Cuentas.");
		System.out.println("3. Ingresar Dinero.");
		System.out.println("4. Retirar Dinero.");
		System.out.println("5. Actualizar Saldo.");
		System.out.println("6. Cambiar el Interes.");
		System.out.println("0. Salir.");
		System.out.println("=====================================");
		opcion = LecturaTeclado("Introduce opcion (0 a 6): ", 0, 6);
		return opcion;
	}

	private static int menuCuenta() {
		int opcion;
		System.out.println("==================================");
		System.out.println("Que tipo de cuenta quiere crear:");
		System.out.println("1. Cuenta Corriente");
		System.out.println("2. Cuenta de Ahorro");
		System.out.println("0. Salir sin crear Cuenta");
		System.out.println("==================================");
		opcion = LecturaTeclado("Introduce opcion (0 a 2): ", 0, 2);
		return opcion;
	}

	private static void crearCuenta() {
		int opcion = menuCuenta();
		switch (opcion) {
		case 1:
			System.out.println("Introduzca los siguientes datos:");
			System.out.print("Nombre del Cliente: ");
			String nom1 = sc.next();
			System.out.print("Apellidos del Cliente: ");
			String ap1 = sc.next();
			System.out.print("DNI del Cliente: ");
			String nif1 = sc.next();

			Persona per1 = new Persona(nom1, ap1, nif1);
			CuentaCorriente cu1 = new CuentaCorriente(per1);
			cuentasCorrientes.add(cu1);
			break;
		case 2:

			System.out.println("Introduzca los siguientes datos:");
			System.out.print("Nombre del Cliente: ");
			String nom2 = sc.next();
			System.out.print("Apellidos del Cliente: ");
			String ap2 = sc.next();
			System.out.print("DNI del Cliente: ");
			String nif2 = sc.next();
			
			Persona per2 = new Persona(nom2, ap2, nif2);
			CuentaAhorro cu2 = new CuentaAhorro(per2, opcion, opcion);
			cuentasAhorro.add(cu2);
			break;
		}
	}
	
	private static void visualizarCuentas() {	
		System.out.println("Cuentas Corrientes:");
		cuentasCorrientes.stream().forEach(cuco -> System.out.println(cuco));
		System.out.println("\nCuentas de Ahorro");
		cuentasAhorro.stream().forEach(cuah -> System.out.println(cuah));
	}
	
	private static void ingresarDinero() {
		System.out.println("Cuentas Corrientes:");
		cuentasCorrientes.stream().forEach(cuco -> System.out.println(cuco));
		System.out.println("\nCuentas de Ahorro");
		cuentasAhorro.stream().forEach(cuah -> System.out.println(cuah));
		
		long numCuen = LecturaTecladoLong("Introduzca el numero de cuenta que quiera ingresar dinero : ");
		
		cuentasCorrientes
			.stream()
			.filter(cuco -> cuco.getNumeroCuenta()==numCuen)
			.forEach(cuco -> {
				double ingreso = LecturaTecladoDou("Introduca cantidad a ingresar: ");
				cuco.ingresar(ingreso);	
			});
			
		cuentasAhorro
			.stream()
			.filter(cuah -> cuah.getNumeroCuenta()==numCuen)
			.forEach(cuah -> {
				double ingreso = LecturaTecladoDou("Introduca cantidad a ingresar: ");
				cuah.ingresar(ingreso);
			});
	}
	
	private static void retirarDinero() {
		System.out.println("Cuentas Corrientes:");
		cuentasCorrientes.stream().forEach(cuco -> System.out.println(cuco));
		System.out.println("\nCuentas de Ahorro");
		cuentasAhorro.stream().forEach(cuah -> System.out.println(cuah));
		
		long numCuen = LecturaTecladoLong("Introduzca el numero de cuenta que quiera Retirar dinero : ");
		
		cuentasCorrientes
			.stream()
			.filter(cuco -> cuco.getNumeroCuenta()==numCuen)
			.forEach(cuco -> {
				double retirar = LecturaTecladoDou("Introduca cantidad a Retirar: ");
				cuco.retirar(retirar);	
			});
			
		cuentasAhorro
			.stream()
			.filter(cuah -> cuah.getNumeroCuenta()==numCuen)
			.forEach(cuah -> {
				double retirar = LecturaTecladoDou("Introduca cantidad a Retirar: ");
				cuah.retirar(retirar);
			});
	}
	
	private static void actualizarSaldo() {
		System.out.println("Cuentas Corrientes:");
		cuentasCorrientes.stream().forEach(cuco -> System.out.println(cuco));
		System.out.println("\nCuentas de Ahorro");
		cuentasAhorro.stream().forEach(cuah -> System.out.println(cuah));
		
		long numCuen = LecturaTecladoLong("Introduzca el numero de cuenta que quiera Actualizar el Saldo : ");
		
		cuentasCorrientes
			.stream()
			.filter(cuco -> cuco.getNumeroCuenta()==numCuen)
			.forEach(cuco -> cuco.actualizarSaldo());
			
		cuentasAhorro
			.stream()
			.filter(cuah -> cuah.getNumeroCuenta()==numCuen)
			.forEach(cuah -> cuah.actualizarSaldo());
	}
	
	public static void cambiarInteres() {
		System.out.println("\nCuentas de Ahorro");
		cuentasAhorro.stream().forEach(cuah -> System.out.println(cuah));
		
		long numCuen = LecturaTecladoLong("Introduzca el numero de cuenta que quiera Cambiar el Interes : ");
		
		cuentasAhorro
		.stream()
		.filter(cuah -> cuah.getNumeroCuenta()==numCuen)
		.forEach(cuah -> {
			float variable = LecturaTecladoFloat("Introduca el nuevo valor del Interes: ");
			cuah.setInteresVariable(variable);
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
	
	public static long LecturaTecladoLong(String string) {
		boolean sal = false;
		long entero = 0L;
		do {
			try {
				System.out.print(string);
				entero = sc.nextLong();
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
	
	public static float LecturaTecladoFloat(String string) {
		boolean sal = false;
		float entero = 0f;
		do {
			try {
				System.out.print(string);
				entero = sc.nextFloat();
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
		double entero = 0L;
		do {
			try {
				System.out.print(string);
				entero = sc.nextDouble();
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
