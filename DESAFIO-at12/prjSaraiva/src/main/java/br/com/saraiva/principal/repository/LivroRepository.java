package br.com.saraiva.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.saraiva.principal.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro,Long> {
	

}