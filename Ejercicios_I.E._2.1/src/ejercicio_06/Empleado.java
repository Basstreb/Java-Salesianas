package ejercicio_06;

public class Empleado {

	private Persona persona = null;
	private float sueldo;
	
	Empleado (String n, int e, float s){
		persona = new Persona(n, e);
		sueldo = s;
	}
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public String imprimirSueldo() {
		return "El sueldo de " + persona.getNombre() + " es de " + sueldo;
	}	
}
