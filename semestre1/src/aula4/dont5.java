package testemiguel;

import java.util.Scanner;

public class dont5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num, cNum;
		int b=0;
		
		
		System.out.println("digite um número");
		num = sc.nextInt();
		cNum = num;
		
		while (b<6) {
			num = ((num+cNum)*2);
			b++;
		System.out.println(num);
		
		}
		

	}

}
