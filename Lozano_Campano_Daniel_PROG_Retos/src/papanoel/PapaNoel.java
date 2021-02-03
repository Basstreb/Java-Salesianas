package papanoel;

import metodos.Metodos;

public class PapaNoel {

	public static void main(String[] args) {

		int casos = Metodos.tryCatchInt();
		int n;
		int a;
		int[] regalos;
		int tiempo;
		boolean check;

		for (int j = 0; j < casos; j++) {

			System.out.println("Introduzca cantidad de ninos en la cola");
			do {
				n = Metodos.tryCatchInt();
			} while (Metodos.num < 1 || Metodos.num > 100);

			System.out.println("Introduzca posicion de Aitor");
			do {
				a = Metodos.tryCatchInt();
			} while (Metodos.num < 1 || Metodos.num > 100);

			if (n == 1 && a > 1) {
				System.out.println("Posicion incorrecta para Aitor su posicion sera 1");
				a = 1;
			}

			regalos = new int[n];
			tiempo = 0;
			check = false;

			System.out.println("Introduzca cuantos regalos tiene cada nino");
			for (int i = 0; i < n; i++)
				do {
					regalos[i] = Metodos.tryCatchInt();
				} while (Metodos.num < 1 || Metodos.num > 100);

			while (check == false) {
				for (int i = 0; i < regalos.length; i++) {
					if (regalos[i] != 0) {
						tiempo += 2;
						regalos[i]--;
					}
					if (regalos[a - 1] == 0) {
						check = true;
						break;
					}
				}
			}
			System.out.println("El hermano tendra que esperar " + tiempo + " minutos");
		}
	}
}
