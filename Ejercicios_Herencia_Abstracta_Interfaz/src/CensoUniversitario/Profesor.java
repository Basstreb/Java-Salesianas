package CensoUniversitario;

public class Profesor extends Persona {
	private String departamento;
	private double sueldo;
	//constructor
	public Profesor(String p_dni, String p_nombre, Fecha p_fecnac, String p_direccion, int p_tfno, String departamento, double sueldo) {
		super(p_dni, p_nombre, p_fecnac, p_direccion, p_tfno);
		this.departamento = departamento;
		this.sueldo = sueldo;
	}
	//métodos
	public String getDepartamento() {
		return this.departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSueldo() {
		return this.sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String toString() {
		return super.toString()+" # Profesor # - Departamento: "+ this.departamento;
	}
}