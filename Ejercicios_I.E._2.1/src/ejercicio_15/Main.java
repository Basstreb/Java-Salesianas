package ejercicio_15;

import java.util.Scanner;

public class Main {

	private static int num;
	private static float cuenta;
	
	/**
	 * Trycatch para los numeros int
	 * @return
	 */
	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		try {
			Main.num = keyboard.nextInt();
		} catch (Exception ex) {
			System.out.println("No ha introducido un valor valido.");
		}
		return Main.num;
	}

	/**
	 * Trycatch para los numeros float
	 * @return
	 */
	public static float tryCatchFloat() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		try {
			Main.cuenta = keyboard.nextFloat();
		} catch (Exception ex) {
			System.out.println("No ha introducido un valor valido.");
		}
		return Main.cuenta;
	}

	public static void main(String[] args) {

		boolean controlCuentaCreada = false;
		boolean tipo = false;

		Cuenta[] cuentas = new Cuenta[2];

		do {
			System.out.println(
					"1.- Crear cuenta vacía.\n2.- Crear cuenta con saldo inicial.\n3.- Ingresar dinero.\n4.- Sacar dinero.\n5.- Ver saldo.\n6.- Salir.");
			
			switch (Main.tryCatchInt()) {
			case 1:
				if (!controlCuentaCreada) {
					controlCuentaCreada = true;
					tipo = false;
					cuentas[0] = new Cuenta();
					System.out.println("Ha creado usted una cuenta vacia");
				} else {
					System.out.println("Ya ha creado una cuenta");
				}
				break;
			case 2:
				if (!controlCuentaCreada) {
					controlCuentaCreada = true;
					tipo = true;
					cuentas[1] = new Cuenta(Main.tryCatchFloat());
					System.out.println("Ha creado una cuenta con " + cuentas[1].getSaldo() + "€.");
				} else {
					System.out.println("Ya ha creado una cuenta");
				}
				break;
			case 3:
				if (!controlCuentaCreada) {
					System.out.println("Debe crear una cuenta antes de ingresar dinero.");
				} else {
					if (tipo) {
						System.out.println();
						cuentas[1].ingresar(Main.tryCatchFloat());
						System.out.println("Ha ingresado dinero satisfactoriamente");
					} else {
						cuentas[0].ingresar(Main.tryCatchFloat());
						System.out.println("Ha ingresado dinero satisfactoriamente");
					}
				}
				break;
			case 4:
				if (!controlCuentaCreada) {
					System.out.println("Debe crear una cuenta antes de ingresar dinero.");
				} else {
					if (tipo) {
						cuentas[1].extraer(Main.tryCatchFloat());
						System.out.println("Ha retirado dinero satisfactoriamente");
					} else {
						cuentas[0].extraer(Main.tryCatchFloat());
						System.out.println("Ha retirado dinero satisfactoriamente");
					}
				}
				break;
			case 5:
				if (!controlCuentaCreada) {
					System.out.println("Debe crear una cuenta antes de ver el saldo disponible.");
				} else {
					if (tipo) {
						System.out.println(cuentas[1].getSaldo());
					} else {
						System.out.println(cuentas[0].getSaldo());
					}
				}
				break;
			}
			System.out.println("");
		} while (Main.num != 6);

	}

}
