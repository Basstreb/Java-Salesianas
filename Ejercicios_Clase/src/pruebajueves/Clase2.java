package pruebajueves;

public class Clase2  extends Clase1{
	boolean atr3;
	 
	public Clase2 (int a, String b, boolean c){
		super(a,b);
		atr3 = c;
	}
 
	//Método que retorna el valor de los atributos a, b y c.
	public String toString(){
		return "Atributo 1 = " + atr1 + "\nAtributo 2 = " + atr2 + "\nAtributo 3 = " + atr3;
	}

}
