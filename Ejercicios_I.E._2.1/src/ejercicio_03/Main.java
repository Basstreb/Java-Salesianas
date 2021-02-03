package ejercicio_03;

/**
 * Clase Main que testea los contructores y metodos de la clase Cuenta
 * 
 * @author Dani
 *
 */
public class Main {

	public static void main(String[] args) {

		//Creamos la primera cuenta con los datos necesarios del constructor
		Cuenta cuenta1 = new Cuenta(12345678, 50000, 7000);

		//Creamos la segunda cuenta con los datos necesarios del constructor
		Cuenta cuenta2 = new Cuenta(23456789, 35000, 8000);

		//Imprimimos los datos con el metodo datos();
		System.out.println(cuenta1.datos());
		System.out.println(cuenta2.datos());

		//Actualizamos valores de la cuenta
		cuenta1.actualizarSaldo();
		cuenta1.ingresar(2000);
		cuenta1.retirar(500);

		//Volemos a imprimir los datos tras los cambios realizados
		System.out.println(cuenta1.datos());
	}

}
