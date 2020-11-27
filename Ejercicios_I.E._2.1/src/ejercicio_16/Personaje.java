package ejercicio_16;

public class Personaje {

	//Atributos
	String nombre;
	protected int energia;
	
	//Constructor
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
		this.energia += energia;
	}
	
	public void alimentarse(int alim) {
		this.energia += alim;
	}
}
