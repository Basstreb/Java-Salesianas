package recursividad;

public class Recursividad {

	public static int potencia(int x, int y) {
		if (y == 1) {
			return x;
		} else if (y == 0) {
			return 1;
		} else {
			return x * potencia(x, y - 1);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(potencia(7, 3));

	}

}
