package ejercicio_02;

/**
 * Clase Main para testear los constructores y metodos de la clase Vehiculo
 * 
 * @author Dani
 *
 */
public class Main {

	public static void main(String[] args) {

		Vehiculo coche1 = new Vehiculo("Mustang");
		coche1.setPotencia(550);
		coche1.setTraccion(false);

		Vehiculo coche2 = new Vehiculo("Ibiza");
		coche2.setPotencia(80);
		coche2.setTraccion(true);

		System.out.println(coche1.imprimir());
		System.out.println(coche2.imprimir());

	}

}
