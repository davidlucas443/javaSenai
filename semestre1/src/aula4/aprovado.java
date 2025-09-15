package testemiguel;

import java.util.Scanner;

public class aprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double nota;
		System.out.println("digite uma nota");
		nota = sc.nextDouble();
		if (nota>7) {
			System.out.println("aprovado");
		}
		else if (nota>=4 && nota<=7) {
			System.out.println(" Recuperação");
			}
		else { 
			System.out.println("Reprovado");
			
			
			
		}
	}

}
