package ejercicio_39;

public class Ejercicio_39 {

	public static int fibonacci(int i) {
		if (i > 1) {
			return fibonacci(i - 1) + fibonacci(i - 2);
		} else if (i == 1) {
			return 1;
		} else if (i == 0) {
			return 0;
		} else {
			System.out.println("Debe insertar un numero mayor o igual a 1");
			return 0;
		}
	}

	public static void main(String[] args) {

		System.out.println("Cuantos numero quiere sacar de la serie de Fibonacci");
		for (int i = 0; i <= 20; i++) {
			System.out.println(fibonacci(i));
		}

	}

}
