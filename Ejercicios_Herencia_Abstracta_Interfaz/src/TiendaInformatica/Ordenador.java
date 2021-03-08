package TiendaInformatica;

public class Ordenador extends Producto {
	private String caracteristicas;
	public Ordenador(String nombre, double precio, int cantidad, String caracteristicas) {
		super(nombre, precio, cantidad);
		this.caracteristicas = caracteristicas;
	}
	public String getCaracteristicas() {
		return this.caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public String toString() {
		return super.toString()+"\n # Ordenador # - Características: "+ caracteristicas;
	}
}