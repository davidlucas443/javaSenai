package vetor;

import java.util.Scanner;



public class exerc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[5];

		int i = 0;
		for (; i < vetor.length; i++) {

			System.out.println("digite um número");

			vetor[i] = sc.nextInt();

		}
		
		for(int num:vetor) {
			System.out.print(num+ " ");
			
			
		}

	}

}
