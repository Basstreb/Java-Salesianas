package laslosetas;

import metodos.Metodos;

public class LasLosetas {

	public static void main(String[] args) {

		System.out.println("Introduzca numero de habitaciones a comprobar");
		int n = Metodos.tryCatchInt();
		int alto;
		int ancho;
		
		for (int i = 0; i < n; i++) {

			System.out.println("Introduzca el ancho de la habitacion");
			do {
				ancho = Metodos.tryCatchInt();
			} while (Metodos.num < 0 || Metodos.num > 1000);
			
			System.out.println("Introduzca el alto de la habitacion");
			do {
				alto = Metodos.tryCatchInt();
			} while (Metodos.num < 0 || Metodos.num > 1000);
			
			int superficie = ancho * alto;
			int losas = superficie/2;
			System.out.println("Losas blancas " + (superficie - losas) + " Losas negras " + losas);
		}

	}

}
