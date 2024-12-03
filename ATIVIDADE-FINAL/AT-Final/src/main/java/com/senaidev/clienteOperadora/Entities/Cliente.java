package com.senaidev.clienteOperadora.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
//atributo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
			
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
			
	@Column(name = "dt_nascimento", nullable = false, length = 10 )
	private String dt_nascimento;
			
	@Column(name = "cpf", nullable = false, length = 11)
	private String cpf;
			
	@Column(name = "email", nullable = false, length = 100 )
	private String email;
	
	//construtores 
	
	public Cliente() {
		
	}
	public Cliente(Long id_cliente, String nome,String dt_nascimento, String cpf, String email) {
      this.id_cliente=id_cliente;
      this.nome=nome;
      this.dt_nascimento=dt_nascimento;
      this.cpf=cpf;
      this.email=email;
}
	
	// Getters e setters 
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
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getRg() {
		return cpf;
	}
	public void setRg(String rg) {
		this.cpf = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
