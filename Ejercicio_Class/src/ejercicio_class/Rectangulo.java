package ejercicio_class;

public class Rectangulo {
	
	//Attributes
//	private Punto a;
//	private Punto b;
//	private Punto c;
//	private Punto d;
	private int altura;
	private int base;
	
	private Punto [] puntos; //= new Punto [4];
	
	
	
	//Constructors
//	Rectangulo(Punto a, Punto b, Punto c, Punto d){
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		this.d = d;
//		
//	}
	
	public Rectangulo() {
		puntos = new Punto [4];
	}
	
//	Rectangulo(int base, int altura) {
//		this.a = new Punto(0,0);
//		this.b = new Punto(this.a.getX(), base);
//		this.c = new Punto(altura, this.b.getY());
//		this.d = new Punto(this.c.getX(), this.a.getY());
//	}
	
	//Methods
	public Punto[] getPuntos() {
		return puntos;
	}

	public void setPuntos(Punto[] puntos) {
		this.puntos = puntos;
	}

//	public Punto getA() {
//		return a;
//	}
//
//	public void setA(Punto a) {
//		this.a = a;
//	}
//
//	public Punto getB() {
//		return b;
//	}
//
//	public void setB(Punto b) {
//		this.b = b;
//	}
//
//	public Punto getC() {
//		return c;
//	}
//
//	public void setC(Punto c) {
//		this.c = c;
//	}
//
//	public Punto getD() {
//		return d;
//	}
//
//	public void setD(Punto d) {
//		this.d = d;
//	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
//	public float Superficie() {
//		return (this.d.getX() - this.a.getX())*(this.b.getY() - this.a.getY());
//	}
	
	public static void main(String[] args) {
		
//		Punto ver1 = new Punto(3, 6);
//		Punto ver2 = new Punto(3, 8);
//		Punto ver3 = new Punto(8, 8);
//		Punto ver4 = new Punto(8, 6);
//		
//		Rectangulo rectangulo1 = new Rectangulo(ver1, ver2, ver3, ver4);
//		Rectangulo rectangulo2 = new Rectangulo(5, 3);
//		
//		System.out.println(rectangulo1.Superficie() + "\n" + rectangulo2.Superficie());
//		//System.out.println(rectangulo2.Superficie());
		
		Punto a = new Punto(3, 6);
		Punto b = new Punto(3, 8);
		Punto c = new Punto(8, 8);
		Punto d = new Punto(8, 6);
		
		Punto [] puntosr = {a,b,c,d};
		
		Rectangulo r1 = new Rectangulo();
		r1.setPuntos(puntosr);
		//Continuar expandiendo
		
	}
}

