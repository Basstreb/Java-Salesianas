package ejercicio_02;

public class Coche {

	public static void main(String[] args) {


		Vehiculo coche1 = new Vehiculo("Mustang");
		coche1.setPotencia(550);
		coche1.setTraccion(false);
		
		Vehiculo coche2 = new Vehiculo("Ibiza");
		coche2.setPotencia(80);
		coche2.setTraccion(true);

		System.out.println(coche1.imprimir());
		System.out.println(coche2.imprimir());

	}

}
