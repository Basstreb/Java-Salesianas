package ejercicio_09;

public class Test {

	public static void main(String[] args) {

		//Creamos 3 direcciones
		Direccion dir1 = new Direccion("Calle Falsa", 123, 6, "Sevilla");
		Direccion dir2 = new Direccion("Calle Esposible", 234, 1, "Cordoba");
		Direccion dir3 = new Direccion("Calle Porqueno", 345, 3, "Almeria");
		
		//Creamos 3 empleados a los cuales asignamos las direcciones anteriores
		Empleado em1 = new Empleado("Lucas", 1000, dir1);
		Empleado em2 = new Empleado("Paco", 1500, dir2);
		Empleado em3 = new Empleado("Jorge", 1350, dir3);
		
		//Mostramos los datos de los 3 empleados
		em1.muestraEmpleado();
		em2.muestraEmpleado();
		em3.muestraEmpleado();

	}

}
