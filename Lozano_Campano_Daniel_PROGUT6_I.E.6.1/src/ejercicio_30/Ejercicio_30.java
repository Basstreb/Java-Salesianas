package ejercicio_30;

import java.util.StringTokenizer;

public class Ejercicio_30 {

	static private String muestra(String alumno, String nota) {
		return "El alumno" + alumno + "ha sacado la nota" + nota;
	}

	public static void main(String[] args) {

		String notas = " Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";

		StringTokenizer st = new StringTokenizer(notas, "\n");

		while (st.hasMoreTokens()) {
			System.out.println(muestra(st.nextToken(), st.nextToken()));
		}
	}

}
