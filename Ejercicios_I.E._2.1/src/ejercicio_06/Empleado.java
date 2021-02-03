package ejercicio_06;

/**
 * Clase Empleado que hereda nombre y edad de Persona y ademas añade el sueldo
 * 
 * @author Dani
 *
 */
public class Empleado extends Persona {

	private float sueldo;

	/**
	 * Constructor que incluye el nombre y edad de la persona y ademas añade el
	 * sueldo
	 * 
	 * @param n
	 * @param e
	 * @param s
	 */
	Empleado(String n, int e, float s) {
		super(n, e);
		sueldo = s;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * Metodo que retorna el sueldo del empleado y su nombre
	 * 
	 * @return
	 */
	public String imprimirSueldo() {
		return "El sueldo de " + nombre + " es de " + sueldo;
	}
}
