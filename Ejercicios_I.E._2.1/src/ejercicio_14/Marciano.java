package ejercicio_14;

public class Marciano {

	private boolean vivo = false;
	private String nombre;
	private static int numMarcianos = 0;
	
	public Marciano(String n) {
		nombre = n;
		vivo = true;
		numMarcianos++;
		nace();
	}

	public void nace() {
		if (numMarcianos == 1) {
			System.out.println("Hola, he nacido y soy el marciano " + nombre + " y hay " + numMarcianos + " marciano vivo.");
		}else {
			System.out.println("Hola, he nacido y soy el marciano " + nombre + " y hay " + numMarcianos + " marcianos vivos.");
		}
		
	}
	
	public void muere() {
		if (vivo) {
			vivo = false;
			System.out.println("El marciano " + nombre + " ha muerto.");
			numMarcianos--;
		}else {
			System.out.println("El marciano ya esta muerto.");
		}
	}
	
	public void estaVivo() {
		if (vivo) {
			System.out.println("El marciano esta vivo.");
		}else {
			System.out.println("El marciano esta muerto.");
		}
	}
	
	public static void cuentaMarcianos() {
		if (numMarcianos > 1) {
			System.out.println("Hay " + numMarcianos + " marcianos vivos de momento.");
		}else if (numMarcianos == 1) {
			System.out.println("Hay " + numMarcianos + " marciano vivo de momento.");
		}else {
			System.out.println("No hay ningun marciano vivo.");
		}
	}
	
}
