package br.com.saraiva.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Livro {
	//Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id_Livro;

		@Column(name = "Descricao")
		private String Descricao;
		
		@Column(name = "ISBN")
		private int ISBN;
		
//Construtores
		public Livro() {
			
		}
		public Livro(long id_Livro, String Descricao, int ISBN) {
			this.id_Livro = id_Livro;
			this.Descricao = Descricao;
			this.ISBN = ISBN;
		}
		public long getId_Livro() {
			return id_Livro;
		}
		public void setId_Livro(long id_Livro) {
			this.id_Livro = id_Livro;
		}
		public String getDescricao() {
			return Descricao;
		}
		public void setDescricao(String descricao) {
			Descricao = descricao;
		}
		public int getISBN() {
			return ISBN;
		}
		public void setISBN(int iSBN) {
			ISBN = iSBN;
		}
		
		

}


