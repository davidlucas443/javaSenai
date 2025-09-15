package aula3;

import java.util.Scanner;

public class questaoD {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double litros, velocidade, distancia, tempo, litrosUsados;
		
		System.out.println("qual o tempo gasto na viagem ?");
		tempo = sc.nextDouble();
		
		System.out.println("qual a velocidade media ?");
		velocidade = sc.nextDouble();
	
		distancia = (tempo*velocidade);
		
		System.out.println("o tempo gasto foi de:" + tempo);
		
		System.out.println("a distancia é igual:" + distancia);
		
		litrosUsados = (distancia/12);
		
		System.out.println("a quantidade foi :" + litrosUsados);
	}
}
