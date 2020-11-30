package ejercicio_05;

public class Empleado {

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
	
	
	// Constructores
	public Empleado(float sueldoBase, float horaExtra, float irpf, boolean casado, int nHijos) {
		this.sueldoBase = sueldoBase;
		this.horaExtra = horaExtra;
		this.irpf = irpf;
		this.casado = casado;
		this.nHijos = nHijos;
	}

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

	public void calculoHorasExtra(float horas) {
		pagoHExtra = horas * this.horaExtra;
		System.out.println("El pago de las horas extra es de " + pagoHExtra + " habiendo trabajado " + horas
				+ " y pagandolas a " + this.horaExtra);
	}
	
	public void calculoSueldoBruto() {
		sueldoBruto = this.sueldoBase + this.pagoHExtra;
		System.out.println("El sueldo bruto sera de " + sueldoBruto);
	}
	
	public void calculoIrpf() {
		if (casado == true) {
			retencion = sueldoBruto * (((irpf-2)-(1*this.nHijos))/100);
		}
		else {
			retencion = sueldoBruto * ((irpf-(1*this.nHijos))/100);
		}
		
		System.out.println("La retencion es de " + retencion + "€");
	}
	
	
}
