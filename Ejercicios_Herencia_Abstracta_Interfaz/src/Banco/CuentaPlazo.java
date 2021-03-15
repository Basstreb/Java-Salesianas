package Banco;

public class CuentaPlazo extends CuentaAbs {

	public CuentaPlazo(String numero, String titular, double saldo, int numA�os) {
		super(numero, titular, saldo);
		this.numA�os = numA�os;
	}
	
	private int numA�os;
	
	public double calculaInteres(double cantidad){
		return cantidad*0.05;
	}
	
	public String toString() {
		return super.toString() + " - " + this.numA�os;
	}
	
}