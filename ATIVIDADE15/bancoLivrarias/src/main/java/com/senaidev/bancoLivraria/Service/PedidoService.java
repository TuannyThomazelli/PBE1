package com.senaidev.bancoLivraria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancoLivraria.Entities.Pedido;
import com.senaidev.bancoLivraria.Repository.PedidoRepository;


@Service
public class PedidoService {

	 @Autowired
	    private PedidoRepository pedidoRepository;

	    // Listar todos os endereços
	    public List<Pedido> buscarPedido() {
	        return pedidoRepository.findAll();
	    }

	    // Buscar endereço por ID
	    public Pedido buscarPedidoPorId(Long id) {
	        return pedidoRepository.findById(id).orElse(null);
	    }

	    // Salvar endereço
	    public Pedido criarPedido(Pedido pedido) {
	        return pedidoRepository.save(pedido);
	    }

	    // Deletar endereço
	    public void excluirPedido(Long id) {
	        pedidoRepository.deleteById(id);
}
}