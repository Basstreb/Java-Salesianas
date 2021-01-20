package cuadradoperfecto;

import metodos.Metodos;

public class CuadradoPerfecto {

	static boolean checkCuadradoPerfecto(double x) {
		double sq = Math.sqrt(x);
		return ((sq - Math.floor(sq)) == 0);
	}

	public static void main(String[] args) {
		
		System.out.println("Defina cantidad de numeros a comprobar cuadrado perfecto");
		do {
			Metodos.tryCatchInt();
		} while (Metodos.num<0);
		int[] entrada = new int[Metodos.num];
		int[] salida = new int[Metodos.num];
		int cuadrado;
		boolean check = false;
		
		System.out.println("Introduzca los numeros");
		Metodos.lecturaArray(entrada, 0, (int)Math.pow(2, 31));
		
		for (int i = 0; i < salida.length; i++) {
			check = false;
			for (int j = 1; j < entrada[i]; j++) {
				cuadrado = entrada[i] * j;
				if (checkCuadradoPerfecto(cuadrado)) {
					System.out.println(j);
					check = true;
				}
			}
			if (!check) {
				System.out.println(entrada[i]);
			}
		}
	}
}
