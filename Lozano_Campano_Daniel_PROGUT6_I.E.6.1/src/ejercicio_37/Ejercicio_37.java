package ejercicio_37;

public class Ejercicio_37 {

	//Metodo que nos imprime cualquier matriz de numeros enteros
	public static void imprimirMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * Metodo que nos permite llenar la matriz con numeros aleatorios
	 * @param matriz
	 */
	public static void llenarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				int aleatorio = (int) (Math.floor(Math.random() * 101));
				matriz[i][j] = aleatorio;
			}
		}
	}

	public static void main(String[] args) {

		/**
		 * Se recomienda no poner dimensiones mayor de 4, dado que difilcultara las
		 * condiciones de los numero silla
		 */
		int dim = 3;
		int[][] matriz = new int[dim][dim];
		llenarMatriz(matriz);

		int mayor = 0;
		int columna = 0;
		int cont = 0;
		boolean silla = false;

		for (int m = 0; m < matriz.length; m++) {

			cont = 0;
			mayor = 0;
			silla = false;

			for (int i = 0; i < matriz.length; i++) {
				if (matriz[i][columna] > mayor) {
					mayor = matriz[i][columna];
				}
			}

			for (int i = 0; i < matriz.length; i++) {
				cont = 0;
				if (matriz[i][columna] == mayor) {
					for (int j = 0; j < matriz.length; j++) {
						if (matriz[i][j] >= mayor) {
							cont++;
						}
						if (cont == dim) {
							silla = true;
						}
					}
				}
			}

			for (int i = 0; i < matriz.length; i++) {
				if (matriz[i][columna] == mayor && silla == true) {
					System.out.println("El numero silla es el " + mayor + " y se encuentra en la posicion [" + i + ","
							+ columna + "]");
				}
			}

//			System.out.println(mayor); Con esto verificamos cuales son los numeros mayores de cada fila y si son o no punto de silla.
//			System.out.println(silla);
			columna++;
		}

		System.out.println();
		imprimirMatriz(matriz); // Con esto podemos mostrar la matriz
	}
}
