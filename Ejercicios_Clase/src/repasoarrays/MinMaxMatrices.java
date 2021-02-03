package repasoarrays;

public class MinMaxMatrices {

	public static void main(String[] args) {

		int [][] matriz = new int [2][2];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (int) (Math.random() * ((11 - 1) + 1));
				System.out.println(matriz[i][j]);
			}
		}
		
	}

}
