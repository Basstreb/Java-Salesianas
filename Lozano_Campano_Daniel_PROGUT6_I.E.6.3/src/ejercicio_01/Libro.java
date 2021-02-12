package ejercicio_01;

public class Libro {

	private String titulo;
	private String autor;
	private Socio socio;

	public Libro(String t, String a) {
		titulo = t;
		autor = a;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}
}