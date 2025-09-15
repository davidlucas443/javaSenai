package vetor;

import java.util.Random;
import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rm = new Random();
		
		int vetor[] = new int[4];
		
		int i = 0;
		
		
		for (; i < vetor.length; i++)
		
		{
			vetor[i] = rm.nextInt(1,100);
			System.out.println();
			
			if(vetor[i]%2==1) {
				System.out.println("impar");
				
			}else {
				System.out.println("par");
			
			}
			
			
		}
		
		

	}

}
