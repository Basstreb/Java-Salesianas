package dam.modelos;

public class Discografia implements Comparable<Discografia>{

	public String nombreDisco;
	private int anio;

	public Discografia(String nD, int a) {
		nombreDisco = nD;
		anio = a;
	}

	public String getNombreDisco() {
		return nombreDisco;
	}

	public void setNombreDisco(String nombreDisco) {
		this.nombreDisco = nombreDisco;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public String toString() {
		return nombreDisco + " en el " + anio;
	}

	@Override
	public int compareTo(Discografia o) {
		return this.anio - o.anio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + ((nombreDisco == null) ? 0 : nombreDisco.hashCode());
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
		Discografia other = (Discografia) obj;
		if (anio != other.anio)
			return false;
		if (nombreDisco == null) {
			if (other.nombreDisco != null)
				return false;
		} else if (!nombreDisco.equals(other.nombreDisco))
			return false;
		return true;
	}

}
