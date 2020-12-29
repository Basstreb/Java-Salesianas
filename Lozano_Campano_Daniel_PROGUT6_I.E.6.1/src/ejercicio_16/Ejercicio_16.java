package ejercicio_16;

public class Ejercicio_16 {

	public static void main(String[] args) {

		Integer[][] A = { { 1, 2 }, { 3, 4 } };
		Integer[][] B = { { 2, 3 }, { 4, 5 } };
		Integer[][] C = new Integer[2][2];

		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C.length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}

}
