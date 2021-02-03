package ejercicio_09;

/**
 * Clase Direccion que nos sirve para definir la direccion de un empleado
 * 
 * @author Dani
 *
 */
public class Direccion {

	private String calle;
	private int numero;
	private int piso;
	private String ciudad;

	/**
	 * Constructor de la clase Direccion que incluye a todos los atributos
	 * 
	 * @param ca
	 * @param nu
	 * @param pi
	 * @param ci
	 */
	public Direccion(String ca, int nu, int pi, String ci) {
		calle = ca;
		numero = nu;
		piso = pi;
		ciudad = ci;
	}

	// Metodos Getters y Setters
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
