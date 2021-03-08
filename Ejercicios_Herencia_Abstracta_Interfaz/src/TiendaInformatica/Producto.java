package TiendaInformatica;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;
	private int cantidad;
	private static int contador=0;
	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.codigo = Integer.toString(getContador());
	}
	public static int getContador() {
		return contador++;
	}
	public static void setContador(int contador) {
		Producto.contador = contador;
	}
	public String getCodigo() {
		return this.codigo;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	public void sumaCantidad(int cantidad) {
		this.cantidad += cantidad;
	}
	public boolean restaCantidad(int cantidad) {
		if (this.cantidad<=cantidad) {
			System.out.println("No hay suficiente cantidad...");
			return false;
		} else {
			this.cantidad -= cantidad;
			return true;
		}
	}
	public String toString() {
		return "- Codigo: "+ codigo + " - Nombre: " + nombre
				+ "\n- Precio: " + precio + " - Cantidad: " + cantidad;
	}
}