package ejercicio_03;

public class Cliente {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta(12345678, 50000, 7000);
		
		Cuenta cuenta2 = new Cuenta(23456789, 35000, 8000);
		
		System.out.println(cuenta1.datos());
		System.out.println(cuenta2.datos());
		
		cuenta1.actualizarSaldo();
		cuenta1.ingresar(2000);
		cuenta1.retirar(500);
		
		System.out.println(cuenta1.datos());
	}

}
