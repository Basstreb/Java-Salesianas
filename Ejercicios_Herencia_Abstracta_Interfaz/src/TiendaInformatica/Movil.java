package TiendaInformatica;

public class Movil extends Producto {
	private String operador;
	public Movil(String nombre, double precio, int cantidad, String operador) {
		super(nombre, precio, cantidad);
		this.operador = operador;
	}
	public String getOperador() {
		return this.operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public String toString() {
		return super.toString()+"\n # Movil # - Operador: "+ operador;
	}
}