package actividad;

public abstract class Empleado implements Calculos{

	private String nombre;
	private String dni;

	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	abstract public double calcularSueldo();
}
