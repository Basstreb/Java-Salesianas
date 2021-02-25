package ejercicio_abstracta;

public class CuentaCorriente extends Cuenta {

	private float interes = 1.5f;

	public CuentaCorriente(Persona cli) {
		super(cli);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirar(double retiro) {
		if (retiro > saldo) {
			System.out.println("No se puede retira la cantidad, debido a que el saldo es menor.");
			System.out.println("Su saldo es de: " + saldo);
		} else {
			saldo -= retiro;
		}
	}

	@Override
	public void actualizarSaldo() {
		saldo += saldo * (interes / 100);
		System.out.println("Saldo actualizado correctamente, su saldo actual es de: " + saldo);
	}

	@Override
	public String toString() {
		return "El cliente " + cliente + " \nCon numero de Cuenta: " + numeroCuenta + " posee un saldo de: " + saldo
				+ " y un interes de: " + interes + "\n-------------------";
	}
}
