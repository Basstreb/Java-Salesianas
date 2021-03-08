package actividad;

public class Directivo extends Empleado {

	private double sueldo;
	private double comision;

	public Directivo(String nombre, String dni, double su, double co) {
		super(nombre, dni);
		sueldo = su;
		comision = co;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public double calcularSueldo() {
		double calcsueldo = sueldo + comision;
		return calcsueldo;
	}

	@Override
	public double retencion() {

		double retencion, importe;

		if (calcularSueldo() < 1000)
			retencion = 0.12;
		else if (calcularSueldo() >= 1000 && calcularSueldo() <= 1500)
			retencion = 0.15;
		else if (calcularSueldo() >= 1500 && calcularSueldo() <= 2500)
			retencion = 0.18;
		else
			retencion = 0.2;

		importe = calcularSueldo() * retencion;

		return importe;
	}

	@Override
	public double gratificacion(int nHijos) {
		double gratificacion = 0;

		if (nHijos == 0) {
			System.out.println("No tiene gratificacion");
		} else if (nHijos >= 1 && nHijos <= 3) {
			gratificacion = 200;
		} else {
			gratificacion = 300;
		}

		return gratificacion;
	}
	
	@Override
	public double calcular(int nHijos) {
		
		double importe;
		
		importe = calcularSueldo() - retencion() + gratificacion(nHijos);
		
		return importe;
		
	}
}
