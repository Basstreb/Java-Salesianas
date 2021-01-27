package anexo2;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
	public int idPersona;
	public String nombre;
	public int altura;

	public Persona(int idPersona, String nombre, int altura) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona-> ID: " + idPersona + " Nombre: " + nombre + " Altura:" + altura + "\n";
	}

	@Override
	public int compareTo(Persona o) {
		return this.idPersona - o.idPersona;
	}

	@Override
	public int hashCode() {
		return altura + nombre.hashCode() + idPersona;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Persona other = (Persona) obj;
		if (this.idPersona != other.idPersona) {
			return false;
		}
		if (!Objects.equals(this.nombre, other.nombre)) {
			return false;
		}
		if (this.altura != other.altura) {
			return false;
		}
		return true;
	}
}
