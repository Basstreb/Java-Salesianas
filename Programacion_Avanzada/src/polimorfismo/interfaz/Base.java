/**
 *  Interfaz Base (para la herencia)
 */
package polimorfismo.interfaz;

/**
 * @author DAM
 *
 */
public interface Base {
	
	default public void saludar(String mensaje) {
		System.out.println(mensaje + " desde Base");
	}

}
