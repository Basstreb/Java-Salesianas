package Videoclub;

public class Producto {

	String titulo;
	double precioAlquiler;
	int plazoAlquiler;
	boolean alquilado=false;
	

	//Constructor vacio para objetos Producto. No recibe parametros
	Producto(){
		
	}
	
	//Constructor sobrecargado completo para objetos Producto.
	Producto(String titulo, double precioAlquiler, int plazoAlquiler, boolean alquilado){
		this.titulo=titulo;
		this.precioAlquiler=precioAlquiler;
		this.plazoAlquiler=plazoAlquiler;
		this.alquilado=alquilado;
	}
	

	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public int getPlazoAlquiler() {
		return plazoAlquiler;
	}

	public void setPlazoAlquiler(int plazoAlquiler) {
		this.plazoAlquiler = plazoAlquiler;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	@Override
	public String toString() {
		return "titulo=" + titulo + ", precioAlquiler=" + precioAlquiler + ", plazoAlquiler=" + plazoAlquiler + ", alquilado=" + alquilado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	
	
}
