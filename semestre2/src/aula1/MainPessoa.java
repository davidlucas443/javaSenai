package produto;

import java.util.Scanner;

public abstract class MainPessoa {

	public static void main(String[] args) {
         Scanner sc =new Scanner( System.in);
		 
		 Pessoa ps = new Pessoa();
		 
		 System.out.println("Qual seu nome ? ");
		 ps.setNome(sc.next());
		 
		 
		 System.out.println("Qual sua idade ? ");
		 ps.setIdade(sc.nextInt());
		 
		 
		 System.out.print("Olá "+ps.getNome());
		 
		 System.out.println(" você tem "+ps.getIdade()+" anos de idade né ?");
		 

	}

}
