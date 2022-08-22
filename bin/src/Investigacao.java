import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Investigacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> respostas = new ArrayList<String>();
		System.out.println("------------------------------------------------------");
		System.out.println("INVESTIGAÇÃO");
		System.out.println("------------------------------------------------------");
		System.out.println("Responda S para sim e N para não");
		System.out.println("Telefonou para vítima S/N ?  ");
		respostas.add(scan.next());
		System.out.println("Esteve no local do crime S/N ?  ");
		respostas.add(scan.next());
		System.out.println("Mora perto vítima S/N ?  ");
		respostas.add(scan.next());
		System.out.println("Devia perto vítima S/N ?  ");
		respostas.add(scan.next());
		System.out.println("Já trabalhou com a vítima S/N ?  ");
		respostas.add(scan.next());
		int qtdSim = 0;
		int qtdNao = 0;
		
		for (String r : respostas) {
			if(r.equalsIgnoreCase("S")) qtdSim ++;;
			
		
		}
		
		if(qtdSim == 2) {
			System.out.println("Você é suspeito!!");
		}
		else if(qtdSim == 3 || qtdSim == 4) {
			System.out.println("Você é Cumplice!!!!");	
		}
		else if(qtdSim == 5) {
			System.out.println("Você é o Assassino!!!!!!!!!!!!!!!!!!!!!!!!!!");	
		}
		else {
			System.out.println("Você é o Inocente!");	
		}
		
		// TODO Auto-generated method stub

	}

}
