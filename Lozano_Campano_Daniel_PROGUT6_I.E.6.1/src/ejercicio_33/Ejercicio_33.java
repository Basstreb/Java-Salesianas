package ejercicio_33;

import java.util.Scanner;

public class Ejercicio_33 {

	private static int num;
	private static boolean check;

	private static int tryCatchInt() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		do {
			try {
				check = false;
				Ejercicio_33.num = keyboard.nextInt();
			} catch (Exception ex) {
				System.err.println("No ha introducido un valor valido.");
				keyboard.next();
				check = true;
			}
		} while (check);

		return Ejercicio_33.num;
	}

	public static void main(String[] args) {

		int[][] tablero = new int[8][8];

		/**
		 * Creamos numeros aleatorios entre 0 y 1 donde 0 significa que no tenemos mina
		 * y donde el 1 indica que hay una mina
		 */
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = (int) (Math.random() * ((2 - 1) + 1));
			}
		}

		// Mostramos el mapa para poder testear el programa
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}

		// Le pedimos al usuario que indique donde quiere colocar la ficha
		System.out.println(
				"Introduza el primer valor de la coordenada donde quiere colocar la ficha, recuerde que los valores son del 0 al 7");

		int pos1 = tryCatchInt();
		while (pos1 > 7 || pos1 < 0) {
			System.out.println("Coordenada incorrecta es mayor o menor de los valores posibles");
			pos1 = tryCatchInt();
		}

		System.out.println("Introduzca el segundo valor de la coordenada");
		int pos2 = tryCatchInt();
		while (pos2 > 7 || pos2 < 0) {
			System.out.println("Coordenada incorrecta es mayor o menor de los valores posibles");
			pos2 = tryCatchInt();
		}

		System.out.println(pos1);
		System.out.println(pos2);

		if (tablero[pos1][pos2] == 1) {
			System.out.println("Ha perdido el juego");
		} else {
			System.out.println("La ficha se ha colocado en un lugar correcto");
			do {
				System.out.println(
						"Hacia que direccion quiere moverla.\n1. Arriba\n2. Abajo\n3. Derecha\n4. Izquierda\n5. Ver posicion\n6. Salir");
				tryCatchInt();
				int menu = num;
				switch (menu) {
				case 1:
					pos1--;
					if (pos1 < 0) {
						System.out.println("No puede salirse del limite del tablero");
						pos1 = 0;
					}
					break;
				case 2:
					pos1++;
					if (pos1 > 7) {
						System.out.println("No puede salirse del limite del tablero");
						pos1 = 7;
					}
					break;
				case 3:
					pos2++;
					if (pos2 > 7) {
						System.out.println("No puede salirse del limite del tablero");
						pos2 = 7;
					}
					break;
				case 4:
					pos2--;
					if (pos2 < 0) {
						System.out.println("No puede salirse del limite del tablero");
						pos2 = 0;
					}
					break;
				case 5:
					System.out.println("[" + pos1 + "," + pos2 + "]");
					break;
				}

				if (tablero[pos1][pos2] == 1) {
					System.out.println("Ha perdido el juego");
					num = 6;
				}
			} while (num != 6);
		}

	}

}
