package ejercicio_14;

/**
 * Clase Marciano que recoje si esta vivo, el nombre y un static con el numero
 * de marcianos
 * 
 * @author Dani
 *
 */
public class Marciano {

	private boolean vivo = false;
	private String nombre;
	private static int numMarcianos = 0;

	/**
	 * Constructor de Marcianos que recibe el nombre, pone la booleana en true, sube
	 * en uno el contador y muestra el metodo nacer.
	 * 
	 * @param n
	 */
	public Marciano(String n) {
		nombre = n;
		vivo = true;
		numMarcianos++;
		nace();
	}

	/**
	 * Metodo que da vida a un marciano, y cambia el texto segun el numero de
	 * marcianos que hayan nacido
	 */
	public void nace() {
		if (numMarcianos == 1) {
			System.out.println(
					"Hola, he nacido y soy el marciano " + nombre + " y hay " + numMarcianos + " marciano vivo.");
		} else {
			System.out.println(
					"Hola, he nacido y soy el marciano " + nombre + " y hay " + numMarcianos + " marcianos vivos.");
		}

	}

	/**
	 * Metodo que mata a un marciano que este vivo, si no lo esta retorna un mensaje
	 * distinto
	 */
	public void muere() {
		if (vivo) {
			vivo = false;
			System.out.println("El marciano " + nombre + " ha muerto.");
			numMarcianos--;
		} else {
			System.out.println("El marciano ya esta muerto.");
		}
	}

	/**
	 * Metodo que comprueba si un marciano esta vivo o muerto
	 */
	public void estaVivo() {
		if (vivo) {
			System.out.println("El marciano esta vivo.");
		} else {
			System.out.println("El marciano esta muerto.");
		}
	}

	/**
	 * Metodo que muestra cuantos marcianos hay vivos o si no hay ninguno
	 */
	public static void cuentaMarcianos() {
		if (numMarcianos > 1) {
			System.out.println("Hay " + numMarcianos + " marcianos vivos de momento.");
		} else if (numMarcianos == 1) {
			System.out.println("Hay " + numMarcianos + " marciano vivo de momento.");
		} else {
			System.out.println("No hay ningun marciano vivo.");
		}
	}

}
