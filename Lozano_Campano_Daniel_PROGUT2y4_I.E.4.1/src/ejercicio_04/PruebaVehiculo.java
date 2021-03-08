package ejercicio_04;

public class PruebaVehiculo {

	public static void main(String[] args) {
		
		Coche coche = new Coche("0000BBB", "gris plata");
		coche.setNumPuertas(3);
		Moto moto = new Moto("2222BBB", "negro");
		moto.setNumPlazas(2);
		
		System.out.println(coche.muestraDatosCoche());
		System.out.println(moto.muestraDatosMoto());		
	
	}

}
