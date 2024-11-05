package br.com.saraiva.principal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.saraiva.principal.LivroService;
import br.com.saraiva.principal.entities.Livro;


@RestController
@RequestMapping("/LivroController")
public class LivroControllers {

	@Autowired
	private LivroService LivroService;

	@PostMapping
	public Livro createLivro(@RequestBody Livro livro) {
		return LivroService.saveLivro(livro);
	}

	@GetMapping
	public List<Livro> getAllLivro() {
		return LivroService.getAllLivro();
	}

	@GetMapping("/{id}")
	public Livro getLivro(@PathVariable Long id) {
		return LivroService.getLivroById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteLivro(@PathVariable Long id) {
		LivroService.deleteLivro(id);
	}
}
