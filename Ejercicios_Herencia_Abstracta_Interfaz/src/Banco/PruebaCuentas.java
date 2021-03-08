/*Realizar una pequeña aplicación en Java utilizando polimorfismo, 
 para la gestión de los intereses de distintos tipos de cuentas de un banco.
  La aplicación se compondrá de una clase padre abstracta CuentaAbs que contendrá
  un método abstracto calculaInteres(double cantidad) que devolverá un double con 
  el cálculo de los intereses aplicados a cierta cantidad de dinero. La clase CuentaAbs
  debe contar como mínimo con los atributos: número de cuenta (String), titular (String), 
  saldo (double) y fecha de apertura (Calendar) y sus correspondientes métodos get y set. 
  De la clase CuentaAbs heredarán dos clases llamadas CuentaAhorro y CuentaPlazo que 
  implementarán el método abstracto dando un interés del 2 % la primera y un 5 % la segunda.
  La calse CuentaAhorro incorporará un nuevo atributo llamado numTarjCredito de tipo String 
  y CuentaPlazo el atributo numAños de tipo int. Probar las clases con distintos objetos de 
  los dos tipos de cuentas.
 */

package Banco;

public class PruebaCuentas {

	public static void main(String[] args) {
		
		CuentaAbs c1 = new CuentaAhorro("1","Pepe",100,"124236987364");
		CuentaAbs c2 = new CuentaPlazo("2","Maria",200,4);
		c1.ingresar(200);
		c2.retirar(100);
		System.out.println(c1.toString());
		double c1i = c1.calculaInteres(c1.getSaldo()) + c1.getSaldo();
		double c2i = c2.calculaInteres(c2.getSaldo()) + c2.getSaldo();
		System.out.println("Tu saldo de la CuentaAhorro + los intereses queda en: "+ c1i);
		System.out.println(c2.toString());
		System.out.println("Tu saldo de la CuentaPlazo + los intereses queda en: "+ c2i);
	}
}