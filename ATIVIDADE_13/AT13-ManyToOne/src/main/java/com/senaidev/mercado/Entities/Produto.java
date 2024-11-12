package com.senaidev.mercado.Entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

	//atributo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	
	@Column(name = "nome_produto")
	private String nome_produto;
	
	@Column(name = "preco")
	private int preco;

	@ManyToOne
	@JoinColumn(name = "CATEGORIA_id_categoria")
	private Categoria categoria;

	//construtores 
	public Produto () {
		
	}
	public Produto(long id_produto, String nome_produto, int preco) {
		this.id_produto = id_produto;
		this.nome_produto = nome_produto;
		this.preco = preco;
	}
	//getters e setters 
	public Long getId_produto() {
		return id_produto;
	}
	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
