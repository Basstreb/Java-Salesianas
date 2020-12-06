package ejercicio_17;

import java.util.Scanner;

public class MainGestionPlaza {

	private static int num;
	private static String texto;

	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		try {
			MainGestionPlaza.num = keyboard.nextInt();
		} catch (Exception ex) {
			System.out.println("No ha introducido un valor valido.");
		}
		return MainGestionPlaza.num;
	}
	
	public static String tryCatchString() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		try {
			MainGestionPlaza.texto = keyboard.next();
		} catch (Exception ex) {
			System.out.println("No ha introducido un valor valido.");
		}
		return MainGestionPlaza.texto;
	}

	public static void main(String[] args) {

		PlazaAparcamiento plaza1 = new PlazaAparcamiento(50);

		plaza1.muestraMenu();

		do {
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
