package ejercicio_class;

import java.util.Scanner;

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
	
	public float Superficie() {
		//return (this.d.getX() - this.a.getX())*(this.b.getY() - this.a.getY());
		
		float cuadradob = (float) (Math.pow(puntos[3].getX() - puntos[0].getX(), 2) + Math.pow(puntos[3].getY() - puntos[0].getY(), 2));
		float cuadradoa = (float) (Math.pow(puntos[1].getX() - puntos[0].getX(), 2) + Math.pow(puntos[1].getY() - puntos[0].getY(), 2));
		float raizb = (float) Math.sqrt(cuadradob);
		float raiza = (float) Math.sqrt(cuadradoa);
		return raiza * raizb;
		
		//return (puntos[3].getX() - puntos[0].getX())*(puntos[1].getY() - puntos[0].getY());
	}
	
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
		
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		
		System.out.println("Introduzca primero la X del primer punto y luego la Y");
		Punto a = new Punto(num.nextInt(), num.nextInt());
		
		System.out.println("Introduzca primero la X del segundo punto y luego la Y");
		Punto b = new Punto(num.nextInt(), num.nextInt());
		
		System.out.println("Introduzca primero la X del tercer punto y luego la Y");
		Punto c = new Punto(num.nextInt(), num.nextInt());
		
		System.out.println("Introduzca primero la X del último punto y luego la Y");
		Punto d = new Punto(num.nextInt(), num.nextInt());
		
		Punto [] puntosr = {a,b,c,d};
		
		Rectangulo r1 = new Rectangulo();
		r1.setPuntos(puntosr);
		
		System.out.println(r1.Superficie());
		//Continuar expandiendo
		
	}
}

