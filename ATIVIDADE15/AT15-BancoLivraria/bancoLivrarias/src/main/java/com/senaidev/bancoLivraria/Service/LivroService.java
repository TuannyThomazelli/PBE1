package com.senaidev.bancoLivraria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senaidev.bancoLivraria.Entities.Livro;

import com.senaidev.bancoLivraria.Repository.LivroRepository;

@Service
public class LivroService {
	@Autowired
    private LivroRepository livroRepository;

	public List<Livro> buscarLivro() {
        return livroRepository.findAll();
    }
	 public Livro buscarLivroPorId(Long id) {
	        return livroRepository.findById(id).orElse(null);
	    }
	 public Livro buscarLivroPorCpf(String isbn) {
	    	return livroRepository.findByisbn(isbn);
	    }
	 public Livro criarLivro(Livro livro) {
	        return livroRepository.save(livro);
	    }
	 public void excluirLivro(Long id) {
	        livroRepository.deleteById(id);
	    }
}
