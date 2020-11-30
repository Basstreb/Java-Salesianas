package ejercicio_03;

public class Cuenta {

	// Attributes
	private long cuenta ;
	private long dni;
	private int saldo;
	private int interes;
	
	private static long numeroCuenta = 100001L;
	
	public static long getNumeroCuenta() {
		return numeroCuenta;
	}

	Cuenta() {
		cuenta = ++numeroCuenta;
	}
	
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

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getInteres() {
		return interes;
	}

	public void setInteres(int interes) {
		this.interes = interes;
	}

	public void actualizarSaldo() {
		this.saldo = this.saldo + (interes / 365);
	}

	public void ingresar(double ingresar) {
		this.saldo = (int) (this.saldo + ingresar);
	}

	public void retirar(double retirar) {
		if (this.saldo > retirar) {
			this.saldo = (int) (this.saldo - retirar);
		} else {
			System.out.println("No hay dinero suficiente para retirar.");
		}
	}

	public String datos() {
		return "El numero de cuenta es: " + this.cuenta + "\nEl DNI del cliente es: " + this.dni
				+ "\nEl saldo actual es: " + this.saldo + "€\nEl interes anual sera de: " + this.interes + "€";
	}
}
