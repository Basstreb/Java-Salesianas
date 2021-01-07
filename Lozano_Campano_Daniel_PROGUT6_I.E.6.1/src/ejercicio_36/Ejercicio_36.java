package ejercicio_36;

import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicio_36 {

	public static void pasarHorizontalPositiva(char sopa[][], String palabra, int fila, int columna) {
		for (int i = 0; i < palabra.length(); i++) {
			sopa[fila][columna + i] = palabra.charAt(i);
		}
	}

	public static void pasarHorizontalNegativa(char sopa[][], String palabra, int fila, int columna) {
		int k = 0;
		for (int i = palabra.length() - 1; i >= 0; i--) {
			sopa[fila][columna + k] = palabra.charAt(i);
			k++;
		}
	}

	public static void pasarVerticalPositiva(char sopa[][], String palabra, int fila, int columna) {
		for (int i = 0; i < palabra.length(); i++) {
			sopa[fila + i][columna] = palabra.charAt(i);
		}
	}

	public static void pasarVerticalNegativa(char sopa[][], String palabra, int fila, int columna) {
		int k = 0;
		for (int i = palabra.length() - 1; i >= 0; i--) {
			sopa[fila + k][columna] = palabra.charAt(i);
			k++;
		}
	}

	public static void pasarDiagonalPositiva(char sopa[][], String palabra, int fila, int columna) {
		for (int i = 0; i < palabra.length(); i++) {
			sopa[fila + i][columna + i] = palabra.charAt(i);
		}
	}

	public static void pasarDiagonalNegativa(char sopa[][], String palabra, int fila, int columna) {
		int k = 0;
		for (int i = palabra.length() - 1; i >= 0; i--) {
			sopa[fila + k][columna + k] = palabra.charAt(i);
			k++;
		}
	}

	public static void visualizaSopa(char sopa[][]) {
		for (int i = 0; i < sopa.length; i++) {
			for (int j = 0; j < sopa.length; j++) {
				System.out.print(" " + sopa[i][j]);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {

		Random r = new Random();
		char sopa[][] = new char[15][15];

		for (int i = 0; i < sopa.length; i++) {
			for (int j = 0; j < sopa.length; j++) {
				sopa[i][j] = (char) (r.nextInt(26) + 'A');
			}
		}

		for (int i = 0; i < 10; i++) {
			String palabra = JOptionPane.showInputDialog("Introduzca 10 palabras");
			while (palabra.length() > 15 || palabra.length() == 0) {
				palabra = JOptionPane.showInputDialog("Introduzca 10 palabras");
			}

			palabra = palabra.toUpperCase();
			int aleatorio = (int) (Math.floor(Math.random() * 6) + 1);
			int fila = (int) Math.floor(Math.random() * 14);
			int columna = (int) Math.floor(Math.random() * 14);

			switch (aleatorio) {
			case 1:
				if (palabra.length() + columna > 15) {
					pasarHorizontalPositiva(sopa, palabra, fila, 15 - palabra.length());
				} else {
					pasarHorizontalPositiva(sopa, palabra, fila, columna);
				}
				break;
			case 2:
				if (palabra.length() + columna > 15) {
					pasarHorizontalNegativa(sopa, palabra, fila, 15 - palabra.length());
				} else {
					pasarHorizontalNegativa(sopa, palabra, fila, columna);
				}
				break;
			case 3:
				if (palabra.length() + fila > 15) {
					pasarVerticalPositiva(sopa, palabra, 15 - palabra.length(), columna);
				} else {
					pasarVerticalPositiva(sopa, palabra, fila, columna);
				}
				break;
			case 4:
				if (palabra.length() + fila > 15) {
					pasarVerticalNegativa(sopa, palabra, 15 - palabra.length(), columna);
				} else {
					pasarVerticalNegativa(sopa, palabra, fila, columna);
				}
				break;
			case 5:
				if (palabra.length() + fila > 15 || palabra.length() + columna > 15) {
					pasarDiagonalPositiva(sopa, palabra, 15 - palabra.length(), 15 - palabra.length());
				} else {
					pasarDiagonalPositiva(sopa, palabra, fila, columna);
				}
				break;
			case 6:
				if (palabra.length() + fila > 15 || palabra.length() + columna > 15) {
					pasarDiagonalNegativa(sopa, palabra, 15 - palabra.length(), 15 - palabra.length());
				} else {
					pasarDiagonalNegativa(sopa, palabra, fila, columna);
				}
				break;
			}
		}

		visualizaSopa(sopa);

	}

}
