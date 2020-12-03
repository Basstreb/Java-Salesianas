package ejercicio_05;

public class Empleado_Test {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("77847769Z", 1600, 15, 15, true, 2);
		Empleado emp2 = emp1.copia();
		Empleado emp3 = emp2.copia();
		
		emp2.setCasado(false);
		emp2.setnHijos(0);
		
		System.out.println(emp1.printIn());
		System.out.println(emp2.printIn());
		System.out.println(emp3.printIn());
		
		System.out.println("");
		
		emp1.calculoHorasExtra(50);
		emp2.calculoHorasExtra(50);
		emp3.calculoHorasExtra(100);
		
		System.out.println("");
		
		emp1.calculoSueldoBruto();
		emp2.calculoSueldoBruto();
		emp3.calculoSueldoBruto();
		
		System.out.println("");
		
		emp1.calculoIrpf();
		emp2.calculoIrpf();
		emp3.calculoIrpf();
		
		System.out.println("");
		
		System.out.println(emp1.printAll());
		System.out.println(emp2.printAll());
		System.out.println(emp3.printAll());

	}

}
