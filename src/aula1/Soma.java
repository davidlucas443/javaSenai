package aula1;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner  (System.in);
    int a, b, adicao;
    System.out.println("digite o primeiro numero");
    a = sc.nextInt();
    System.out.println("digite o segundo numero");
    b = sc.nextInt();
    adicao = (a / b);
    System.out.println(" a soma dos dois numeros é "+ adicao);
    
	}

}