package aula2;

import java.util.Scanner;

public class problemapiso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        do {
        	Double a, b, c, d, e;
        	System.out.println("digite a largura do comodo");
        	a = sc.nextDouble();
        	System.out.println("digite o comprimento do comodo");
        	b = sc.nextDouble();
        	System.out.println("digite o valor do metro quadrado do piso");
        	c = sc.nextDouble();
        	d = (a*b);
            System.out.println("a area do comodo é :" + d);
            e = (c*d);
            System.out.println("o custo total é:" + e);
            
        } while (0<=1);
	}

}
