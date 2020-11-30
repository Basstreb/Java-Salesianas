package ejercicio_16;

public class Guerrero extends Personaje {

	/**
	 * Atributos
	 */
	private String arma;

	/**
	 * 
	 * @param nombre
	 * @param energia
	 * @param arma
	 */
	Guerrero(String nombre, int energia, String arma) {
		super(nombre, energia);
		this.arma = arma;
	}

	// Metodos
	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	/**
	 * Metodo que resta la cantidad de energía que hayamos introducido, dando la
	 * informacion de los demas atributos. Y el arma elegida.
	 *
	 * @param energia
	 * @return String combatir
	 */
	public String combatir(int energia) {
		this.energia -= energia;
		return "El guerrero " + nombre + " ha atacado con " + this.arma + " y la cantidad de energia gastada es de "
				+ energia + " la energia restante es de " + this.energia;
	}
}
