package aula3;

import java.util.Scanner;

public class conversor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Double c, f;
		System.out.println("digite o número em celcius");
		c = sc.nextDouble();
		
		f = (c * 9 / 5 + 32);
		
		System.out.println("em farenheit é igual a :" + f);
	}
}
