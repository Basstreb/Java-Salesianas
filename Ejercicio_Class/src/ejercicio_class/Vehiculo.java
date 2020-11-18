package ejercicio_class;

public class Vehiculo {
	
	//Attributes
	private String modelo;
	private double potencia;
	private boolean cRueda;
	
	//Constructors
	Vehiculo(String modelo) {
		this.modelo = modelo;
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
	
	public static void main(String[] args) {
		
		Vehiculo coche1 = new Vehiculo("Mustang");
		coche1.setPotencia(550);
		coche1.setTraccion(false);
		
		Vehiculo coche2 = new Vehiculo("Ibiza");
		coche2.setPotencia(80);
		coche2.setTraccion(true);
		
		coche1.imprimir();
		coche2.imprimir();
	}
}
