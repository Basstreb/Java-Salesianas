package ejercicio_08;

/**
 * Clase Alumno que incorpora un atributo Asignatura para poder asignarlas y
 * modificarlas
 * 
 * @author Dani
 *
 */
public class Alumno {

	private Asignatura asignatura;
	private String nombre;
	private int edad;

	/**
	 * Constructor que define el nombre y edad del alumno
	 * 
	 * @param n
	 * @param e
	 */
	public Alumno(String n, int e) {
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

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

}
