package ejercicio_abstracta;

public class CuentaAhorro extends Cuenta {

	private float interesVariable;
	private double saldoMinimo;

	public CuentaAhorro(Persona cli, float iV, double sM) {
		super(cli);
		interesVariable = iV;
		saldoMinimo = sM;
		saldo = saldoMinimo;
	}

	public float getInteresVariable() {
		return interesVariable;
	}

	public void setInteresVariable(float interesVariable) {
		this.interesVariable = interesVariable;
	}

	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	@Override
	public void retirar(double retiro) {
		if ((saldo - retiro) < saldoMinimo) {
			System.out.println("No puede extraer tal cantidad debido a que excede el saldo m�nimo.");
		} else {
			saldo -= retiro;
		}
	}

	@Override
	public void actualizarSaldo() {
		saldo += saldo * (interesVariable / 100);
		System.out.println("Saldo actualizado correctamente, su saldo actual es de: " + saldo);
	}
	
	@Override
	public String toString() {
		return "El cliente " + cliente + " \nCon numero de Cuenta: " + numeroCuenta + " posee un saldo de: " + saldo
				+ " y un interes de: " + interesVariable + "\n-------------------";
	}

}
