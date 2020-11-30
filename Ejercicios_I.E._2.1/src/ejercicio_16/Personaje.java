package ejercicio_16;

public class Personaje {

	//Atributos
	protected String nombre;
	protected int energia;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param energia
	 */
	public Personaje(String nombre, int energia){
		this.nombre = nombre;
		this.energia = energia;
	}
	
	//Metodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	/**
	 * Metodo para aumentar la energia
	 * @param energia
	 */
	public void alimentarse(int energia) {
		this.energia += energia;
	}
}
