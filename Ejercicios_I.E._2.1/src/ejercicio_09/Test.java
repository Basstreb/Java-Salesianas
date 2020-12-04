package ejercicio_09;

public class Test {

	private Direccion direccion;
	private Empleado empleado;

	private Test(String ca, int nu, int pi, String ci, String n, int s) {
		direccion = new Direccion(ca, nu, pi, ci);
		empleado = new Empleado(n, s, direccion);
	}

	public void muestraEmpleado(int num) {
		System.out.println("EMPLEADO " + (num));
		System.out.println("Nombre: " + this.empleado.getNombre());
		System.out.println("Salario: " + this.empleado.getSalario());
		System.out.println("Dirección: \n" + "           Calle: " + this.direccion.getCalle() + "\n           Numero: "
				+ this.direccion.getNumero() + "\n           Piso: " + this.direccion.getPiso()
				+ "\n           Ciudad:  " + this.direccion.getCiudad());
	}

	public static void main(String[] args) {

//		Direccion dir1 = new Direccion("Calle Falsa", 123, 6, "Sevilla");
//		Direccion dir2 = new Direccion("Calle Esposible", 234, 1, "Cordoba");
//		Direccion dir3 = new Direccion("Calle Porqueno", 345, 3, "Almeria");
//		
//		Empleado em1 = new Empleado("Lucas", 1000, dir1);
//		Empleado em2 = new Empleado("Paco", 1500, dir2);
//		Empleado em3 = new Empleado("Jorge", 1350, dir3);
//		
//		em1.setDireccion(dir1);
//		em2.setDireccion(dir2);
//		em3.setDireccion(dir3);

		Test em1 = new Test("Calle Falsa", 123, 6, "Sevilla", "Lucas", 1000);
		Test em2 = new Test("Calle Esposible", 234, 6, "Cordoba", "Paco", 1500);
		Test em3 = new Test("Calle Porqueno", 345, 6, "Almeria", "Jorge", 1350);

		em1.muestraEmpleado(1);
		em2.muestraEmpleado(2);
		em3.muestraEmpleado(3);

	}

}
