package ejercicio_abstracta;

public class Persona {

	private String nombre, apellidos, nif;

	public Persona(String n, String a, String ni) {
		nombre = n;
		apellidos = a;
		nif = ni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return nombre + " " + apellidos + " con DNI: " + nif;
	}
}
