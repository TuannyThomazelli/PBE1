package com.senaidev.clienteOperadora.Entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "tb_telefone")
public class Telefone {

	//atributo
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id_telefone;
		
 @Column(name = "ddd")
 private String ddd;
		
 @Column(name = "numero_telefone")
 private int numero;
		
 @Column(name = "tipo")
 private String tipo;
 
 @Column(name = "operadora")
 private String operadora;

 @ManyToOne
 @JoinColumn(name = "CLIENTE_id_cliente")
 private Cliente cliente;
	
 //construtores 
 public Telefone() {

 
}
 public Telefone(Long id_telefone, String ddd, int numero, String tipo, String operadora) {
	 this.id_telefone=id_telefone;
	 this.ddd=ddd;
	 this.numero=numero;
	 this.tipo=tipo;
	 this.operadora=operadora;
	 }
public Long getId_telefone() {
	return id_telefone;
}
public void setId_telefone(Long id_telefone) {
	this.id_telefone = id_telefone;
}
public String getDdd() {
	return ddd;
}
public void setDdd(String ddd) {
	this.ddd = ddd;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getOperadora() {
	return operadora;
}
public void setOperadora(String operadora) {
	this.operadora = operadora;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
 
 
 }

