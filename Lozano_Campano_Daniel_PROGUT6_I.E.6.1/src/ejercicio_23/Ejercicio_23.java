package ejercicio_23;

public class Ejercicio_23 {

	private static boolean estaContenido(Integer A[], Integer B[], int m, int n) {

		int i = 0;
		int j = 0;

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (B[i] == A[j])
					break;
			/*
			 * Nos sirve para comprobar si el Array B esta contenido dentro del A
			 */
			if (j == m)
				return false;
		}
		/*
		 * Si llegamos a esta parte es debido a que el Array B esta contenido dentro del
		 * A
		 */
		return true;
	}

	public static void main(String[] args) {

		Integer[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer[] B = { 2, 5, 6 };
		Integer[] C = { 3, 8, 15 };

		int a = A.length;
		int b = B.length;
		int c = C.length;

		if (estaContenido(A, B, a, b))
			System.out.println("El array B esta contenido dentro de A");
		else
			System.out.println("El array B no esta contenido dentro de A");

		if (estaContenido(A, C, a, c))
			System.out.println("El array C esta contenido dentro de A");
		else
			System.out.println("El array C no esta contenido dentro de A");
	}

}
