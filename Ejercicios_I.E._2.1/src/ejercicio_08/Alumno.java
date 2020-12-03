package ejercicio_08;

public class Alumno {
	
	private Asignatura asignatura;
	private String nombre;
	private int edad;
	
	public Alumno(String n, int e) {
		asignatura = new Asignatura(null, 0);
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
