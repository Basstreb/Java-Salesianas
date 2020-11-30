package ejercicio_16;

public class Mago extends Personaje {

	// Atributos
	private String poder;

	/**
	 * Constructor heredado que establece la energia del mago en 100 y ademas
	 * recibir el nombre y su poder
	 * 
	 * @param nombre
	 * @param poder
	 */
	Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}

	// Metodos
	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	/**
	 * Metodo de ataque del mago que retorna el ataque realizado. Todos sus ataques
	 * siempre gastan 2 de energia.
	 * 
	 * @return Accion realiazada por el mago
	 */
	public String encantar() {
		this.energia -= 2;
		return "El mago " + nombre + " lanza su conjuro y gasta 2 de energia, la energia restante es de "
				+ this.energia;
	}

}
