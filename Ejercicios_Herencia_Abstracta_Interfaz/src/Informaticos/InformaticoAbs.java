package Informaticos;

public abstract class InformaticoAbs {
	//Atributos
	private String empresa;
	private double sueldo;
	//Constructor
	public InformaticoAbs(String empresa) {
	this.empresa = empresa;
	}
	//M�todos
	public String getEmpresa() { return this.empresa; }
	public void setEmpresa(String nueva) { this.empresa = nueva; }
	public double getSueldo() { return this.sueldo; }
	public void setSueldo(double euros) { this.sueldo = euros; }
	//m�todo abstracto
	public abstract double pagarSueldo(double horas);
}