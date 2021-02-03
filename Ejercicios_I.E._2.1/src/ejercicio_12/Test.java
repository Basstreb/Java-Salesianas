package ejercicio_12;

import java.util.Scanner;

public class Test {

	// Variables para los Try Catch
	private static int num;
	private static String texto;
	private static boolean check;

	/**
	 * Metodo para hacewr try catch con numeros enteros
	 * 
	 * @return
	 */
	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Test.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Test.num;
	}

	/**
	 * Metodo para un try catch para strings
	 * 
	 * @return
	 */
	public static String tryCatchString() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		try {
			Test.texto = keyboard.next();
		} catch (Exception ex) {
			System.out.println("No ha introducido un valor valido.");
		}
		return Test.texto;
	}

	public static void main(String[] args) {

		String nombre;
		int horasTrabajo;
		int cobroHoras;

		Empleado[] empleados = new Empleado[3];

		for (int i = 0; i < empleados.length; i++) {
			if (i == 0) {

				System.out.println("Introduza los datos del primer empleado:");
				System.out.println("-Nombre:");
				nombre = Test.tryCatchString();

				System.out.println("-Horas de trabajo:");
				horasTrabajo = Test.tryCatchInt();

				System.out.println("-Cobro por Horas de Trabajo:");
				cobroHoras = Test.tryCatchInt();

				empleados[i] = new Empleado(nombre, horasTrabajo, cobroHoras);
			} else if (i == 1) {
				System.out.println("Introduza los datos del segundo empleado:");
				System.out.println("-Nombre:");
				nombre = Test.tryCatchString();

				System.out.println("-Horas de trabajo:");
				horasTrabajo = Test.tryCatchInt();

				System.out.println("-Cobro por Horas de Trabajo:");
				cobroHoras = Test.tryCatchInt();

				empleados[i] = new Empleado(nombre, horasTrabajo, cobroHoras);
			} else {
				System.out.println("Introduza los datos del tercer empleado:");
				System.out.println("-Nombre:");
				nombre = Test.tryCatchString();

				System.out.println("-Horas de trabajo:");
				horasTrabajo = Test.tryCatchInt();

				System.out.println("-Cobro por Horas de Trabajo:");
				cobroHoras = Test.tryCatchInt();

				empleados[i] = new Empleado(nombre, horasTrabajo, cobroHoras);
			}
		}

		for (int i = 0; i < empleados.length; i++) {
			empleados[i].sueldoBruto();
		}

	}

}
