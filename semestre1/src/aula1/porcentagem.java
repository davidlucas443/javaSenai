package aula1;

import java.util.Scanner;

public class porcentagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		do {
		double a, b, porcentagem;
		System.out.println("primeiro numero");
		a = sc.nextDouble();
		System.out.println("segundo numero");
		b = sc.nextDouble();
		porcentagem = (a / 100 * b);
		System.out.println(" a porcentatagem dos dois é : " + porcentagem );
		}while (0<=1);
	}

}
