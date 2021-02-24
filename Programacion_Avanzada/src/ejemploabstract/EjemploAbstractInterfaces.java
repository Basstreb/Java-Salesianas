/**
 * EJEMPLO DE USO DE CLASES Y METODOS ABSTRACTOS
 */
package ejemploabstract;

/**
 * @author DAM
 *
 */
public class EjemploAbstractInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Imposible instanciar la clase abstracta
		// ObjectoGrafico o = new ObjetoGrafico();

		Circulo c = new Circulo(1, 1, 7);
		c.dibujar();
		c.cambiarTamanio(2);
		c.moverA(3, 3);
		c.dibujar();

		// Podemos usar el Circulo con una referencia
		// de tipo ObjetoGrafico
		ObjectoGrafico o = c;
		System.out.println("Dibujando un circulo desde un objeto grafico");
		o.dibujar();
	}

}
