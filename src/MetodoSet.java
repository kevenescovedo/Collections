import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MetodoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Crie um conjunto e adicione datas");
     Set<Double> notas =  new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0.0,3.6));
     //ordem aleatoria dos elementos
     System.out.println(notas.toString());
     //ver se tem a nota 5
     System.out.println("tem nota 5 " + notas.contains(5d));
     //nao consigo pegar index e subistituir um item por index
     //ver qual e maior nota
     System.out.println(Collections.max(notas));
     // ver menor idade
     System.out.println(Collections.min(notas));
     
     //exibir as somas dos valores
     double soma = 0;
     Iterator<Double> iterator = notas.iterator();
     while(iterator.hasNext()) {
    	 double n = iterator.next();
    	 soma += n;
     }
     System.out.println(soma);
     //exibi a media da nota
     System.out.println("Média das notas " + (soma/notas.size()));
     //remover index
     notas.remove(0.0);
      
     System.out.println(notas.toString());
     Iterator<Double> iterator2 = notas.iterator();
     while(iterator2.hasNext()) {
      	double n = iterator2.next();
      
      	if(n < 7d) {
      		iterator2.remove();
     
      	}
      }
     System.out.println(notas.toString());
     //colocar list ordenada na ordem insercao
    Set<Double> notasOrdenada = new LinkedHashSet<Double>();
    notasOrdenada.add(7d);
    notasOrdenada.add(8.5);
    notasOrdenada.add(9.3);
    notasOrdenada.add(5d);
    notasOrdenada.add(7d);
    notasOrdenada.add(0.0);
    notasOrdenada.add(3.6);
    System.out.println(notasOrdenada);
//ordem natural dos elementos
    Set<Double> crescente = new TreeSet<>();
    crescente.add(7d);
    crescente.add(8.5);
    crescente.add(9.3);
    crescente.add(5d);
    crescente.add(7d);
    crescente.add(0.0);
    crescente.add(3.6);
    System.out.println(crescente);
    //apaagar
    crescente.clear();
	}
	 
     

}
