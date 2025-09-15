package vetor;

public class exerc8 {

	public static void main(String[] args) {

		int vetor[] = { 2, 5, 8, 3, 9 };
		int vetor2[] = { 4, 5, 7, 3, 1 };

		System.out.print("Vetor A : ");
		for (int num : vetor) {
			System.out.print(num + " ");
			
		}
		System.out.print("\nVetor B : ");
		for (int num : vetor2) {
			System.out.print(num +" ");
		}

		for (int i = 0; i < vetor2.length; i++) {

			if (vetor[i] == vetor2[i]) {
				System.out.println("\nPosição " + i + " : " + vetor[i]);
			}

		}
	}
}
