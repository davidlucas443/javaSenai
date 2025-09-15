package Retangulos;

import java.util.Scanner;

public class retangulos1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, iremos calcular a área de 3 retãngulos");
		System.out.println(" ");

		int[] area = { 1, 2, 3 };

		for (int i = 0; i < area.length; i++) {

			System.out.println("Digite o valor da base " + area[0]);
			area[0] = sc.nextInt();

			System.out.println("Digite o valor da base " + area[1]);
			area[1] = sc.nextInt();

			System.out.println("Digite o valor da base " + area[2]);
			area[2] = sc.nextInt();

		int[] base = { 1, 2, 3 };
		
		for (int j = 0; j < area.length; j++) {
		
			System.out.println("Digite o valor da altura " + base[0]);
			base[0] = sc.nextInt();

			System.out.println("Digite o valor altura " + base[1]);
			base[1] = sc.nextInt();

			System.out.println("Digite o valor altura " + base[2]);
			base[2] = sc.nextInt();
			
		System.out.println("A área do retangulo 1 é : " + area[0] * base[0]);
		System.out.println("A área do retangulo 2 é : " + area[1] * base[1]);
		System.out.println("A área do retangulo 3 é : " + area[2] * base[2]);
		
		return;

		}

	}
	}
}


