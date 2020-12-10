package ejercicio_02;

public class Vehiculo {

	// Attributes
	private String modelo;
	private double potencia;
	private boolean cRueda;

	/**
	 * Constructor de la clase Vehiculo segun el modelo de este
	 * 
	 * @param modelo
	 */
	Vehiculo(String modelo) {
		this.modelo = modelo;
	}

	// Methods
	public String getModelo() {
		return modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public boolean isCRueda() {
		return cRueda;
	}

	public void setTraccion(boolean traccion) {
		this.cRueda = traccion;
	}

	/**
	 * Metodo que retorna si el vehiculo creado tiene traccion a las 4 ruedas o no
	 * 
	 * @return
	 */
	public String imprimir() {
		if (cRueda) {
			return "El modelo es " + modelo + " la potencia es de " + potencia
					+ "CV y tiene traccion a las cuatro ruedas";
		} else {
			return "El modelo es " + modelo + " la potencia es de " + potencia
					+ "CV y no tiene traccion a las cuatro ruedas";
		}
	}
}
