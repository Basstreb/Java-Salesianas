package excepciones;

public class TratamientoExcepciones03 {

	public static void main(String[] args) {

		try {
			int a = 2;
			int b = 0;
			int resultado = a / b;
			String mensaje = null;
			System.out.println(mensaje.length());
		} catch (ArithmeticException ex) { // controlara la division entre 0 si esta se da
			System.err.println("Error: " + ex.getMessage());
		} catch (Exception ex) { // Solo actuara si la division fuese incorrecta.
			System.out.println("Se ha producido un error no esperado");
		}

	}

}
