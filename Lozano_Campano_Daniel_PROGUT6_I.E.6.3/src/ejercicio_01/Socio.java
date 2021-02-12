package ejercicio_01;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Socio {

	private String nombre;
	private static int numCarnetStatic = 9;
	private int numCarnet;
	private Set<Libro> libros = new LinkedHashSet<>();
	
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
	
	public void aniadirLibro(Libro libro) {
		libros.add(libro);
	}
	
	public void devolverLibros() {
		for (Iterator<Libro> it = libros.iterator(); it.hasNext();) {
			Libro l = it.next();
			if (l.getAutor() != null) {
				l.setAutor(null);
			}
		}
	}
}
