/*Realizar una peque�a aplicaci�n en Java utilizando polimorfismo, 
 para la gesti�n de los intereses de distintos tipos de cuentas de un banco.
  La aplicaci�n se compondr� de una clase padre abstracta CuentaAbs que contendr�
  un m�todo abstracto calculaInteres(double cantidad) que devolver� un double con 
  el c�lculo de los intereses aplicados a cierta cantidad de dinero. La clase CuentaAbs
  debe contar como m�nimo con los atributos: n�mero de cuenta (String), titular (String), 
  saldo (double) y fecha de apertura (Calendar) y sus correspondientes m�todos get y set. 
  De la clase CuentaAbs heredar�n dos clases llamadas CuentaAhorro y CuentaPlazo que 
  implementar�n el m�todo abstracto dando un inter�s del 2 % la primera y un 5 % la segunda.
  La calse CuentaAhorro incorporar� un nuevo atributo llamado numTarjCredito de tipo String 
  y CuentaPlazo el atributo numA�os de tipo int. Probar las clases con distintos objetos de 
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