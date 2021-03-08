package Banco;

public class CuentaAhorro extends CuentaAbs {
	
	private String numTarjetaCredito;
	
	public CuentaAhorro(String numero, String titular, double saldo, String numTarjetaCredito) {
		super(numero, titular, saldo);
		this.numTarjetaCredito = numTarjetaCredito;
	}
	
	
	public double calculaInteres(double cantidad){
		return cantidad*0.02;
	}
	
	public String toString() {
		return super.toString() + " - " + this.numTarjetaCredito;
	}
	
}