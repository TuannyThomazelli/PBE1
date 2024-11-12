package com.senaidev.empresa.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class Departamento {

	//atributos 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_Departamento;

	@Column(name = "nome_departamento")
	private String nome_departamento;
	@Column(name = "local")
	private String local;
	
	//construtores 
	
	public Departamento() {
		
	}
	public Departamento (long id_Departamento, String nome_departamento, String local) {
		this.id_Departamento = id_Departamento;
		this.nome_departamento = nome_departamento;
		this.local = local;
	}
	
	//getters e setters 
	public long getId_Departamento() {
		return id_Departamento;
	}
	public void setId_Departamento(long id_Departamento) {
		this.id_Departamento = id_Departamento;
	}
	public String getNome_departamento() {
		return nome_departamento;
	}
	public void setNome_departamento(String nome_departamento) {
		this.nome_departamento = nome_departamento;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	

}
