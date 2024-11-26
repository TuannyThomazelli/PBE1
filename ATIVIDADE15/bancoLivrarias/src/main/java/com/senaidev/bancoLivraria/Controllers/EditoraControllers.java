package com.senaidev.bancoLivraria.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.senaidev.bancoLivraria.Entities.Editora;

import com.senaidev.bancoLivraria.Service.EditoraService;

public class EditoraControllers {

	 @Autowired
	    private EditoraService editoraService;

	    @GetMapping
	    public List<Editora> buscarEditora() {
	        return editoraService.buscarEditora();
	    }

	   @GetMapping("/id")
	   public ResponseEntity<Object>buscarEditoraPorId(@PathVariable Long id) {
		   Editora editora = editoraService.buscarEditoraPorId(id);
		   
		   if (editora != null) {
			   return ResponseEntity.ok(editora);
		   }else {
			   return ResponseEntity.status(404).body("Editora com ID" + id + "não foi encontrado");
		   }
	   }

	   @GetMapping("/cnpj/{cnpj}")
	   public Editora buscarEditoraPorCnpj(@PathVariable String cnpj) {
		   return editoraService.buscarEditoraPorCpf(cnpj);
	   }
}
