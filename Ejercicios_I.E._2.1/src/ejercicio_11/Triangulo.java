package ejercicio_11;

/**
 * Clase Triangulo la cual nos sirve para crear objetos triangulos y los metodos
 * para compararlos entre ellos y averiguar el tipo de triangulo que es
 * 
 * @author Dani
 *
 */
public class Triangulo {

	private double long_lado1;
	private double long_lado2;
	private double long_lado3;

	/**
	 * Constructor de triangulos segun sus lados
	 * 
	 * @param l1
	 * @param l2
	 * @param l3
	 */
	public Triangulo(double l1, double l2, double l3) {
		long_lado1 = l1;
		long_lado2 = l2;
		long_lado3 = l3;
	}

	public double getLong_lado1() {
		return long_lado1;
	}

	public void setLong_lado1(double long_lado1) {
		this.long_lado1 = long_lado1;
	}

	public double getLong_lado2() {
		return long_lado2;
	}

	public void setLong_lado2(double long_lado2) {
		this.long_lado2 = long_lado2;
	}

	public double getLong_lado3() {
		return long_lado3;
	}

	public void setLong_lado3(double long_lado3) {
		this.long_lado3 = long_lado3;
	}

	/**
	 * Metodo que sirve para comparar dos triangulos segun sus lados.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		if (a.long_lado1 == b.long_lado1 && a.long_lado2 == b.long_lado2 && a.long_lado3 == b.long_lado3) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que sirve para comparar un array de triangulos con otro usando el
	 * metodo anterior para comparar triangulos
	 * 
	 * @param v
	 * @return
	 */
	public static boolean compareTo_VTriangulos(Triangulo v[]) {
		for (int i = 0; i < (v.length - 1); i++) {
			if (!compareTo_Triangulos(v[i], v[i + 1])) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Metodo para averiguar el tipo de triangulo que hemos creado segun la longitud
	 * de sus lados.
	 * 
	 * @return
	 */
	public int tipo_Triangulo() {
		int triangulo = 0;

		if (long_lado1 == long_lado2 && long_lado1 == long_lado3) {
			triangulo = 1;
		} else if (long_lado1 == long_lado2 && long_lado1 != long_lado3
				|| long_lado1 == long_lado3 && long_lado1 != long_lado2
				|| long_lado2 == long_lado3 && long_lado2 != long_lado1) {
			triangulo = 2;
		} else {
			triangulo = 3;
		}

		return triangulo;
	}
}
