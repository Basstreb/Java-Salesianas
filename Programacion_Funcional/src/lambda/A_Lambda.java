package lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A_Lambda {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// 1. Forma: una clase que implementa comparator
		// lista.sort

		lista.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1.compareTo(o2));
			}
		});
	}

}
