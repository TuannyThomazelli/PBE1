package prjCaneta;

public class Livro {
	
	String livro;
	String autor;
	boolean alugado;
	
	public Livro (String livro, String autor) {
		this.livro = livro;
		this.autor = autor;	
		this.alugado = false;
	}
	
	 void status() {
		System.out.println("livro: "this.livro );
		System.out.println( "autor: " this.autor);
		
	}
	void status() {
		System.out.println(this.livro + ": " + (this.autor ? "Alugado":"Disponível"));
	}
	void alugar() {
		this.alugado = true;

	}
	void alugado() {
		this.alugado = false;
	}
}


