package aula1;

import java.util.Scanner;

public class MEDIA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bom dia");
		Scanner sc = new Scanner  (System.in);
		do {
			double x, y, c, media;
		    System.out.println("digite o primeiro numero");
		    x = sc.nextDouble ();
		    System.out.println("digite o segundo numero");
		    y = sc.nextDouble();
		    System.out.println("digite o terceiro numero");
			c = sc.nextDouble();
		    media = (x + y + c) / 3.0;
		    System.out.println("Media = " + media);
		
		}while (0<=1);
	}

}
