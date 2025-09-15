package aula3;

import java.util.Scanner;

public class questaoG {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Double a, b, c, d;
		System.out.println("digite o valor de a");
		a =sc.nextDouble();
		
		System.out.println("digite o valor de b");
		b =sc.nextDouble();
		
		System.out.println("digite o valor de c");
		c =sc.nextDouble();
		
		System.out.println("digite o valor de d");
		d =sc.nextDouble();
		
		System.out.println("as somas sao");
		
		System.out.println(a+b);
		System.out.println(a+c);
		System.out.println(a+d);
		System.out.println(b+c);
		System.out.println(b+d);
		System.out.println(c+d);
		
		System.out.println("as multiplicaçoes sao");
		
		System.out.println(a*b);
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(b*c);
		System.out.println(b*d);
		System.out.println(c*d);
	}
	


}
