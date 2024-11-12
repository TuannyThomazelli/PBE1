package com.senaidev.mercado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.mercado.Entities.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
