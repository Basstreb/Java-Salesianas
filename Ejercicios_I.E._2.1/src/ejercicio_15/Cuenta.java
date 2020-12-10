package ejercicio_15;

/**
 * Metodo que almacena el dinero de la cuenta
 * 
 * @author Dani
 *
 */
public class Cuenta {

	private float dinero;

	/**
	 * Constructor que crea una cuenta vacia
	 */
	Cuenta() {
	}

	/**
	 * Constructor que define una cantidad de dinero
	 * 
	 * @param d
	 */
	Cuenta(float d) {
		dinero = d;
	}

	/**
	 * Metodo que aumenta el dinero que hay en la cuenta
	 * 
	 * @param c
	 */
	public void ingresar(float c) {
		dinero += c;
	}

	/**
	 * Dinero que dimenuye el dinero de la cuenta aunque sea negativo
	 * 
	 * @param c
	 */
	public void extraer(float c) {
		dinero -= c;
	}

	/**
	 * Metodo que muestra el saldo actual de la cuenta
	 * 
	 * @return
	 */
	public float getSaldo() {
		return dinero;
	}

}
