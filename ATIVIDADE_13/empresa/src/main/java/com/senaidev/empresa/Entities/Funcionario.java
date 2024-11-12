package com.senaidev.empresa.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_funcionario")
public class Funcionario {

	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_Funcionario;

	@Column(name = "nome_funcionario")
	private String nome_funcionario;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "email")
	private String email;
	@ManyToOne
	@Column(name = "departamento")
	private Departamento departamento;
	
	//construtores 
	
	public Funcionario() {
		
	}
	public Funcionario(long id_Funcionario, String nome_funcionario, String cpf, String email) {
		this.id_Funcionario= id_Funcionario;
		this.nome_funcionario = nome_funcionario;
		this.cpf = cpf;
		this.email = email;
		
	}
	
	//getters e setters 
	public long getId_Funcionario() {
		return id_Funcionario;
	}
	public void setId_Funcionario(long id_Funcionario) {
		this.id_Funcionario = id_Funcionario;
	}
	public String getNome_funcionario() {
		return nome_funcionario;
	}
	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
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
	
	
	

}
