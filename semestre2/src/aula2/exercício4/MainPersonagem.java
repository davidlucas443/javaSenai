package exercício4;

import java.util.Scanner;

public class MainPersonagem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Personagem per = new Personagem(null, null, 0, 0);

		per.setNome("Deivao");
		per.setClasse("Codador");
		per.setNivel(5);
		per.setVida(101);

		System.out.println("O nome do seu personagem é " + per.getNome() + " sua classe é " + per.getClasse()
				+ " seu nível é " + per.getNivel() + " e tem " + per.getVida() + " de vida");

	}

}
