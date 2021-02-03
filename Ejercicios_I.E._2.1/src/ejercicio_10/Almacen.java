package ejercicio_10;

/**
 * Clase Almacen que nos guarda la cantidad de chocos y papas y un metodo para
 * añadir y otro para comprobar a cuantos comensales podemos servir
 * 
 * @author Dani
 *
 */
public class Almacen {

	private int chocos;
	private int papas;

	/**
	 * Constructor que recoge la cantidad de chocos y papas que hay en el almacen en
	 * kg
	 * 
	 * @param c
	 * @param p
	 */
	public Almacen(int c, int p) {
		chocos = c;
		papas = p;
	}

	/**
	 * Metodo que aumenta la cantidad de chocos en el almacen.
	 * 
	 * @param x
	 */
	public void addChocos(int x) {
		chocos += x;
	}

	/**
	 * Metodo que aumenta la cantidad de papas en el almacen.
	 * 
	 * @param x
	 */
	public void addPapas(int x) {
		papas += x;
	}

	/**
	 * Metodo que devuelve la cantidad de comensales a los que poder servir
	 * 
	 * @return
	 */
	public int getComensales() {
		int comensales = 0;
		int cantpapas = this.papas / 1;
		int cantchoco = (int) ((this.chocos) / (0.5));

		if (cantpapas <= cantchoco) {
			comensales = cantpapas;
		} else {
			comensales = cantchoco;
		}

		return comensales;
	}

	/**
	 * Metodo que muestra la cantidad de chocos
	 */
	public void showChocos() {
		System.out.println("Hay " + this.chocos + "kg de chocos");
	}

	/**
	 * Metodo que muestra la cantidad de papas
	 */
	public void showPapas() {
		System.out.println("Hay " + this.papas + "kg de papas");
	}

}
