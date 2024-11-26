package com.senaidev.bancoLivraria.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.bancoLivraria.Entities.Cliente;
import com.senaidev.bancoLivraria.Service.ClienteService;



@RestController
@RequestMapping("/clientes")
public class ClienteControllers {

	 @Autowired
	    private ClienteService clienteService;

	    @GetMapping
	    public List<Cliente> buscarClientes() {
	        return clienteService.buscarCliente();
	    }

	   @GetMapping("/id")
	   public ResponseEntity<Object>buscarClientePorId(@PathVariable Long id) {
		   Cliente cliente = clienteService.buscarClientePorId(id);
		   
		   if (cliente != null) {
			   return ResponseEntity.ok(cliente);
		   }else {
			   return ResponseEntity.status(404).body("Cliente com ID" + id + "não foi encontrado");
		   }
	   }

	   @GetMapping("/cpf/{cpf}")
	   public Cliente buscarClientePorCpf(@PathVariable String cpf) {
		   return clienteService.buscarClientePorCpf(cpf);
	   }
}
