package models;

import java.util.Comparator;
import java.util.Objects;

public class Linguagem implements Comparable<Linguagem> {
@Override
	public int hashCode() {
		return Objects.hash(anoDecriacao, ide, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linguagem other = (Linguagem) obj;
		return anoDecriacao == other.anoDecriacao && Objects.equals(ide, other.ide) && Objects.equals(nome, other.nome);
	}

private  String nome;
@Override
public String toString() {
	return "Linguagem [nome=" + nome + ", anoDecriacao=" + anoDecriacao + ", ide=" + ide + "]";
}

private int  anoDecriacao;
private String ide;

public Linguagem(String nome, int anoDecriacao, String ide) {
	super();
	this.nome = nome;
	this.anoDecriacao = anoDecriacao;
	this.ide = ide;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getAnoDecriacao() {
	return anoDecriacao;
}

public void setAnoDecriacao(int anoDecriacao) {
	this.anoDecriacao = anoDecriacao;
}

public String getIde() {
	return ide;
}

public void setIde(String ide) {
	this.ide = ide;
}

@Override
public int compareTo(Linguagem l) {
	// TODO Auto-generated method stub
	return this.getNome().compareToIgnoreCase(l.getNome());
}




	
	

}
