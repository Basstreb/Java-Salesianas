package actividad;

public class Comercial extends Empleado{

	private double sueldoBruto;
	private double importeVentas;
	
	public Comercial(String nombre, String dni, double sB, double iV) {
		super(nombre, dni);
		sueldoBruto = sB;
		importeVentas = iV;
	}
	
	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double getImporteVentas() {
		return importeVentas;
	}

	public void setImporteVentas(double importeVentas) {
		this.importeVentas = importeVentas;
	}

	@Override
	public double calcularSueldo() {
		double sueldo = sueldoBruto + cobrarComision();
		return sueldo;
	}
	
	public double cobrarComision() {
		double comision = importeVentas/10;
		return comision;
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
