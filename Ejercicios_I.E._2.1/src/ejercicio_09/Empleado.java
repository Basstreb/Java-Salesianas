package ejercicio_09;

/**
 * Clase Empleado con atributo dirección y posee un metodo para mostrar al
 * empleado
 * 
 * @author Dani
 *
 */
public class Empleado {

	private String nombre;
	private int salario;
	private Direccion direccion;
	
	/**
	 * Dos atributos para contar el numero de empleados para el metodo mostrar.
	 */
	private static int contNumEmpleado;
	private int numEmpleado;
	

	/**
	 * Constructor de la clase empreado que incluye una direccion que añadiremos mas
	 * tarde.
	 * 
	 * @param n nombre
	 * @param s saldo
	 * @param dir direccion
	 */
	public Empleado(String n, int s, Direccion dir) {
		nombre = n;
		salario = s;
		direccion = dir;
		contNumEmpleado++;
		numEmpleado = contNumEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo que nos muestra la informacion completa del empleado
	 * 
	 */
	public void muestraEmpleado() {
		System.out.println("EMPLEADO " + numEmpleado);
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario: " + salario);
		System.out.println("Direccion: \n" + "           Calle: " + direccion.getCalle() + "\n           Numero: "
				+ direccion.getNumero() + "\n           Piso: " + direccion.getPiso() + "\n           Ciudad:  "
				+ direccion.getCiudad());
	}

}
