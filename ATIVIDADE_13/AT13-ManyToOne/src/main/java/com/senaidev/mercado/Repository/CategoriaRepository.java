package com.senaidev.mercado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.mercado.Entities.Categoria;


public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{

}
