package ejercicio_class;

public class Cuenta {
	
	//Attributes
	private long cuenta;
	private long dni;
	private int saldo;
	private int interes;
	
	Cuenta(){
		this.cuenta = 35844684864968L;
		this.dni = 0;
		this.saldo = 0;
		this.interes = 0;
	}
	
	Cuenta(long dni, int saldo, int interes){
		this.cuenta = 35844684864968L;
		this.dni = dni;
		this.saldo = saldo;
		this.interes = interes;
	}

	public long getCuenta() {
		return cuenta;
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
		this.saldo = this.saldo + (interes/365);
	}
	
	public void ingresar(double ingresar) {
		this.saldo = (int)(this.saldo + ingresar);
	}
	
	public void retirar(double retirar) {
		if(this.saldo>retirar) {
			this.saldo = (int)(this.saldo - retirar);
		}
		else {
			System.out.println("No hay dinero suficiente para retirar.");
		}
		
	}
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(77847769L, 50000, 7300);
		
		System.out.println("La cuenta es " + cuenta.getCuenta() + "\nEl dni es " + cuenta.getDni());
		System.out.println("El saldo previo a calcular intereses es " + cuenta.getSaldo());
		
		cuenta.actualizarSaldo();
		System.out.println("Y tas calcular el interes es de " + cuenta.getSaldo());
		
	}
}
