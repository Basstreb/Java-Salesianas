package ejercicio_15;

import java.util.Scanner;

/**
 * Clase Main de Cuenta donde añadimos Try Catch
 * @author Dani
 *
 */
public class Main {

	// Atributos creados para los metodos trycatch
	private static int num;
	private static float cuenta;
	private static boolean check;

	/**
	 * Trycatch para los numeros int
	 * 
	 * @return
	 */
	public static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Main.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Main.num;
	}

	/**
	 * Trycatch para los numeros float
	 * 
	 * @return
	 */
	public static float tryCatchFloat() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Main.cuenta = keyboard.nextFloat();
			} catch (Exception ex) {
				System.out.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Main.cuenta;
	}

	public static void main(String[] args) {

		// Dos boolean para controlar la creacion de cuentas
		boolean controlCuentaCreada = false;
		boolean tipo = false;

		// Creamos un array para almacenar las dos cuentas
		Cuenta[] cuentas = new Cuenta[2];

		// Ciclo Do While para controlar el cajero
		do {
			System.out.println(
					"1.- Crear cuenta vacía.\n2.- Crear cuenta con saldo inicial.\n3.- Ingresar dinero.\n4.- Sacar dinero.\n5.- Ver saldo.\n6.- Salir.");

			switch (Main.tryCatchInt()) {
			case 1:
				//Primer if que nos verifica si hay una cuenta creada
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
				//Igual que en el anterior pero con la cuenta con dinero establecido
				if (!controlCuentaCreada) {

					controlCuentaCreada = true;
					tipo = true;

					System.out.println("Señale cantidad a introducir en la cuenta");

					cuentas[1] = new Cuenta(Main.tryCatchFloat());

					//Controla que no metamos dinero negativo en la cuenta
					while (Main.cuenta < 0) {
						System.out.println("No puede iniciar una cuenta en negativo");
						cuentas[1] = new Cuenta(Main.tryCatchFloat());
					}

					System.out.println("Ha creado una cuenta con " + cuentas[1].getSaldo());
				} else {
					System.out.println("Ya ha creado una cuenta");
				}
				break;
			case 3:
				if (!controlCuentaCreada) {
					System.out.println("Debe crear una cuenta antes de ingresar dinero.");
				} else {
					if (tipo) {
						float ingreso = Main.tryCatchFloat();

						while (ingreso < 0) {
							System.out.println("Ha introducido un ingreso negativo vuelva a probar la cantidad");
							ingreso = Main.tryCatchFloat();
						}

						cuentas[1].ingresar(ingreso);

						System.out.println("Ha ingresado dinero satisfactoriamente");
					} else {

						float ingreso = Main.tryCatchFloat();

						//Controlamos que no podamos ingresar dinero negativo el cual restaria dinero a la cuenta
						while (ingreso < 0) {
							System.out.println("Ha introducido un ingreso negativo vuelva a probar la cantidad");
							ingreso = Main.tryCatchFloat();
						}

						cuentas[0].ingresar(ingreso);

						System.out.println("Ha ingresado dinero satisfactoriamente");
					}
				}
				break;
			case 4:
				if (!controlCuentaCreada) {
					System.out.println("Debe crear una cuenta antes de ingresar dinero.");
				} else {
					if (tipo) {

						float retirar = Main.tryCatchFloat();

						//Controlamos que no saquemos dinero negativo que añadiria dinero
						while (retirar < 0) {
							System.out.println("Ha introducido una retirada negativa vuelva a probar la cantidad");
							retirar = Main.tryCatchFloat();
						}

						cuentas[1].extraer(retirar);
						System.out.println("Ha retirado dinero satisfactoriamente");

					} else {

						float retirar = Main.tryCatchFloat();

						while (retirar < 0) {
							System.out.println("Ha introducido un ingreso negativo vuelva a probar la cantidad");
							retirar = Main.tryCatchFloat();
						}

						cuentas[0].extraer(retirar);
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