package ejercicio_40;

public class Ejercicio_40 {

	public static void print(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(pascal(i, j) + " ");
			}
			System.out.println();
		}
	}

	public static int pascal(int i, int j) {
		if (j == 0 || j == i) {
			return 1;
		} else {
			return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}
	}

	public static void main(String[] args) {
		int filas = 5;
		print(filas);
	}

}
