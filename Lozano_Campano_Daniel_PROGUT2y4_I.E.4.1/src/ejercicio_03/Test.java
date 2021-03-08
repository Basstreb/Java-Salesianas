package ejercicio_03;

import java.util.Scanner;

public class Test {

	private static int num;
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
				Test.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);
		return Test.num;
	}

	public static void main(String[] args) {

		// Aqui instanciamos el objeto radio para testear la clase Radio
		Radio radio = new Radio();

		System.out.println("Bienvenido a su radio");

		//Menu que nos permite controlar la radio y emplear todos los metodos.
		do {
			System.out.println("Escoja una opcion:");
			System.out.println(radio.menuRadio());
			switch (Test.tryCatchInt()) {
			case 1:
				radio.up_hez();
				break;
			case 2:
				radio.down_hez();
				break;
			case 3:
				radio.up_vol();
				break;
			case 4:
				radio.down_vol();
				break;
			case 5:
				radio.displayRadio();
				break;
			case 6:
				radio.changeCanal();
				break;
			case 7:
				radio.reset();
				break;
			}

		} while (Test.num != 8);
	}

}
