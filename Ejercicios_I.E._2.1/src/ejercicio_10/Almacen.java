package ejercicio_10;

public class Almacen {

	private int chocos;
	private int papas;
	
	public Almacen (int c, int p) {
		chocos = c;
		papas = p;
	}
	
	/**
	 * Metodo que aumenta la cantidad de chocos en el almacen.
	 * @param x
	 */
	public void addChocos(int x) {
		chocos += x;
	}
	
	/**
	 * Metodo que aumenta la cantidad de papas en el almacen.
	 * @param x
	 */
	public void addPapas(int x) {
		papas += x;
	}
	
	public int getComensales() {
		int comensales = 0;
		int cantpapas = this.papas/1;
		int cantchoco = (int) ((this.chocos) / (0.5));
		
		if (cantpapas<=cantchoco) {
			comensales = cantpapas;
		}else {
			comensales = cantchoco;
		}
		
		return comensales;
	}
	
	public void showChocos() {
		System.out.println("Hay " + this.chocos + "kg de chocos");
	}

	public void showPapas() {
		System.out.println("Hay " + this.papas + "kg de papas");
	}
	
}
