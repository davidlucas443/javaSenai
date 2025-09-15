package vetor;

import java.util.Random;
import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		
		int[]vetor = new int[10];
		
		int soma = 0;
		
		int i = 0;
		
		for (; i < vetor.length; i++)
		
		{
			
	     vetor[i] = rm.nextInt(100);
	    
		}
		
		    for (int num:vetor) {
			
			
			soma = soma+num;
			 
		}
		    
		    System.out.println(soma);
	}

}
