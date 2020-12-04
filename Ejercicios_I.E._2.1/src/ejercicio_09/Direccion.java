package ejercicio_09;

public class Direccion {

	private String calle;
	private int numero;
	private int piso;
	private String ciudad;

	public Direccion(String ca, int nu, int pi, String ci) {
		calle = ca;
		numero = nu;
		piso = pi;
		ciudad = ci;
	}

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
