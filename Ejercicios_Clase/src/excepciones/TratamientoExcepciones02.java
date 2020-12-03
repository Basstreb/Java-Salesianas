package excepciones;

public class TratamientoExcepciones02 {

	public static void main(String[] args) {

		try {
			int a = 2;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException ex) {
			System.err.println("Error: " + ex.getMessage());
		} finally {
			System.out.println(
					"\nEstas instrucciones son muy importantes. Deben ejecutase tanto si no ha habido excepciones, como si no.");
		}

	}

}
