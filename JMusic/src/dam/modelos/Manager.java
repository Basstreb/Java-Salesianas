package dam.modelos;

public class Manager {

	private String nombre;
	private int edad;
	private float sueldo;
	private Grupo grupo;

	public Manager(String n, int e, float s) {
		nombre = n;
		edad = e;
		sueldo = s;
	}
	
	public Manager(String n, int e, float s, Grupo g) {
		nombre = n;
		edad = e;
		sueldo = s;
		grupo = g;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	

	@Override
	public String toString() {
		return "El manager " + nombre + " representa al grupo " + grupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + Float.floatToIntBits(sueldo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Float.floatToIntBits(sueldo) != Float.floatToIntBits(other.sueldo))
			return false;
		return true;
	}

}
