package com.senaidev.bancoLivraria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancoLivraria.Entities.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
   Cliente findByCpf(String cpf);
}
