import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListOrndenacao {

	public static void main(String[] args) {
		List<Gato> gatos = new ArrayList<>();
		gatos.add(new Gato("John",18, "preto"));
		gatos.add(new Gato("Simba",6,"tigrado"));
		gatos.add(new Gato("aohn",12,"amarelo"));
		//orderm de inserção
		System.out.println(gatos);
		//ordem aleatoria
		Collections.shuffle(gatos);
		System.out.println(gatos);
		//ordenação de nome
		Collections.sort(gatos);
		System.out.println(gatos);
		//ordenacao de idade
		gatos.sort(new ComparatorIdade());
		System.out.println(gatos);
		//ordenacao de cor
		Collections.sort(gatos, new  ComparatorCor());
		System.out.println(gatos);
		// TODO Auto-generated method stub

	}

}
class Gato implements Comparable<Gato> {
	private String nome;
	private Integer idade;
	private String color;
	
	public Gato(String nome, Integer idade, String color) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", color=" + color + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	
	@Override
	public int compareTo(Gato o) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(o.getNome());
	}

}
class  ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
	
	
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return g1.getColor().compareToIgnoreCase(g2.getColor());
	}
	
}

