package Informaticos;

public class Main {
	public static void main(String[] args) {
		//Creamos informáticos
		InformaticoAbs inf1 = new Analista("IBM","BBDD");
		InformaticoAbs inf2 = new Programador("Indra","Java");
		//Pagamos los sueldos utilizando polimorfismo
		inf1.setSueldo(inf1.pagarSueldo(160));
		inf2.setSueldo(inf2.pagarSueldo(180));
		System.out.println("Sueldo analista: "+inf1.getSueldo());
		System.out.println("Sueldo programador: "+inf2.getSueldo());
	}
}