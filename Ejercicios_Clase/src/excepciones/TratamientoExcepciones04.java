package excepciones;

public class TratamientoExcepciones04 {

	public static void main(String[] args) {

		// String[] mensaje = {"En un lugar", "de La Mancha", "de cuyo nombre", "no
		// quiero acordarme"};
		String[] mensaje = { "En un lugar", null, "de cuyo nombre", "no quiero acordarme", "no ha mucho tiempo vivia" };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(mensaje[i].toUpperCase());
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
			System.err.println("Tratamiento comun a las excepciones");
		}

		System.out.println("Mensaje final");

	}

}
