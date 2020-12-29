package ejercicio_21;

public class Ejercicio_21 {

	public static void main(String[] args) {

		Integer[][] A = new Integer[2][2];
		Integer[][] B = new Integer[2][2];
		int stage;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = (int) (Math.random() * ((21 - 1) + 1));
				B[i][j] = (int) (Math.random() * ((21 - 1) + 1));
			}
		}

		System.out.println("Esta es la matriz A");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("");
		
		System.out.println("Esta es la matriz B");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (B[i][j] > A[i][j]) {
					stage = B[i][j];
					B[i][j] = A[i][j];
					A[i][j] = stage;
				}
			}
		}
		
		System.out.println("");
		
		System.out.println("Esta es la matriz A con los valores cambiados");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("");
		
		System.out.println("Esta es la matriz B con los valores cambiados");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}

	}

}
