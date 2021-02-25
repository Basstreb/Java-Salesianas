package ejercicio_abstracta;

public abstract class Cuenta {

	protected static long numCuen = 1000000L;
	protected long numeroCuenta;
	protected double saldo;
	protected Persona cliente;

	public Cuenta(Persona cli) {
		cliente = cli;
		numeroCuenta = numCuen;
		numCuen++;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void ingresar(double ingreso) {
		saldo += ingreso;
	}

	abstract public void retirar(double retiro);

	abstract public void actualizarSaldo();
}
