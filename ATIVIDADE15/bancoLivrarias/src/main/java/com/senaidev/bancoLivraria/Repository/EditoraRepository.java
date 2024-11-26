package com.senaidev.bancoLivraria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.bancoLivraria.Entities.Editora;

public interface EditoraRepository  extends JpaRepository<Editora, Long>{
  Editora findBycnpj(String cnpj);
}
