package ejercicio_02;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private String direccion;
	private int telefono;
	
	public Cliente (String dni, String n, String a, String d, int t) {
		this.dni = dni;
		nombre = n;
		apellido = a;
		direccion = d;
		telefono = t;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
