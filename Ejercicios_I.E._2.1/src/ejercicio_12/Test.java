package ejercicio_12;

public class Test {

	private Empleado empleado;

	public Test(String n, int ht, int th) {
		empleado = new Empleado(n, ht, th);
	}

	public void sueldoBruto() {

		int sueldoBruto = 0;

		if (empleado.getHorasTrabajo() > 40) {
			sueldoBruto = (int) ((empleado.getTarifaHora() * 40)
					+ ((empleado.getHorasTrabajo() - 40) * empleado.getTarifaHora() * 1.5));
		} else {
			sueldoBruto = empleado.getHorasTrabajo() * empleado.getTarifaHora();
		}

		System.out.println(
				empleado.getNombre() + " trabajó " + empleado.getHorasTrabajo() + " horas, cobra " + empleado.getTarifaHora()
						+ " euros la hora por lo que le corresponde un sueldo de " + sueldoBruto + " euros.");

	}

	public static void main(String[] args) {

		Test empleado1 = new Test("Paco", 38, 10);
		Test empleado2 = new Test("Olga", 60, 20);
		Test empleado3 = new Test("Elena", 49, 18);
		
		empleado1.sueldoBruto();
		empleado2.sueldoBruto();
		empleado3.sueldoBruto();
		
	}

}
