package exercício4;

public class Personagem {
	
	public String nome;
	
	public String classe;
	
	public int nivel;
	
	public int vida;

	public Personagem(String nome, String classe, int nivel, int vida) {
		super();
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel;
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("Nome adicionado");
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		
		System.out.println("Classe adicionado");
		
		this.classe = classe;
		
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		if (nivel >=1) {
			
			System.out.println("Nivel adicionado");
		}
		
		else {
			
			System.out.println("Nível inválido");
		}
		this.nivel = nivel;
	}

	public int getVida() {
		this.vida = vida;
		
		return vida;
	}

	public void setVida(int vida) {
		if ( vida >0 && vida <=100) {
			
			System.out.println("Vida adicionada");
		}
		
		else {
			
			System.out.println("Vida inválida");
		}
		
	}
	
	
	
	

}
