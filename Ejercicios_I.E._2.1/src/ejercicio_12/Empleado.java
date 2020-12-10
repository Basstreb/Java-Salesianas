package ejercicio_12;

/**
 * Clase Empleado que guarda el nombre las horas de trabajo y la tarifa de este.
 * 
 * @author Dani
 *
 */
public class Empleado {

	protected String nombre;
	private int horasTrabajo;
	private int tarifaHora;

	/**
	 * Constructor de empleado que recoje el nombre, las horas de trabajo y cuanto
	 * cobra por estas
	 * 
	 * @param n
	 * @param ht
	 * @param th
	 */
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
	
	/**
	 * Metodo que muestra el sueldo bruto del empleado.
	 */
	public void sueldoBruto() {
		int sueldoBruto = 0;

		if (horasTrabajo > 40) {
			sueldoBruto = (int) ((tarifaHora * 40)
					+ ((horasTrabajo - 40) * tarifaHora * 1.5));
		} else {
			sueldoBruto = horasTrabajo * tarifaHora;
		}

		System.out.println(
				nombre + " trabajó " + horasTrabajo + " horas, cobra " + tarifaHora
						+ " euros la hora por lo que le corresponde un sueldo de " + sueldoBruto + " euros.");
	}
}
