package teladearana;

import metodos.Metodos;

public class TeladeArana {

	public static void main(String[] args) {

		int cont = 0;
		int sum = 0;
		int peso;

		do {
			peso = Metodos.tryCatchInt();
		} while (Metodos.num < 0 || Metodos.num > 109);

		do {
			do {
				sum += Metodos.tryCatchInt();

				if (Metodos.num != 0) {
					if (peso >= sum) {
						cont++;
					}
				}
			} while (Metodos.num < 0 || Metodos.num > 109);
		} while (Metodos.num != 0);

		System.out.println(cont);
	}

}
