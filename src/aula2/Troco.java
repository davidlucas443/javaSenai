package aula2;

import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double prunit, quantidade, dinheirorec, troco;
		System.out.println("digite o preço unitario do produto");
		prunit = sc.nextDouble();
		System.out.println("digite a quantidade comprada");
		quantidade = sc.nextDouble();
		System.out.println("digite o valor recebido");
		dinheirorec = sc.nextDouble();
		troco = (dinheirorec - (prunit*quantidade));
		System.out.println("o valor do troco é :" + troco);

	}

}
