import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMeotodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String,Double> carros = new HashMap<>() {{
     put("gol",14.4);
     put("uno", 15.6);
     put("mobi", 16.1);
     put("hb20", 14.5);
     put("kwid",15.6);
	}};
	//maps to string
	System.out.println(carros.toString());
	//subistituir a chave
	carros.put("gol", 15.2);
	//ve se um determinada chave tem
	System.out.println(carros.containsKey("tombsom"));
	System.out.println(carros.containsKey("uno"));
	//pegar o valor de uma determinada chave
	System.out.println(carros.get("uno"));
	//pegar todas a chaves, ele me retorna um set contendo todas as chaves
	System.out.println(carros.keySet());
	//pegar os valores do maps ele retorna um collections como os valores
	System.out.println(carros.values());
	//ver qual é o maior valor de um mapa
	System.out.println(Collections.max(carros.values()));
	//minimo
	System.out.println(Collections.min(carros.values()));
	//interfaces entry
	Set<Map.Entry<String,Double>> entries = carros.entrySet();
	String modelomaisEficiente = "";
	for (Map.Entry<String,Double> entry: entries) {
		if(entry.getValue().equals(Collections.max(carros.values()))) {
			modelomaisEficiente = entry.getKey();
		}
	}
	System.out.println(modelomaisEficiente);
	 

}
}
