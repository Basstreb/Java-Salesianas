package ejercicio_11;

public class Triangulo {

	private double long_lado1;
	private double long_lado2;
	private double long_lado3;

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

	public static boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		if (a.long_lado1 == b.long_lado1 && a.long_lado2 == b.long_lado2 && a.long_lado3 == b.long_lado3) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean compareTo_VTriangulos(Triangulo v[]) {
		int cont = 1;
		Triangulo comp1 = null;
		Triangulo comp2 = null;

		for (int i = 0; i < v.length; i++) {
			comp1 = v[i];

			try {
				if (comp1.long_lado1 == comp2.long_lado1 && comp1.long_lado1 == comp2.long_lado1
						&& comp1.long_lado1 == comp2.long_lado1) {
					cont++;
					comp2 = comp1;
				} else {
					comp2 = comp1;
				}
			} catch (Exception e) {

			} finally {
				comp2 = comp1;
			}
		}

		if (cont == v.length) {
			return true;
		} else {
			return false;
		}
	}

	public int tipo_Triangulo() {
		int triangulo = 0;

		if (long_lado1 == long_lado2 && long_lado1 == long_lado3) {
			triangulo = 1;
		} else if (long_lado1 == long_lado2 && long_lado1 != long_lado3
				|| long_lado1 == long_lado3 && long_lado1 != long_lado2
				|| long_lado2 == long_lado3 && long_lado2 != long_lado1) {
			triangulo = 2;
		}else {
			triangulo = 3;
		}

		return triangulo;
	}
}
