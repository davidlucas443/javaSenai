package exercício3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Livro bibli = new Livro();

		System.out.println("Qual o título do livro escolhido ?");
		
		bibli.setTitulo(sc.nextLine());

		System.out.println("Qual o autor do livro ? ");
		bibli.setAutor (sc.nextLine());
		
		
		while (bibli.getNumeroPaginas() < 5) {
			

		System.out.println("Qual o número de paginas ? ");
		bibli.setNumeroPaginas(sc.nextInt());
		{

			if (bibli.getNumeroPaginas() >= 5) {

				System.out.println("Dados guardados com sucesso ");

			}

			else {

				System.out.println("Número de paginas Inválido");
				
				
			}
			
		}

		}

	}

}
