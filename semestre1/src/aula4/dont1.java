package testemiguel;

import java.util.Scanner;

public class dont1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
	        System.out.println("Para saber a sua media de notas, digite a primeira nota: ");                                                                                                                         
	        double nota1 = sc.nextInt();

	        System.out.println("Digite a segunda nota : ");
	        double nota2 = sc.nextInt();

	        System.out.println("Digite a terceira nota: ");
	        double nota3 = sc.nextInt();

	        double media =  +nota1 + nota2 + nota3 / 3;

	        if(media >= 7) {
	       
	            System.out.println("Aprovado!");
	        }
	        else
	        { 
	            System.out.println("Reprovado" + media);
	        }
	        
	        sc.close();

	}

}
