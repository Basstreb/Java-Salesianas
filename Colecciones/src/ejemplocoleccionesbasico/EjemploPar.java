package ejemplocoleccionesbasico;

public class EjemploPar {

	public static void main(String[] args) {
		
		Par<Integer, String> pareja1 = new Par<>(1, "UnO");
		
		System.out.println(pareja1);
		
		//pareja1.setObj1("UNO"); //Error de Compilacion
		
		Par<String, String> pareja2 = new Par<>("Hola", "mundo");
		
		System.out.println(pareja2);

	}

}
