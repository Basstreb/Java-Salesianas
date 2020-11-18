package ejercicios_class;

public class Persona {
	
	//Attributes
	private String nombre;
	private char genero;
	private String ocupacion;
	
	//Constructors
	
	
	//Methods
	public String obtenerNombre() {
		return this.nombre;
	}
	public char obtenerGenero() {
		return this.genero;
	}
	public String obtenerOcupacion() {
		return this.ocupacion;
	}
	public void modificarNombre(String nombre) {
		this.nombre = nombre;
	}
	public void modificarGenero(char genero) {
		this.genero = genero;
	}
	public void modificarOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	/*TAMBIEN PODRIAMOS HACERLO ASI, ES SOLO QUE ARRIBA ESTAMOS ESPECIFICANDO QUE HACE CADA MÉTODO
	 * public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}*/
}
