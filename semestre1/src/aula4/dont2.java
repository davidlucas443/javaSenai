package testemiguel;

import java.util.Scanner;

public class dont2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("digite sua nota objetiva");
		a = sc.nextDouble();
		
		System.out.println("digite a sua nota discursiva");
		b = sc.nextDouble();
		
		System.out.println("sua media objetiva é : " + a/10);
		System.out.println("sua media discursiva é : " + b/2);
		
		
		
	}

}
