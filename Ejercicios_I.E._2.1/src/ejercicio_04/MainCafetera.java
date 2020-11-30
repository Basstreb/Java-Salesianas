package ejercicio_04;

public class MainCafetera {

	public static void main(String[] args) {
		
		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(2000);
		Cafetera cafetera3 = new Cafetera(3000, 1500);
		Cafetera cafetera4 = new Cafetera(3000, 4000);
		
		System.out.println(cafetera1.get_cantidadActual() + "\n" + cafetera1.get_capacidadMaxima());
		System.out.println("\n" + cafetera2.get_cantidadActual() + "\n" + cafetera2.get_capacidadMaxima());
		System.out.println("\n" + cafetera3.get_cantidadActual() + "\n" + cafetera3.get_capacidadMaxima());
		System.out.println("\n" + cafetera4.get_cantidadActual() + "\n" + cafetera4.get_capacidadMaxima());
		
		cafetera1.llenarCafetera();
		System.out.println("\n" + cafetera1.get_cantidadActual());
		
		System.out.println(" ");
		cafetera1.servirTaza(400);
		
		System.out.println(" ");
		cafetera1.servirTaza(700);
		
		System.out.println("\n" + cafetera1.get_cantidadActual());
		
		System.out.println(" ");
		cafetera1.agregarCafe(500);
		
		System.out.println(" ");
		cafetera1.agregarCafe(700);
		
		System.out.println("\n" + cafetera1.get_cantidadActual());
		
		cafetera1.vaciarCafetera();
		
		System.out.println("\n" + cafetera1.get_cantidadActual());
	}

}
