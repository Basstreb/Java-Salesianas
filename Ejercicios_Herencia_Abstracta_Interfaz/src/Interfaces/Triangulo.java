package Interfaces;

public class Triangulo implements FiguraGeometrica{
	int base, altura;
	public Triangulo (int base, int altura) {
		this.base=base;
		this.altura =altura;
	}
	public void area () {
		System.out.println("El area del triangulo es " + (base*altura )/2);
	}
}
