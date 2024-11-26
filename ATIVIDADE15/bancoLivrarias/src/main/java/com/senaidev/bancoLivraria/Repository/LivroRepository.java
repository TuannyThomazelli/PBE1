package com.senaidev.bancoLivraria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.bancoLivraria.Entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
 Livro findByisbn(String isbn);
}
