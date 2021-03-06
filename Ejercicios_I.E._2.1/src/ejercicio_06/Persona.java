package ejercicio_06;

/**
 * Clase Persona que guarda nombre y edad de esta
 * @author Dani
 *
 */
public class Persona {

	protected String nombre;
	protected int edad;

	/**
	 * Constructor que define a la Persona
	 * 
	 * @param n
	 * @param e
	 */
	Persona(String n, int e) {
		nombre = n;
		edad = e;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo que imprime el nombre y la edad de la Persona creada
	 * 
	 * @return
	 */
	public String datosPersonales() {
		return "El nombre de esta perona es " + nombre + " y su edad es " + edad;
	}
}
