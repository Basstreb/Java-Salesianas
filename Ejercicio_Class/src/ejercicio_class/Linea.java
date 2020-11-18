package ejercicio_class;

public class Linea {
	
	//Attributes
	private Punto a;
	private Punto b;
	
	//Constructors
	Linea(){
		this.a = new Punto(0, 0);
		this.b = new Punto(0, 0);
	}

	Linea(Punto a, Punto b){
		this.a = a;
		this.b = b;
	}
	
	//Methods
	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}
	
	
	public void mueveDerecha(double derecha) {
		this.a.setX(this.a.getX() + (float)derecha);
		this.b.setX(this.b.getX() + (float)derecha);
	}
	
	public void mueveIzquierda(double izquierda) {
		this.a.setX(this.a.getX() - (float)izquierda);
		this.b.setX(this.b.getX() - (float)izquierda);
	}
	
	public void mueveArriba(double arriba) {
		this.a.setY(this.a.getY() + (float)arriba);
		this.b.setY(this.b.getY() + (float)arriba);
	}
	
	public void mueveAbajo(double abajo) {
		this.a.setY(this.a.getY() - (float)abajo);
		this.a.setY(this.b.getY() - (float)abajo);
	}
	
	public void presentacion() {
		System.out.println("[("+ this.a.getX()+ "," + this.a.getY() + "),(" + this.b.getX() + "," + this.b.getY() + ")]");
	}
	
	public static void main(String[] args) {
		Punto coord1 = new Punto(0, 2);
		Punto coord2 = new Punto(1, 2);
		
		Linea linea = new Linea(coord1, coord2);
		
		linea.presentacion();
	}
	
}
