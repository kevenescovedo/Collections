import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

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
		// ver elemento que ta em uma posicao
		
        System.out.println(notas.get(2));
        //ver o menor elemento de uma collection
        System.out.println(Collections.min(notas));
        //ver o maior elemento de uma collection
        System.out.println(Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while(iterator.hasNext()) {
        	
        Double next =	iterator.next();
        soma += next;
        // acessar a quantidade de elementos
        notas.size();
        //remover a posicao 
        notas.remove(0);
        //remover nota objeto
        notas.remove(10d);
        //remover todos elementos menores que sete
        Iterator<Double> it2 = notas.iterator();
        while(it2.hasNext()) {
        	Double n = it2.next();
        	if(n < 7) it2.remove();
        }
        //remover todas as notas
        notas.clear();
        //verificar se lista esta vazio
        notas.isEmpty();
        
        }
        
       
        
	}

}
