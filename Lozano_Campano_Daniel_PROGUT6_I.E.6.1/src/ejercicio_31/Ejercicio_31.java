package ejercicio_31;

public class Ejercicio_31 {

	static private String muestra(String alumno, double nota) {
		return "El alumno" + alumno + "ha sacado la nota " + nota;
	}

	public static void main(String[] args) {

		String notas = " Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";
		String[] array = notas.split("\n");
		double[] datos = new double[4];
		
		for (int i = 1; i < array.length; i+=2) {
			datos[i/2] = Double.parseDouble(array[i]);
		}

		for (int i = 0; i < array.length; i+=2) {
			System.out.println(muestra(array[i], datos[i/2]));
		}
		
	}

}
