package com.senaidev.cadastroCliente.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastroCliente.Entities.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente,Long>{

}
