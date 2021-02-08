package Videoclub;

public class Pelicula extends Producto{

	private Genero gen;
	private String anio;
	private String director;
	private String interpretes;
	
	//Constructor vacio para objetos Producto. No recibe parametros
	Pelicula(){
		
	}
	

	//Constructor sobrecargado completo para objetos Pelicula
	Pelicula(String titulo, double precioAlquiler, int plazoAlquiler, boolean alquilado, Genero gen, String anio, String director, String interpretes){
		super(titulo, precioAlquiler, plazoAlquiler, alquilado);
		this.gen=gen;
		this.anio=anio;
		this.director=director;
		this.interpretes=interpretes;
	}

	
	
	public Genero getGen() {
		return gen;
	}

	public void setGen(Genero gen) {
		this.gen = gen;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getInterpretes() {
		return interpretes;
	}

	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
	}
	
	/**
	 * Sobreescribe el metodo "toString" de la clase Videojuego para poder usarlo de forma que nos muestre la informacion del objeto videojuego como deseemos
	 */
	@Override
	public String toString() {
		return "[Titulo: "+titulo+", alquilado=" + alquilado + ", precioAlquiler=" + precioAlquiler + ", plazoAlquiler=" + plazoAlquiler + ", genero: "+gen+", anio: "+anio+", director: "+director+", interpretes: "+interpretes+", precio: "+precioAlquiler+"]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (anio == null) {
			if (other.anio != null)
				return false;
		} else if (!anio.equals(other.anio))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (gen != other.gen)
			return false;
		if (interpretes == null) {
			if (other.interpretes != null)
				return false;
		} else if (!interpretes.equals(other.interpretes))
			return false;
		return true;
	}
	
	
	
}
