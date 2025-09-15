package infranet;

import java.util.Scanner;

public class Infranet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, bem-vindo à Infra Net\n");
		System.out.print("Para começarmos, digite seu salário: ");

		double sal = sc.nextDouble();// O salário do usuário.
		sc.nextLine(); // IMPORTANTE: Faz com que o usuário possa digitar os valores SIM / NÃO no
						// código. Sem eles não será possível por conta do armazenamento / buffer do
						// Java.
		double inss = 0, ir = 0, descontoTotal;// Onde armazenaremos o valor da porcentagem dos impostos.

		double vt = 0, va = 0, vr = 0, planoSaude = 0;

		if (sal <= 1302) {
			inss = 8;// O valor do inss.
		}

		else if (sal <= 1903.99) {
			inss = 9;
			ir = 7.5;// O valor do imposto de renda(IR).
		}

		else if (sal <= 2826.65) {
			inss = 11;
			ir = 7.5;
		}

		else if (sal <= 3751.06) {
			inss = 11;
			ir = 15;
		}

		else if (sal <= 3856.01) {
			inss = 11;
			ir = 22.5;
		}

		else if (sal <= 4664.68) {
			inss = 14;
			ir = 22.5;
		}

		else if (sal <= 7087.22) {
			inss = 14;
			ir = 27.5;
		}

		else {
			inss = 570.88;
			ir = 27.5;
		}

		if (sal > 7087.22) {
			descontoTotal = (sal * ir / 100) + inss;
		}

		else {
			descontoTotal = sal * (inss + ir) / 100;
		}

		double salarioLiquido = sal - descontoTotal;

		System.out.printf("\nO valor do seu salário líquido é: R$ %.2f\n", salarioLiquido); // Resultado gerado
																							// referente ao salário
																							// líquido.
		System.out.println("O valor do desconto foi de:\n"); // Resultado gerado referente ao desconto

		if (sal > 7087.22) {
			System.out.println(" INSS: R$ 570,88"); // o if else serve para valores maiores que 7098,22 pois a partir
													// desse valor o inss passa a ser uma taxa única (570,88)
		} else {
			System.out.printf(" INSS: R$ %.2f\n", sal * inss / 100);
		}

		System.out.printf(" IR: R$ %.2f\n", sal * ir / 100);

		while (true) // faz um loop INFINITO.

		// VALE TRANSPORTE
		{
			double descontovt = sal * 6 / 100;

			System.out.println("Você utiliza o Vale Transporte? (Sim / Não)");

			String respostavt = sc.nextLine().trim(); // O .trim faz com que o Scanner leia a linha mesmo contendo
														// espaços, como invés de"Sim", " Sim", ou "Sim "

			if (respostavt.equalsIgnoreCase("sim") || respostavt.toLowerCase().startsWith("s")) {
				vt = sal * 6 / 100;
				System.out.printf("\n O desconto do Vale Transporte(6%%) será de R$: %.2f\n", vt);

			} else if (respostavt.equalsIgnoreCase("não") || respostavt.toLowerCase().startsWith("n")) // O
																										// .equalsIgnoreCase
																										// faz com que o
																										// código não
																										// seja sensível
																										// à letras
																										// maiúsculas ou
																										// minúsculas,
																										// já o
																										// .toLowerCase
																										// faz com que o
																										// código seja
																										// transformado
																										// em minúsculo
																										// na
																										// transcrição
																										// do mesmo para
																										// o Eclipse.
			{
				System.out.println("\n Você está isento de descontos no Vale Transporte.");

			} else {
				System.out.println("\nDigite Sim ou Não\n");

				continue;
			}
			// VALE ALIMENTAÇÃO
			double descontova = 200;
			System.out.println("\nVocê utiliza o Vale Alimentação? (digite - Sim / Não)");

			String respostava = sc.nextLine().trim();

			if (respostava.equalsIgnoreCase("sim") || respostava.toLowerCase().startsWith("s")) {

				System.out.printf("\n O desconto do Vale Alimentação será de R$: %.2f", descontova);

			} else if (respostava.equalsIgnoreCase("não") || respostava.toLowerCase().startsWith("n")) {
				System.out.println("\n Você está isento de descontos no Vale Alimentação");

			} else {
				System.out.println("\nDigite Sim ou Não\n");
				continue;
			}

			// VALE REFEIÇÃO
			double descontovr = 250;
			System.out.println("\nVocê utiliza o Vale Refeição? (digite - Sim / Não)");

			String respostavr = sc.nextLine().trim();

			if (respostavt.equalsIgnoreCase("sim") || respostavr.toLowerCase().startsWith("s")) {

				System.out.printf("\n O desconto do Vale Refeição será de R$: %.2f\n", vr);

			} else if (respostavr.equalsIgnoreCase("não") || respostavr.toLowerCase().startsWith("n")) {
				System.out.println("\n Você está isento de descontos no Vale Refeição");

			} else {
				System.out.println("\nDigite Sim ou Não\n");
				continue;
			}

			// PLANO DE SAUDE
			double saudebasico = 150;
			double saudeavancado = 300;
			System.out.println("\nDigite seu plano de Saúde (digite - Básico / Avançado / Não tenho)");

			String respostasaude = sc.nextLine().trim();

			if (respostasaude.equalsIgnoreCase("básico") || respostasaude.toLowerCase().startsWith("b")) {
				planoSaude = saudebasico;
				System.out.printf("\n O desconto do seu Plano de saúde será de R$: %.2f\n", planoSaude);

			} else if (respostasaude.equalsIgnoreCase("avançado") || respostasaude.toLowerCase().startsWith("a")) {
				planoSaude = saudeavancado;
				System.out.printf("\n O desconto do seu Plano de saúde será de R$: %.2f\n", planoSaude);

			} else if (respostasaude.equalsIgnoreCase("não") || respostasaude.toLowerCase().startsWith("n"))

			{
				System.out.printf("\nVocê está isento do desconto do plano de Saúde");

			}

			else {
				System.out.println("\n Insira seu plano de saúde\n");
			}
			double descontoTotalFinal = descontoTotal + vt + va + vr + planoSaude;

			// Salário final após todos os descontos
			double salarioFinal = salarioLiquido - (vt + va + vr + planoSaude);

			// Exibindo o valor total dos descontos e o salário final
			System.out.printf("\nO valor total dos descontos foi de: R$ %.2f\n", descontoTotalFinal);
			System.out.printf("\nO seu salário final, após todos os descontos, é: R$ %.2f\n", salarioFinal);
			break;
		}

	}

}
