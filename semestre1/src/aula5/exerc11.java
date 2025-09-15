package fiama;

import java.util.Arrays;
import java.util.Scanner;

public class exerc11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		int v [] = {1,2,3,4,5};	
		
		rotacionar(v, 1) ;
		System.out.println(Arrays.toString(v));
		

	}

	private static void rotacionar(int[] v, int k) {
		
		while(k>0)  {
			
		deslocarDireita(v);
	    k--;
			
			
		}
 		
		
	}

	private static void deslocarDireita(int[] v) {
		
		int n = v.length;
		
		int aux = v[n-1];
		
		for(int i = n-1; i  > 0; i-- ) {
			
			v[i] = v[i-1];
			
			
		}
       v[0] = aux;
       
	}	

}
