package vetor;

import java.util.Scanner;

public class exerc7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int vetor [] = {1,2,3,4,5};
		int num;
		
		System.out.println("digite um número : ");
		num = sc.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print(i+1 + " x " +num+ " = ");
			System.out.println( vetor[i]*num);
			
		
		
		}

	}

}
