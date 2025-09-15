package produto;

public class Produto {

	public String Nome;

	public double preco;
	
	public double aplicarDesconto;

	public double getAplicarDesconto() {
		return preco*0.95;
	}

	public void setAplicarDesconto(double aplicarDesconto) {
		this.aplicarDesconto = aplicarDesconto;
	}

	public Produto(String nome, double preco) {
		
		Nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
