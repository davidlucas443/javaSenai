package exercício3;

public class Livro {
	
	public String titulo;
	
	public String autor;
	
	public int numeroPaginas;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public void numeroPaginas()
	{
		if (numeroPaginas >= 5 ) {
			
			System.out.println("Dados guardados com sucesso ");
			
		}
		
		else {
			
			System.out.println(" Número de paginas Inválido");
		}
		
	}

}
