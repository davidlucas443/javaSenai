package aula3;

import java.util.Scanner;

public class questaoF {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		Double a, b, c, d;
		
		System.out.println("digite o valor de a");
		a = sc.nextDouble();
		
		System.out.println("digite o valor de b");
		b = sc.nextDouble();
		
		c = a;
		d = b;
		
		System.out.println("o valor de A é" + d);
		
		System.out.println("o valor de B é " + c);
				
	}
}
