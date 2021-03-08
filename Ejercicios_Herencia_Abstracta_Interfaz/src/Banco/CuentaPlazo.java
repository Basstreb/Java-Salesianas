package Banco;

public class CuentaPlazo extends CuentaAbs {

	public CuentaPlazo(String numero, String titular, double saldo, int numAños) {
		super(numero, titular, saldo);
		this.numAños = numAños;
	}
	
	private int numAños;
	
	public double calculaInteres(double cantidad){
		return cantidad*0.05;
	}
	
	public String toString() {
		return super.toString() + " - " + this.numAños;
	}
	
}