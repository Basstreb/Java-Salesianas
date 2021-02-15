package ejercicio_02;

public class Cuenta {

	private static long numCuentaSt = 1000000;
	private long numCuenta;
	private double saldo;
	private double interes_cuenta;
	private double comision = 0.6;
	private Cliente cliente;
	
	public Cuenta(double s) {
		numCuenta = numCuentaSt;
		numCuentaSt++;
		saldo = s;
	}

	public long getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public void ingresarDinero(long dinero) {
		saldo += dinero;
	}
	
	public void sacarDinero (long dinero) {
		if (dinero > saldo) {
			System.out.println("No puede sacar la cantidad especificada, su saldo es de " + saldo);
		}else {
			saldo -= dinero;
		}
	}
	
	public String verSaldo() {
		return "Su saldo es de " + saldo;
	}
	
	public void revisionMensual() {
		interes_cuenta = 0.001 * saldo;
		saldo += interes_cuenta - comision;
	}
}
