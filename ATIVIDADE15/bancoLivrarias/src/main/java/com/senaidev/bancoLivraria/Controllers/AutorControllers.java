package com.senaidev.bancoLivraria.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senaidev.bancoLivraria.Entities.Autor;

import com.senaidev.bancoLivraria.Service.AutorService;


public class AutorControllers {
	@Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> buscarAutor() {
        return autorService.buscarAutor();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> buscarAutorPorId(@PathVariable Long id) {
        Autor autor = autorService.buscarAutorPorId(id);
		
		if (autor != null) {
			return ResponseEntity.ok(autor);
		} else {
			return ResponseEntity.notFound().build();
		}	
    }
    
    @PostMapping
    public Autor criarAutor(@RequestBody Autor autor) {
        return autorService.criarAutor(autor);
    }

    @DeleteMapping("/{id}")
    public void excluirAutor(@PathVariable Long id) {
        autorService.excluirAutor(id);
    }
}
