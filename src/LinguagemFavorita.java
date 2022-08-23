import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Linguagem;

public class LinguagemFavorita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Set<Linguagem> linguagens = new LinkedHashSet<>();
 linguagens.add(new Linguagem("Dart",2018, "Android Studio"));
 linguagens.add(new Linguagem("Javascript",1997, "Visual Studio Code"));
 linguagens.add(new Linguagem("PHP",1994, "PHPStorm"));
 linguagens.add(new Linguagem("Java",1991, "Elipse"));
 linguagens.add(new Linguagem("C#",1999, "Visual Studio "));
 linguagens.add(new Linguagem("Python",1990, "PyCharm"));
 
 System.out.println("Ordem de inserção");
 for (Linguagem l : linguagens) {
	 
	 System.out.println(l.toString());
 }
 System.out.println("Ordem de Natural");
Set<Linguagem> ls = new TreeSet(linguagens);
for (Linguagem l : ls) {
	 
	 System.out.println(l.toString());
}
System.out.println("Ordem de IDE");
Set<Linguagem> ls2 = new TreeSet(new ComperatorIde());
ls2.addAll(linguagens);
for (Linguagem l : ls2) {
	 
	 System.out.println(l.toString());
}
System.out.println("Ordem de Ano de Criação e Nome");
Set<Linguagem> ls3 = new TreeSet(new  ComparatorAnoCriacaoNome());

ls3.addAll(linguagens);
for (Linguagem l : ls3) {
	 
	 System.out.println(l.toString());
}
System.out.println("Nome, Ano de Criação e IDE ");
Set<Linguagem> ls4 = new TreeSet(new  ComparatorNomeAnoCriacaoIde());
ls4.addAll(linguagens);

ls3.addAll(linguagens);
for (Linguagem l : ls4) {
	 
	 System.out.println(l.toString());
}


 
 
 
 
 
	}

}
class ComperatorIde implements Comparator<Linguagem> {

	@Override
	public int compare(Linguagem l1, Linguagem l2) {
		// TODO Auto-generated method stub
		return l1.getIde().compareToIgnoreCase(l2.getIde());
	}
	
}
class ComparatorAnoCriacaoNome implements Comparator<Linguagem> {

	@Override
	public int compare(Linguagem l1, Linguagem l2) {
		int anocriacao = Integer.compare(l1.getAnoDecriacao(), l2.getAnoDecriacao());
		if(anocriacao != 0) return anocriacao;
		// TODO Auto-generated method stub
		return l1.getNome().compareTo(l2.getNome());
	}
	
}
class ComparatorNomeAnoCriacaoIde implements Comparator<Linguagem> {

	@Override
	public int compare(Linguagem l1, Linguagem l2) {
		int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
		if(nome != 0) return nome;
		// TODO Auto-generated method stub
		int ano = Integer.compare(l1.getAnoDecriacao(), l2.getAnoDecriacao());
		if(ano != 0) return ano;
		return l1.getIde().compareToIgnoreCase(l2.getIde());
	}
	
}

