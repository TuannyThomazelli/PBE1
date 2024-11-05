package br.com.saraiva.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.saraiva.principal.entities.Livro;
import br.com.saraiva.principal.repository.LivroRepository;



@Service
public class LivroService {

	@Autowired

	private LivroRepository livroRepository;

	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	public List<Livro> getAllLivro() {
		return livroRepository.findAll();
	}

	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);
	}

	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);

	}
}
