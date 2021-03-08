package actividad;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static List<Empleado> empleados = new ArrayList<>();
	
	public static void main(String[] args) {
		
		inicializar();
		
		empleados.stream().forEach(emp -> System.out.println(emp.retencion()));
		empleados.stream().forEach(emp -> System.out.println(emp.gratificacion(3)));
		empleados.stream().forEach(emp -> System.out.println(emp.calcular(3)));
	}

	public static void inicializar() {
		Empleado emp1 = new Comercial("Paco", "11223344A", 1000, 500);
		Empleado emp2 = new Directivo("Jorge", "11223344A", 1000, 500);
		empleados.add(emp1);
		empleados.add(emp2);
	}
}
