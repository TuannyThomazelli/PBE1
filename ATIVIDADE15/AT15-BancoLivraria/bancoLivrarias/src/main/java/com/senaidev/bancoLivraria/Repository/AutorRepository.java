package com.senaidev.bancoLivraria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.bancoLivraria.Entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
