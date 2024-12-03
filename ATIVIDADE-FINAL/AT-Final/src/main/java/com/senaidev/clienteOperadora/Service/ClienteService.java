package com.senaidev.clienteOperadora.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.clienteOperadora.Entities.Cliente;
import com.senaidev.clienteOperadora.Repository.ClienteRepository;



@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

	public List<Cliente> buscarCliente() {
        return clienteRepository.findAll();
    }
	 public Cliente buscarClientePorId(Long id) {
	        return clienteRepository.findById(id).orElse(null);
	    }
	 public Cliente buscarClientePorCpf(String cpf) {
	    	return clienteRepository.findByCpf(cpf);
	    }
	 public Cliente criarCliente(Cliente cliente) {
	        return clienteRepository.save(cliente);
	    }
	 public void excluirCliente(Long id) {
	        clienteRepository.deleteById(id);
	    }
}
