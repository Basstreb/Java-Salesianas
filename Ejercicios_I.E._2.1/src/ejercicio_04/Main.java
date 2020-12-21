package ejercicio_04;

/**
 * Clase main de Cafetera
 * @author Dani
 *
 */
public class Main {

	public static void main(String[] args) {
		
		//Creamos cuatro cafeteras, cada una con un constructor diferente
		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(2000);
		Cafetera cafetera3 = new Cafetera(3000, 1500);
		Cafetera cafetera4 = new Cafetera(3000, 4000);
		
		//Probamos los diferentes metodos con las cafeteras creadas
		System.out.println(cafetera1.get_cantidadActual() + "\n" + cafetera1.get_capacidadMaxima());
		System.out.println("\n" + cafetera2.get_cantidadActual() + "\n" + cafetera2.get_capacidadMaxima());
		System.out.println("\n" + cafetera3.get_cantidadActual() + "\n" + cafetera3.get_capacidadMaxima());
		System.out.println("\n" + cafetera4.get_cantidadActual() + "\n" + cafetera4.get_capacidadMaxima());
		
		//Empleamos el metodo para llenar la cafetera entera
		cafetera1.llenarCafetera();
		System.out.println("\n" + cafetera1.get_cantidadActual());
		
		//Metodo que resta cantidad de liquido de la cafetera
		System.out.println(" ");
		cafetera1.servirTaza(400);
		
		//Metodo que vuelve a restar cantidad de liquido de la cafetera
		System.out.println(" ");
		cafetera1.servirTaza(700);
		
		//Nos muestra la cantidad actual en la cafetera
		System.out.println("\n" + cafetera1.get_cantidadActual());
		
		//Agrega cafe a la cafetera
		System.out.println(" ");
		cafetera1.agregarCafe(500);
		
		//Vuelve a agregar cafe teniendo en cuenta el limite de la cafetera
		System.out.println(" ");
		cafetera1.agregarCafe(700);
		
		//Muestra la cantidad que hay en la cafetera
		System.out.println("\n" + cafetera1.get_cantidadActual());
		
		//Vacia en su totalidad la cafetera
		cafetera1.vaciarCafetera();
		
		//Muestra la cantidad que hay en la cafetera
		System.out.println("\n" + cafetera1.get_cantidadActual());
	}

}
