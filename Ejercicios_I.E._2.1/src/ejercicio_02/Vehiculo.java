package ejercicio_02;

public class Vehiculo {
	
	//Attributes
	private String modelo;
	private double potencia;
	private boolean cRueda;
	
	//Constructors
	Vehiculo(String modelo) {
		this.modelo = modelo;
	}
	
	Vehiculo() {
	}
	
	//Methods
	public String getModelo() {
		return modelo;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public boolean isCRueda() {
		return cRueda;
	}
	public void setTraccion(boolean traccion) {
		this.cRueda = traccion;
	}
	
	public void imprimir(){
		if (cRueda) {
			System.out.println("El modelo es "+ modelo +" la potencia es de "+ potencia + "CV y tiene traccion a las cuatro ruedas");
		}
		else {
			System.out.println("El modelo es "+ modelo +" la potencia es de "+ potencia + "CV y no tiene traccion a las cuatro ruedas");
		}
	}
}
