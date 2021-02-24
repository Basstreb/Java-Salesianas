package herencia.interfaces;

/**
 * 
 * @author DAM
 *
 */
public class ClaseImprimible implements /*Imprimible,*/ ImprimiblePorConsola {

	@Override
	public void print(String s) {
		System.out.println(s);
	}
	

}
