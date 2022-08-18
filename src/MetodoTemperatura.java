import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class MetodoTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> temperaturas = new ArrayList<>(Arrays.asList(18d, 22d, 24d, 20d, 21d,32d));
		 Iterator<Double > iterator = temperaturas.iterator();
		 double somaTemp = 0;
		 while(iterator.hasNext()) {
		double nt = iterator.next();
		somaTemp += nt;
		 }
		 double media = (somaTemp / temperaturas.size());
		 System.out.println("A média das tempeaturas é : " + (somaTemp / temperaturas.size()+ "ºC"));
		 
		for (int i = 0; i < temperaturas.size(); i++) {
			double t = temperaturas.get(i);
			if(temperaturas.get(i) > media) {
			  if(i == 0) {
				  System.out.println(t+"-Janeiro");
			  }
			  else if(i == 1) {
				  
					  System.out.println(t+"-Fevereiro");
				  
			  }
			  else if(i == 2) {
				  
				  System.out.println(t+"-Março");
			  
				  
		  }
			  else if(i == 3) {
				  
				  System.out.println(t+"-Abril");
			  
		  }
			  else if(i == 4) {
				  
				  System.out.println(t+"-Maio");
			  
		  }
			  else if(i == 5) {
				  
				  System.out.println(t+"-Junho");
			  
		  }
			  else {
				  break;
			  }
			}
		}
		 
	}
	
	
	
		
		

	

}

