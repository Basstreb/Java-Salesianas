package ejercicio_08;

/**
 * Clase asignatura que recoje los datos y los muestra
 * 
 * @author Dani
 *
 */
public class Asignatura {

	private String nombreAsignatura;
	private float nota;

	/**
	 * Constructor de la Clase que recoje la nota y el nombre de la asignatura
	 * 
	 * @param a
	 * @param n
	 */
	public Asignatura(String a, float n) {
		nombreAsignatura = a;
		nota = n;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	/**
	 * Metodo que retorna si la asignatura esta aprobada o suspendida
	 * 
	 * @return
	 */
	public String calificacion() {
		if (nota >= 5) {
			return "Aprobado";
		} else {
			return "Suspenso";
		}
	}

	/**
	 * Metodo que retorna el nombre de la asignatura
	 * 
	 * @return
	 */
	public String asignatura() {
		return nombreAsignatura;

	}
}
