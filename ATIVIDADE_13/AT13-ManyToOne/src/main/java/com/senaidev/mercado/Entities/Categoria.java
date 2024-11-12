package com.senaidev.mercado.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_categoria;
	
	@Column(name = "nome_categoria")
	private String nome_categoria;
	
	
	
	//construtores
	public Categoria () {
		
	}
	public Categoria(long id_categoria, String nome_categoria) {
		this.id_categoria = id_categoria;
		this.nome_categoria = nome_categoria;
	}
	//Getters e setters 
	public Long getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNome_categoria() {
		return nome_categoria;
	}
	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}
	
	
}
