package com.senaidev.bancoLivraria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.bancoLivraria.Entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
