package ejercicio_09;

public class Empleado {

	private String nombre;
	private int salario;
	private Direccion direccion;

	public Empleado(String n, int s, Direccion dir) {
		nombre = n;
		salario = s;
		direccion = dir;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}
