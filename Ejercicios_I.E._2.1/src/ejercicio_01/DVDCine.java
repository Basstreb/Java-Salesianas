package ejercicio_01;

/**
 * 
 * Creamos una clase que recoja todos los datos necesarios de nuestro DVD.
 * 
 * @author Dani
 *
 */

public class DVDCine {

	//Atributos
	private String titulo;
	private String director;
	private String actores;
	private String genero;
	private int duracion;
	private String resumen;

	/**
	 * Constructor que no tiene en cuenta la creación de un resumen
	 * 
	 * @param titulo
	 * @param director
	 * @param actores
	 * @param genero
	 * @param duracion
	 */
	DVDCine(String titulo, String director, String actores, String genero, int duracion) {
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.genero = genero;
		this.duracion = duracion;
	}

	/**
	 * 
	 * Constructor que añade ademas la posibilidad de escribir un resumen
	 * 
	 * @param titulo
	 * @param director
	 * @param actores
	 * @param genero
	 * @param duracion
	 * @param resumen
	 */
	DVDCine(String titulo, String director, String actores, String genero, int duracion, String resumen) {
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.genero = genero;
		this.duracion = duracion;
		this.resumen = resumen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActores() {
		return actores;
	}

	public void setActores(String actores) {
		this.actores = actores;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/**
	 * 
	 * @return Devuelve información sobre la pelicula teniendo en cuenta si tiene o no resumen.
	 */
	public String muestraDVDCine() {
		if (resumen == null) {
			return this.titulo + " De: " + this.director + "\nCon: " + this.actores + "\n\n" + this.genero + " - "
					+ this.duracion + " min";
		}else {
			return this.titulo + " De: " + this.director + "\nCon: " + this.actores + "\n\n" + this.genero + " - "
					+ this.duracion + " min" + "\n\nResumen: " + this.resumen;
		}
	}

	/**
	 * 
	 * @return Comprueba si la pelicula pertenece a un genero y si no es asi nos
	 *         retorna false.
	 */
	public Boolean esThriller() {
		if (this.genero.equals("Thriller")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @return Comprueba si la pelicula tiene resumen y si no es asi nos dice que es
	 *         false.
	 */
	public Boolean tieneResumen() {
		if (this.resumen == null) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 
	 * @return Nos retorna la duracion en min de la pelicula.
	 */
	public String muestraDuracion() {
		return this.duracion + " min";
	}

}
