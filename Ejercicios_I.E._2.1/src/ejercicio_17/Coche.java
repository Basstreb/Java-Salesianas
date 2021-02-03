package ejercicio_17;

/**
 * Clase coche que recoje los atributos de matricula, marca y modelo y un metodo
 * para mostrar los datos.
 * 
 * @author Dani
 *
 */
public class Coche {

	private int matricula;
	private String marca;
	private String modelo;

	/**
	 * Constructor de coche que recibe el numero de matricula, y los string de marca
	 * y modelo
	 * 
	 * @param m
	 * @param ma
	 * @param mo
	 */
	public Coche(int m, String ma, String mo) {
		matricula = m;
		marca = ma;
		modelo = mo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Metodo que muestra los datos del coche.
	 */
	public void muestraCoche() {
		System.out.println("El coche tiene:\nMatricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo);
	}

}
