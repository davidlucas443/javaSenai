package fiama;

public class exerc10 {

	public static void main(String[] args) {
		
		double vetor [] = {8.0, 6.5, 7.2, 5.0, 9.0, 7.5 };
		double soma=0, media;
		
		for (int i = 0; i < vetor.length; i++) {
			
		soma+=vetor[i];
		
		}
			
         media = soma / vetor.length;
         
         if (media>=7) {
				
				System.out.println("aprovado");
			
		}
			else {
				
				System.out.println("reprovado");
			}
	}


}