import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MetodoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> list =  new ArrayList<>();
		// não recomedndado, por que a deve se programar voltado para interface
		
		
		ArrayList<Double> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>(Arrays.asList(1d,2.5,3.4,4.5));
		list3.add(20.4);
		//não recomendado por que nao pode adicionar dados e nem excluir as duas ultimas
		List<Double> list4 = Arrays.asList(1.2,3.4);
		List<Double> list5 = List.of(1.2,4.5);
		
		List<Double> notas = new ArrayList<Double>();
		notas.add(7d);
		notas.add(8.5);
		
		notas.add(7.4);
		notas.add(10d);
		notas.add(10d);
		notas.add(9.9);
		notas.add(9.5);
		System.out.println(notas);
		System.out.println(notas.indexOf(7.4));
		notas.add(4, 8.0);
		System.out.println(notas);
		notas.set(notas.indexOf(7.4), 6.0 );
		System.out.println(notas);
		System.out.println(notas.contains(6.0));
		for (Double nota : notas) {
			System.out.println(nota);
		}
		

	}

}
