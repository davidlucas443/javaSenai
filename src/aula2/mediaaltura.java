package aula2;

import java.util.Scanner;

public class mediaaltura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double altura1 , altura2, alturamedia;
		String primeironome, segundonome;
		System.out.println(" qual o primeiro nome");
		primeironome = sc.nextLine();
        System.out.println("digite o segundo nome:");
	    segundonome = sc.nextLine();
		System.out.println("digite a altura da primeira pessoa :");
		altura1 = sc.nextDouble();  
		System.out.println("digite a altura da segun : ");
		altura2 = sc.nextDouble();
		alturamedia = ((altura1 + altura2) /2);
		System.out.println(" a media das alturas é : " + alturamedia);
		
		
		
		

	
	}
}
