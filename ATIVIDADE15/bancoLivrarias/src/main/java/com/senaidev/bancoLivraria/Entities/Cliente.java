package com.senaidev.bancoLivraria.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;

	@Column(name = "email", nullable = false, length = 100, unique= true)
	private String email;

	@Column(name = "rg", nullable = false, length = 9, unique = true)
	private String rg;
	
	@Column(name = "telefone", length = 13, unique= true)
	private String telefone;
	
	//contrutores
	public Cliente(){
		
	}
	public Cliente(Long id_cliente, String nome, String cpf, String email, String rg, String telefone) {
		this.id_cliente= id_cliente;
		this.nome=nome;
		this.cpf=cpf;
		this.email=email;
		this.rg=rg;
		this.telefone=telefone;
	}
	
	//getters e setters 
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	
}
