package ejercicio_17;

public class Ejercicio_17 {

	public static void main(String[] args) {

		Integer[][] matriz = new Integer[3][3];
		int mayor = 0;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (int) (Math.random() * ((21 - 1) + 1));
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > mayor)
					mayor = matriz[i][j];
				if (matriz[i][j] < menor)
					menor = matriz[i][j];
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == mayor) {
					System.out.println("El numero mayor se encuentra en la posicion (" + i + "," + j + ")");
				}
				if (matriz[i][j] == menor) {
					System.out.println("El numero menor se encuentra en la posicion (" + i + "," + j + ")");
				}
			}
		}

	}

}
