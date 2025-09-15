package aula1;

import java.util.Scanner;

public class subtracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double a, b, subtracao;
		System.out.println("digite o primeiro numero");
		a = sc.nextDouble();
		System.out.println("digite o segundo numero");
		b = sc.nextDouble();
		subtracao = (a - b);
	    System.out.println("a subtraçao dos dois numeros é " + subtracao);
		
	}

}
