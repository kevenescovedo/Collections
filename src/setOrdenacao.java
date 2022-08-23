import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class setOrdenacao {
public static void main(String[] args) {
	//ordem aleatoria
	Set<Serie> series = new HashSet<>(){{
		add(new Serie("got","fantasia",60));
		add(new Serie("Dark","drama",60));
		add(new Serie("That, 70 show","Comédia",25));
		
	}};
	
	for (Serie serie : series) {
		System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodeo());
	}
	//ordem por inserção
	Set<Serie> series2 = new LinkedHashSet<Serie>() {{
		add(new Serie("got","fantasia",60));
		add(new Serie("Dark","drama",60));
		add(new Serie("That, 70 show","",60));
	}};
	
	System.out.println("Linked hash set");
	for (Serie serie: series2) {
		System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodeo());
	}
	//ordem natural de elementos neste caso usando o comparable por tempo de episodeo
	Set<Serie> series3 = new TreeSet<>(series);
	System.out.println("tree set");
	for (Serie serie: series3) {
		System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodeo());
	}
	System.out.println("   ");
	System.out.println("Com comparator   ");
	//ordem com compatrator ordenando por nome, genero e tempo de episodeo 
	Set<Serie> series4 = new TreeSet<>(new  ComperatorNomeGeneroTempoEpisodeo());
	series4.addAll(series);
	System.out.println("tree set");
	for (Serie serie: series4) {
		System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodeo());
	}
	Set<Serie> serie5 = new TreeSet<>(new ComparetorGenero() );
	serie5.addAll(series);
	System.out.println("  ");
	//ordem por genêro
	for (Serie serie: serie5) {
		System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodeo());
	}
	
	

}
}

class Serie implements Comparable<Serie> {
@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodeo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodeo, other.tempoEpisodeo);
	}
private String nome;
private String genero;
private Integer tempoEpisodeo;
@Override
public String toString() {
	return "Serie [serie=" + nome + ", genero=" + genero + ", tempoEpisodeo=" + tempoEpisodeo + "]";
}
public Serie(String nome, String genero, Integer tempoEpisodeo) {
	super();
	this.nome = nome;
	this.genero = genero;
	this.tempoEpisodeo = tempoEpisodeo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public Integer getTempoEpisodeo() {
	return tempoEpisodeo;
}
public void setTempoEpisodeo(Integer tempoEpisodeo) {
	this.tempoEpisodeo = tempoEpisodeo;
}
@Override
public int compareTo(Serie o) {
	int genero = this.getGenero().compareTo(o.getGenero());
	int tempoEpisodeo = Integer.compare(this.getTempoEpisodeo(), o.getTempoEpisodeo());
	if(tempoEpisodeo != 0) return tempoEpisodeo;
	return genero;
	
}

}
class ComperatorNomeGeneroTempoEpisodeo implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) return nome;
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) return genero;
		return Integer.compare(s1.getTempoEpisodeo(), s2.getTempoEpisodeo());
	}
	
	
	
}
class ComparetorGenero implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {
		// TODO Auto-generated method stub
		return s1.getGenero().compareToIgnoreCase(s2.getGenero());
		
	}
	
}