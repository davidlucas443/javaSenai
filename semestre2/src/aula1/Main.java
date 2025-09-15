package produto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Olá, bem-vindo a nossa loja tec");

		System.out.println("O que você deseja comprar :");

		Produto prod = new Produto(null, 100);

		System.out.println("Teclado, Mouse, Mouse pad, Fone, Microfone ou Monitor");
		prod.setNome(sc.next());

		System.out.println("Hoje estamos com um cupom de 5% de desconto no seu " + prod.getNome() + " , onde ele custava "
				+ prod.getPreco() + " reais e passou a custar " + prod.getAplicarDesconto());

	}

}
