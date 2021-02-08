package Videoclub;

public class Videojuego extends Producto {

	Enum estilo;
	Enum plataforma;
	

	//Constructor vacio para objetos Videojuego. No recibe parametros
	public Videojuego(){
		
	}

	//Constructor sobrecargado completo para objetos Videojuego
	public Videojuego(String titulo, double precioAlquiler, int plazoAlquiler, boolean alquilado, Enum estilo, Enum plataforma){
		super(titulo, precioAlquiler, plazoAlquiler, alquilado);
		this.estilo=estilo;
		this.plataforma=plataforma;
	}

	
	//Getters y Setters
	public Enum getEstilo() {
		return estilo;
	}

	public void setEst(Enum estilo) {
		this.estilo = estilo;
	}

	public Enum getPlataforma() {
		return plataforma;
	}

	public void setPlat(Enum plataforma) {
		this.plataforma = plataforma;
	}

	/**
	 * Sobreescribe el metodo "toString" de la clase Videojuego para poder usarlo de forma que nos muestre la informacion del objeto videojuego como deseemos
	 */
	@Override
	public String toString() {
		return "[titulo= " + titulo + ", alquilado=" + alquilado + ", precioAlquiler=" + precioAlquiler
				+ ", plazoAlquiler=" + plazoAlquiler + ", estilo=" + estilo + ", plataforma=" + plataforma + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estilo == null) ? 0 : estilo.hashCode());
		result = prime * result + ((plataforma == null) ? 0 : plataforma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Videojuego other = (Videojuego) obj;
		if (estilo == null) {
			if (other.estilo != null)
				return false;
		} else if (!estilo.equals(other.estilo))
			return false;
		if (plataforma == null) {
			if (other.plataforma != null)
				return false;
		} else if (!plataforma.equals(other.plataforma))
			return false;
		return true;
	}
	
	
	
}
