package videojuego;

public class Personaje {

	String nombre;
	protected int energia;

	Personaje() {}
	
	Personaje(String nombre, int energia){
		this.nombre = nombre;
		this.energia = energia;
	}
	
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
