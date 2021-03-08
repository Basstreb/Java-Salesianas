package ejercicio_03;

/**
 * 
 * @author Daniel Lozano Campano Clase Radio que simula una radio, contiene
 *         metodos para cambiar de frecuencia, volumen y la banda.
 */
public class Radio {

	private double frecuencia;
	private int volumen;
	private String canal;

	/**
	 * Metodo para subir la frecuencia
	 */
	public void up_hez() {

		if (canal.equals("FM")) {
			frecuencia += 5;
			if (frecuencia > 80) {
				System.out.println("Esta en la maxima frecuencia");
				frecuencia = 80;
			}
		} else if (canal.equals("AM")) {
			frecuencia += 3;
			if (frecuencia > 40) {
				System.out.println("Esta en la maxima frecuencia");
				frecuencia = 40;
			}
		}
	}

	/**
	 * Metodo para bajar la frecuencia
	 */
	public void down_hez() {

		if (canal.equals("FM")) {
			frecuencia -= 5;
			if (frecuencia < 30) {
				System.out.println("Esta en la minima frecuencia");
				frecuencia = 30;
			}
		} else if (canal.equals("AM")) {
			frecuencia -= 3;
			if (frecuencia < 10) {
				System.out.println("Esta en la minima frecuencia");
				frecuencia = 10;
			}
		}
	}

	/**
	 * Metodo para bajar el volumen
	 */
	public void down_vol() {

		if (canal.equals("FM")) {
			volumen -= 5;

			if (volumen < 0) {
				System.out.println("El volumen esta al minimo posible");
				volumen = 0;
			}
		} else if (canal.equals("AM")) {
			volumen -= 2;
			if (volumen < 3) {
				System.out.println("El volumen esta al minimo posible");
				volumen = 3;
			}
		}
	}

	/**
	 * Metodo para subir el volumen
	 */
	public void up_vol() {

		if (canal.equals("FM")) {
			volumen += 5;

			if (volumen > 20) {
				System.out.println("El volumen esta al maximo posible");
				volumen = 20;
			}
		} else if (canal.equals("AM")) {
			volumen += 2;
			if (volumen > 18) {
				System.out.println("El volumen esta al maximo posible");
				volumen = 18;
			}
		}
	}

	/**
	 * Metodo que muestra los valores de la clase
	 */
	public void displayRadio() {
		System.out.println("Frecuencia = " + frecuencia + "\nVolumen = " + volumen + "\nCanal = " + canal);
	}

	/**
	 * Metodo que cambia entre AM y FM poniendo los valores por defecto.
	 */
	public void changeCanal() {
		if (canal.equals("AM")) {
			canal = "FM";
			frecuencia = 30;
			volumen = 0;
			System.out.println("Ha cambiado al canal FM");
		} else if (canal.equals("FM")) {
			canal = "AM";
			frecuencia = 10;
			volumen = 3;
			System.out.println("Ha cambiado al canal AM");
		}
	}

	/**
	 * Método que pone los atributos a valores por defecto.
	 */
	public void reset() {

		if (canal.equals("FM")) {
			frecuencia = 30;
			volumen = 0;
		} else if (canal.equals("AM")) {
			frecuencia = 10;
			volumen = 3;
		}

	}

	public String menuRadio() {
		return "1.- Subir Frecuencia\n2.-Bajar Frecuencia\n3.-Subir Volumen\n4.-Bajar Volumen\n5.-Mostrar datos Radio\n6.-Cambiar de Banda\n7.-Reset de Banda\n8.-Salir";

	}

	/**
	 * Constructor por defecto que inicializa por defecto los atributos segun el
	 * canal FM.
	 */
	public Radio() {
		canal = "FM";
		frecuencia = 30;
		volumen = 0;
	}
}
