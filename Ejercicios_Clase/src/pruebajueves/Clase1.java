package pruebajueves;

public class Clase1 {
	
	private int atr1;
	private String atr2;
 
	public Clase1 (int a, String b){
		atr1=a;
		atr2=b;
	}
 
	public Clase1(){
		this(-1,"vacío");
	}
	
	//Tenemos dos opciones
	public int getAtr1() {
		return atr1;
	}
	
	public String getAtr2() {
		return atr2;
	}
	
	//Y esta otra
	
	public String toString() {
		return "Atributo 1 = " + atr1 + "\nAtributo 2 = " + atr2;
	}
}
