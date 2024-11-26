package com.senaidev.bancoLivraria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancoLivraria.Entities.Endereco;
import com.senaidev.bancoLivraria.Repository.EnderecoRepository;


@Service
public class EnderecoService {

	 @Autowired
	    private EnderecoRepository enderecoRepository;

	
	    public List<Endereco> buscarEndereco() {
	        return enderecoRepository.findAll();
	    }

	 
	    public Endereco buscarEnderecoPorId(Long id) {
	        return enderecoRepository.findById(id).orElse(null);
	    }

	    
	    public Endereco criarEndereco(Endereco endereco) {
	        return enderecoRepository.save(endereco);
	    }

	   
	    public void excluirEndereco(Long id) {
	        enderecoRepository.deleteById(id);
	    }
}
