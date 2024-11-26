package com.senaidev.bancoLivraria.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.senaidev.bancoLivraria.Entities.Livro;

import com.senaidev.bancoLivraria.Service.LivroService;

public class LivroControllers {

	 @Autowired
	    private LivroService livroService;

	    @GetMapping
	    public List<Livro> buscarLivro() {
	        return livroService.buscarLivro();
	    }

	   @GetMapping("/id")
	   public ResponseEntity<Object>buscarLivroPorId(@PathVariable Long id) {
		   Livro livro = livroService.buscarLivroPorId(id);
		   
		   if (livro != null) {
			   return ResponseEntity.ok(livro);
		   }else {
			   return ResponseEntity.status(404).body("Cliente com ID" + id + "não foi encontrado");
		   }
	   }

	   @GetMapping("/isbn/{isbn}")
	   public Livro buscarLivroPorIsbn(@PathVariable String isbn) {
		   return livroService.buscarLivroPorCpf(isbn);
	   }
}
