package com.senaidev.bancoLivraria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.senaidev.bancoLivraria.Entities.Autor;
import com.senaidev.bancoLivraria.Repository.AutorRepository;


public class AutorService {

	 @Autowired
	    private AutorRepository autorRepository;

	    // Listar todos os endereços
	    public List<Autor> buscarAutor() {
	        return autorRepository.findAll();
	    }

	    // Buscar endereço por ID
	    public Autor buscarAutorPorId(Long id) {
	        return autorRepository.findById(id).orElse(null);
	    }

	    // Salvar endereço
	    public Autor criarAutor(Autor autor) {
	        return autorRepository.save(autor);
	    }

	    // Deletar endereço
	    public void excluirAutor(Long id) {
	        autorRepository.deleteById(id);
}
}
