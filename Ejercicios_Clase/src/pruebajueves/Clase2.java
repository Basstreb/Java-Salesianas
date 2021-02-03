package pruebajueves;

public class Clase2  extends Clase1{
	boolean atr3;
	 
	public Clase2 (int a, String b, boolean c){
		super(a,b);
		atr3 = c;
	}
 
	//Método que retorna el valor de los atributos a, b y c.
	public String toString(){
		return "Atributo 1 = " + getAtr1() + "\nAtributo 2 = " + getAtr2() + "\nAtributo 3 = " + atr3;
	}
	
	//Otra opcion es
	public String toString2() {
		return super.toString() +  "\nAtributo 3 = " + atr3;
	}

}
