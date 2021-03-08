package CensoUniversitario;

public class Persona {
	private String dni;
	private String nombre;
	private Fecha fechaNac;
	private String direccion;
	private int tfno;
	//constructor
	public Persona(String p_dni, String p_nombre, Fecha p_fecnac, String p_direccion, int p_tfno) {
		dni = p_dni;
		nombre = p_nombre;
		fechaNac = p_fecnac;
		direccion = p_direccion;
		tfno = p_tfno;
	}
	//métodos
	public String getDni() {
		return this.dni;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Fecha getFechaNac() {
		return this.fechaNac;
	}
	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTfno() {
		return this.tfno;
	}
	public void setTfno(int tfno) {
		this.tfno = tfno;
	}
	public String toString() {
		return dni + " " + nombre;
	}
}