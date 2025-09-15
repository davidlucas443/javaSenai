package aula3;

import java.util.Scanner;

public class questaoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Double altura, raio, volume;
		
		System.out.println("digite o valor do raio");
		raio = sc.nextDouble();
		
		System.out.println("digite o valor da altura");
		altura = sc.nextDouble();
		
		volume = (3.14159*(raio*raio)*altura);
		
		System.out.println("o volume é igual a :" + volume);
	}
}
