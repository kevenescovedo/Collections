import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {

	public static void main(String[] args) {
		Set<String> arcoiris2 = new LinkedHashSet<>();
			   
		arcoiris2.add("Vermelha");
		arcoiris2.add("Laranja");
		arcoiris2.add("Amarela");
		arcoiris2.add("Verde");
		arcoiris2.add("Azul Escuro");
		arcoiris2.add("Azul");
		arcoiris2.add("Violeta");
			   
			  
			   
		   
		// TODO Auto-generated method stub
   Set<String> arcoiris = new TreeSet<>() {
	   {
		   add("Vermelha");
		   add("Laranja");
		   add("Amarela");
		   add("Verde");
		   add("Azul Escuro");
		   add("Azul");
		   add("Violeta");
	   }
	  
	   
   };
   System.out.println("Exibir todas as cores e em ordem alfabética");
   System.out.println(" ");
   for (String cor: arcoiris) {
	   System.out.println(cor);
   }
   System.out.println("Quantidade de cores do arco iris");
   System.out.println(arcoiris.size());
   System.out.println("Ordem Inversa");
   System.out.println(" ");
   List<String> arcosirisArray = new ArrayList<>(arcoiris2);
   Collections.reverse(arcosirisArray);
   
  
   for (String cor:  arcosirisArray) {
	   System.out.println(cor);
   }
  System.out.println(" ");
  System.out.println("Mostrar as cores que começam com V");
  for (String cor:  arcosirisArray) {
	  if((cor.startsWith("V") || cor.startsWith("v"))) System.out.println(cor);
  }
  System.out.println(" ");
  System.out.println("Mostrar as cores que não começam com V");
  for (String cor: arcosirisArray) {
	  if(!(cor.startsWith("V") || cor.startsWith("v")) ) System.out.println(cor);
  
	
 
	}
//LIMPAS Os conjuntos
  arcosirisArray.clear();
  arcoiris.clear();
  arcoiris2.clear();
  //verificar se a coleção está vazia
  System.out.println(arcoiris.isEmpty());
  
  
	}
}


