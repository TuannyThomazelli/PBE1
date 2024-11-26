package com.senaidev.bancoLivraria.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_editora")
public class Editora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_editora;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "cnpj", nullable = false, length = 14, unique = true)
	private String cnpj;

	@Column(name = "email", nullable = false, length = 100)
	private String email;

	@Column(name = "nome_contato", nullable = false, length = 100)
	private String nome_contato;
	
	@Column(name = "telefone_contato", nullable = false,length = 13)
	private String telefone_contato;
	
	//construtores 
	
	public Editora() {
		
	}
	public Editora( Long id_editora, String nome, String cnpj, String email,String nome_contato, String telefone_contato) {
		this.id_editora=id_editora;
		this.nome=nome;
		this.cnpj=cnpj;
		this.email=email;
		this.nome_contato=nome_contato;
		this.telefone_contato=telefone_contato;
	}
	
	//getters e setters 
	public Long getId_editora() {
		return id_editora;
	}
	public void setId_editora(Long id_editora) {
		this.id_editora = id_editora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome_contato() {
		return nome_contato;
	}
	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}
	public String getTelefone_contato() {
		return telefone_contato;
	}
	public void setTelefone_contato(String telefone_contato) {
		this.telefone_contato = telefone_contato;
	}
	
}
