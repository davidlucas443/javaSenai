package testemiguel;

import java.util.Scanner;

public class dont6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("digite o primeiro numero");
		c = sc.nextInt();
		System.out.println("digite o segundo número");
		a = sc.nextInt();
		if (a>0)
		{
			System.out.println(" o resultado é " +(c/a));
           
		}
		else
		{
		    System.out.println("digite um número que não seja 0");	

	}
	}
}
