package ejercicio_02;

public class Cuenta {

	private int numCuenta;
	private float saldo;
	
	public Cuenta(int nC, float s) {
		numCuenta = nC;
		saldo = s;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
