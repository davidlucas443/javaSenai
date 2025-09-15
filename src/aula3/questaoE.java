package aula3;

import java.util.Scanner;

public class questaoE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		Double taxa, valor, prestacao;
		int tempo;
		
		System.out.println("digite o valor da prestação");
		prestacao = sc.nextDouble();
		
		System.out.println("digite o valor da taxa");
		taxa = sc.nextDouble();
		
		System.out.println(" digite o tempo de atraso");
		tempo = sc.nextInt();
		
		valor = (prestacao +( prestacao*(taxa/100))*tempo);
		
		System.out.println("o valor é :" + valor);
		}
}
