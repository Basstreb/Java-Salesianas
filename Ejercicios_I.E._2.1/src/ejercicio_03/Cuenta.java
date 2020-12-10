package ejercicio_03;

/**
 * Clase cuenta que recoge los atritos y uno de ellos es un static
 * 
 * @author Dani
 *
 */
public class Cuenta {

	// Attributes
	private long cuenta;
	private long dni;
	private double saldo;
	private double interes;

	private static long numeroCuenta = 100000L;

	public static long getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * Constructor que solo actualiza el numero de la cuenta
	 */
	Cuenta() {
		cuenta = ++numeroCuenta;
	}

	/**
	 * Constructor de cuenta que introduce dni, saldo e interes de esta
	 * 
	 * @param dni
	 * @param saldo
	 * @param interes
	 */
	Cuenta(long dni, int saldo, int interes) {
		this.dni = dni;
		this.saldo = saldo;
		this.interes = interes;
		this.cuenta = ++numeroCuenta;
	}

	public void setCuenta(long cuenta) {
		this.cuenta = cuenta;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	/**
	 * Metodo que actualiza el saldo de la cuenta segun el interes diario
	 */
	public void actualizarSaldo() {
		this.saldo = this.saldo + (interes / 365);
	}

	/**
	 * Metodo que ingresa dinero en la cuenta segun un double que introduzcamos
	 * 
	 * @param ingresar
	 */
	public void ingresar(double ingresar) {
		this.saldo = this.saldo + ingresar;
	}

	/**
	 * Metodo que retira dinero de la cuenta si la cantidad a retirar es menor que
	 * la cantidad de saldo
	 * 
	 * @param retirar
	 */
	public void retirar(double retirar) {
		if (this.saldo > retirar) {
			this.saldo = this.saldo - retirar;
		} else {
			System.out.println("No hay dinero suficiente para retirar.");
		}
	}

	/**
	 * Metodo que retorna todos los datos de la cuenta
	 * 
	 * @return
	 */
	public String datos() {
		return "El numero de cuenta es: " + this.cuenta + "\nEl DNI del cliente es: " + this.dni
				+ "\nEl saldo actual es: " + this.saldo + "\nEl interes anual sera de: " + this.interes + "\n";
	}
}
