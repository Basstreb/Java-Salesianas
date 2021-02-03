package ejercicio_17;

import java.util.Scanner;

public class MainGestionPlaza {

	private static int num;
	private static String texto;
	private static boolean check;

	/**
	 * Metodo para realizar los trycatch de un int para mayor limpieza del Main
	 * 
	 * @return
	 */
	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				MainGestionPlaza.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return MainGestionPlaza.num;
	}

	/**
	 * Metodo para realizar los trycatch de un String para mayor limpieza del Main
	 * 
	 * @return
	 */
	public static String tryCatchString() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				MainGestionPlaza.texto = keyboard.next();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
			}
		} while (check);

		return MainGestionPlaza.texto;
	}

	public static void main(String[] args) {

		PlazaAparcamiento plaza1 = new PlazaAparcamiento(50);

		do {
			plaza1.muestraMenu();
			
			switch (MainGestionPlaza.tryCatchInt()) {
			case 1:
				plaza1.aparcaCoche();
				break;
			case 2:
				plaza1.sacarCoche();
				break;
			case 3:
				plaza1.mostrarCoche();
				break;
			case 4:
				plaza1.estadoPlaza();
				break;
			}
		} while (MainGestionPlaza.num != 4);

	}

}
