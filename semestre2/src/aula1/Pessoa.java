package produto;

	public class Pessoa {

		public String nome;

		public int idade;

		private void nomear(String nomes) {

			nomes = nome;

		}

		 private void darIdade(double idades) {
			
			if (idade >= 0) {
				
				idades = idade;
				
			}
			else {
				
				System.out.println("Idade inválida");
			}
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		

	}



