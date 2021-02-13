package ejercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Socio {

	private String nombre;
	private static int numCarnetStatic = -1;
	private int numCarnet;
	private List<Libro> libros = new ArrayList<>();

	public Socio(String n) {
		nombre = n;
		numCarnetStatic++;
		numCarnet = numCarnetStatic;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumCarnet() {
		return this.numCarnet;
	}

	public void setLibro(Libro libro) {
		libros.add(libro);
	}

	public List<Libro> getLibros() {
		return libros;
	}
}
