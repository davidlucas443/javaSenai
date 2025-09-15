package aula3;

import java.util.Scanner;

public class QuestaoH {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Double volume, comprimento, largura, altura;
		
		System.out.println("digite o valor do comprimento");
		comprimento = sc.nextDouble();
		
		System.out.println("digite o valor da largura");
		largura = sc.nextDouble();
		
		System.out.println("digite o valor da altura");
		altura = sc.nextDouble();
		
		volume = comprimento*largura*altura;
		
		System.out.println("o valor do volume do retangulo é " + volume);
				
	}

}
