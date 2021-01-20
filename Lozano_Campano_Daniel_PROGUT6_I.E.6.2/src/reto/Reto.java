package reto;

import java.util.ArrayList;

import metodos.Metodos;

public class Reto {

	public static void main(String[] args) {

		int ejercito;
		int suma;
		int temp;

		ArrayList<Integer> ejercit = new ArrayList<Integer>();

		do {
			do {
				Metodos.tryCatchInt();
			} while (Metodos.num < 0 || Metodos.num > (int) Math.pow(10, 7));
			if (Metodos.num != 0) {
				ejercit.add(Metodos.num);
			} else {
				break;
			}
		} while (Metodos.num != 0);

		for (int i = 0; i < ejercit.size(); i++) {

			ejercito = ejercit.get(i);
			if (ejercito == 0) {
				break;
			}
			suma = 0;

			while (true) {

				if (ejercito == 0) {
					break;
				}

				if (ejercito < 4) {
					suma += ejercito * 5;
					break;
				}

				temp = (int) Math.sqrt(ejercito);
				ejercito -= (temp * temp);
				suma += (temp - 2) * (temp - 2);
				suma += (((temp - 2) * 4) * 2) + 12;
			}
			System.out.println(suma);
		}
	}
}
