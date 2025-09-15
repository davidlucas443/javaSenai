package aula2;

import java.util.Scanner;

public class problemaquadro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
			Double largura, diagonal, altura, area, perimetro;
			System.out.println("digite a largura do quadrado:");
			largura = sc.nextDouble();
			System.out.println("digite a altura:");
			altura = sc.nextDouble();
			area = (largura*altura);
			System.out.println("a area do quadrado é igual:" + area);
			perimetro = ((altura*2)+ (largura*2));
			System.out.println("o valor do perimetro é :" + perimetro);
			diagonal = Math.sqrt(largura*largura + altura * altura);
			System.out.printf(" o valor da diagonal é igual a: %.2f" , diagonal);
			
		}while (0<=1);

	}

}
