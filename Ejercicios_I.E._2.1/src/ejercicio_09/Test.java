package ejercicio_09;

public class Test {

	public static void main(String[] args) {
		
		Direccion dir1 = new Direccion("Calle Falsa", 123, 6, "Sevilla");
		Direccion dir2 = new Direccion("Calle Esposible", 234, 1, "Cordoba");
		Direccion dir3 = new Direccion("Calle Porqueno", 345, 3, "Almeria");
		
		Empleado em1 = new Empleado("Lucas", 1000, dir1);
		Empleado em2 = new Empleado("Paco", 1500, dir2);
		Empleado em3 = new Empleado("Jorge", 1350, dir3);
		
		
	}

}
