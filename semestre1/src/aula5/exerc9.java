package vetor;

public class exerc9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = { 2, 5, 8, 3, 9, 10, 11, 12, 13, 14};
		int num1, num2=0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			if(vetor[i]%2==0) {
		
				System.out.println("numeros pares : " +vetor[i] );
			}
			
			else if (vetor[i]%2==1)
			
			{
				System.out.println("numeros impares : "+vetor[i] );
			}
		
		}
	}

}
