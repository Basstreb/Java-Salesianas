package Interfaces;

public class Cuadrado implements FiguraGeometrica{
	int lado;
	public Cuadrado (int lado) {
		this.lado = lado;
	}
	public void area (){
		System.out.println("El area del cuadrado es "+(lado*lado));
	}
}
