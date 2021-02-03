package ejercicio_19;

public class Ejercicio_19 {

	public static void main(String[] args) {

		Integer[] A = new Integer[100];

		int num = 1;
		int x;
		int cont;

		for (int i = 0; i < A.length; i++) {
			A[i] = i + 1;
		}

		System.out.println(java.util.Arrays.toString(A));

		for (int i = 0; i < A.length; i++) {
			while (num <= A[i]) {
				x = 1;
				cont = 0;
				while (x <= num) {
					if (num % x == 0) {
						cont++;
					}
					x++;
				}
				if (cont == 2) {
					System.out.println(num);
				}
				num++;
			}
		}

	}

}
