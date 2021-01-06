package ejercicio_35;

public class Contacto {
	
	private String nombre;
	private String direccion;
	private int telefono;
	
	public Contacto(String n, String d,int t) {
		nombre = n;
		direccion = d;
		telefono = t;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
