package teladearana;

import metodos.Metodos;

public class TeladeArana {

	public static void main(String[] args) {

		int cont = 0;
		int sum = 0;
		int peso;

		System.out.println("Defina el peso que soporta la tela de arania");
		do {
			peso = Metodos.tryCatchInt();
		} while (Metodos.num < 0 || Metodos.num > 109);

		System.out.println("Introduzca el peso de los elefantes que van llegando");
		do {
			do {
				Metodos.tryCatchInt();
			} while (Metodos.num < 0 || Metodos.num > 109);

			sum += Metodos.num;

			if (Metodos.num != 0) {
				if (peso >= sum) {
					cont++;
				}
			}
		} while (Metodos.num != 0);

		System.out.println("Se pueden balancear " + cont + " elefantes");
	}

}
