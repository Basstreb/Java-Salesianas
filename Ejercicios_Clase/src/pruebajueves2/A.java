package pruebajueves2;

public class A {
	//Debemos agregar las variables j y k asignándoles el valor protected para que la clase B pueda heredar estos valores.
		protected int j; 
		protected int k;

		public A() {}
		
		//Este es el constructor para poder asignar valores int a los atributos creados.
		public A(int j, int k) {
			this.j = j; 
			this.k = k;
		}

}
