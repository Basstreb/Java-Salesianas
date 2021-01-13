package palindromo;

public class PalindromoFacil {

	public static void main(String[] args) {
		
		String palindromo = "Dabale arroz a la zorra el abad";
		StringBuilder sb = new StringBuilder(palindromo);
		
		sb.reverse(); //Lo invertimos
				
		System.out.println(sb); //Llamada implicita a sb.toString()
	}

}
