package asociacion;

public class Coche {

	// Attributes
	private Motor motor = null;
	private String marca = null;
	private String modelo = null;
	private double importeAveria = 0;

	/**
	 * Constructor de un coche segun su marca y modelo, instanciamos un objeto Motor.
	 * @param ma
	 * @param mo
	 */
	Coche(String ma, String mo) {
		motor = new Motor(50);
		marca = ma;
		modelo = mo;
	}

	// Getters
	public Motor getMotor() {
		return motor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Double getPrecioaveria() {
		return importeAveria;
	}
	
	/**
	 * Es un metodo que nos permite acumlar los importes de las averias.
	 * @param d
	 */
	public void acumularAveria(double d) {
		importeAveria += d;
	}
}
