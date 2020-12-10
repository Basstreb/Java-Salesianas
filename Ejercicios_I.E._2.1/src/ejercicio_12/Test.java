package ejercicio_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	private static int num;
	private static String texto;

	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		try {
			Test.num = keyboard.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Ha introducido un valor incorrecto, tendra que cambialo mas adelante.");
		}
		return Test.num;
	}

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

		System.out.println(
				"Introduza los datos del primer empleado, nombre, horas de trabajo y cuanto cobra por estas.");
		Empleado empleado1 = new Empleado(Test.tryCatchString(), Test.tryCatchInt(), Test.tryCatchInt());

		System.out.println(
				"Introduza los datos del segundo empleado, nombre, horas de trabajo y cuanto cobra por estas.");
		Empleado empleado2 = new Empleado(Test.tryCatchString(), Test.tryCatchInt(), Test.tryCatchInt());

		System.out.println(
				"Introduza los datos del tercer empleado, nombre, horas de trabajo y cuanto cobra por estas.");
		Empleado empleado3 = new Empleado(Test.tryCatchString(), Test.tryCatchInt(), Test.tryCatchInt());

		empleado1.sueldoBruto();
		empleado2.sueldoBruto();
		empleado3.sueldoBruto();

	}

}
