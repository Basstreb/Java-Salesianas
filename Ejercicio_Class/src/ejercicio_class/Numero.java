package ejercicio_class;

public class Numero {
	
	//Attributes
	private int numero;
	
	//Constructors
	Numero() {
		this.numero = 0;
	}
	
	Numero(int numero){
		this.numero = numero;
	}
	
	//Methods
	public void aniade(int numero) {
		this.numero += numero;
	}
	
	public void resta(int numero) {
		this.numero -= numero;
	}
	
	public int getValor() {
		return numero;
	}
	
	public int getDoble() {
		return numero *= 2;
	}
	
	public int getTriple() {
		return numero *= 3;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static void main(String[] args) {
		
		Numero number = new Numero(5);
		
		number.aniade(10);
		System.out.println(number.getValor());
		
		number.setNumero(5);
		number.resta(3);
		System.out.println(number.getValor());
		
		number.setNumero(20);
		System.out.println(number.getValor());
		System.out.println(number.getDoble());
		System.out.println(number.getTriple());
	}
}
