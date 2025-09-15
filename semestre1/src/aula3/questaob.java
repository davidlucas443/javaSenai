package aula3;

import java.util.Scanner;

public class questaob {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Double c, f;
		
		System.out.println("digite o número em farenheit");
		f = sc.nextDouble();
		
		c = ((f - 32) * 5) / 9;
		
		System.out.println("em celcius é igual a :" + c);
	}
}
