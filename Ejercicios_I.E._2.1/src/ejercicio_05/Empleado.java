package ejercicio_05;

/**
 * Clase empleado que nos sirve para calcular sus nominas y almacenar sus datos
 * 
 * @author Dani
 *
 */
public class Empleado implements Cloneable {

	// Atributos
	private String nif;
	private float sueldoBase;
	private float horaExtra;
	private float irpf;
	private boolean casado;
	private int nHijos;

	private float pagoHExtra;
	private float sueldoBruto;
	private float retencion;
	private float sueldoNeto;

	/**
	 * Constructor Empleado que tiene en cuenta todos los atributos salvo el dni
	 * 
	 * @param sueldoBase
	 * @param horaExtra
	 * @param irpf
	 * @param casado
	 * @param nHijos
	 */
	public Empleado(float sueldoBase, float horaExtra, float irpf, boolean casado, int nHijos) {
		this.sueldoBase = sueldoBase;
		this.horaExtra = horaExtra;
		this.irpf = irpf;
		this.casado = casado;
		this.nHijos = nHijos;
	}

	/**
	 * Contructor que si influye el dni
	 * 
	 * @param nif
	 * @param sueldoBase
	 * @param horaExtra
	 * @param irpf
	 * @param casado
	 * @param nHijos
	 */
	public Empleado(String nif, float sueldoBase, float horaExtra, float irpf, boolean casado, int nHijos) {
		this.nif = nif;
		this.sueldoBase = sueldoBase;
		this.horaExtra = horaExtra;
		this.irpf = irpf;
		this.casado = casado;
		this.nHijos = nHijos;
	}

	// Metodos
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public float getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public float getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(float horaExtra) {
		this.horaExtra = horaExtra;
	}

	public float getIrpf() {
		return irpf;
	}

	public void setIrpf(float irpf) {
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getnHijos() {
		return nHijos;
	}

	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}

	/**
	 * Metodo que calcula cuanto cobrara segun la cantidad de horas extras
	 * 
	 * @param horas
	 */
	public void calculoHorasExtra(float horas) {
		pagoHExtra = horas * this.horaExtra;
		System.out.println("El pago de las horas extra es de " + pagoHExtra + " habiendo trabajado " + horas
				+ " y pagandolas a " + this.horaExtra);
	}

	/**
	 * Metodo que calcula el sueldo bruto segun el sueldo base y el pago de horas
	 * extra
	 */
	public void calculoSueldoBruto() {
		sueldoBruto = this.sueldoBase + this.pagoHExtra;
		System.out.println("El sueldo bruto sera de " + sueldoBruto);
	}

	/**
	 * Metodo que calcula el total de irpf segun si el empleado esta casado y el
	 * numero de hijos
	 */
	public void calculoIrpf() {
		if (casado == true) {
			retencion = sueldoBruto * (((irpf - 2) - (1 * this.nHijos)) / 100);
		} else {
			retencion = sueldoBruto * ((irpf - (1 * this.nHijos)) / 100);
		}

		sueldoNeto = sueldoBruto - retencion;
		System.out.println("La retencion es de " + retencion + "€");
	}

	/**
	 * Metodo que retorna los datos del empleado
	 * 
	 * @return
	 */
	public String printIn() {
		return "Empleado [nif=" + nif + ", casado=" + casado + ", nHijos=" + nHijos + "]";
	}

	/**
	 * Metodos que retorna los datos del empleado y ademas sus retribuciones
	 * 
	 * @return
	 */
	public String printAll() {
		return "Empleado [nif=" + nif + ", sueldoBase=" + sueldoBase + ", horaExtra=" + horaExtra + ", irpf=" + irpf
				+ ", casado=" + casado + ", nHijos=" + nHijos + ", pagoHExtra=" + pagoHExtra + ", sueldoBruto="
				+ sueldoBruto + ", retencion=" + retencion + ", sueldoNeto=" + sueldoNeto + "]";
	}

	/**
	 * Metodo que copia los datos de un empleado en otro
	 * 
	 * @return
	 */
	public Empleado copia() {
		Empleado clon = null;
		try {
			clon = (Empleado) super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println("Error al duplicar");
		}
		return clon;
	}

}
