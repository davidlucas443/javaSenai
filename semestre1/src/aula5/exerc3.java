package vetor;

import java.util.Random;
import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int[]vetor = {8,2,3,4,5,6,7,1};
		
		int menor = vetor[0];
        int maior = vetor[0]; 
		
		int i = 0;
		
		for (; i < vetor.length; i++) {
	
		  if (vetor[i] < menor) {
              menor = vetor[i];  
		  }
		  
		  if (vetor[i] > maior) 
		  {
			  maior = vetor[i];
		  }
		}
	
		  System.out.println("Menor número: " + menor);
	      System.out.println("Maior número: " + maior);

}
}


