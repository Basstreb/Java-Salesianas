package ejercicio_12;

public class Empleado {

	protected String nombre;
	private int horasTrabajo;
	private int tarifaHora;

	public Empleado(String n, int ht, int th) {
		nombre = n;
		horasTrabajo = ht;
		tarifaHora = th;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasTrabajo() {
		return horasTrabajo;
	}

	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}

	public int getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(int tarifaHora) {
		this.tarifaHora = tarifaHora;
	}
}
