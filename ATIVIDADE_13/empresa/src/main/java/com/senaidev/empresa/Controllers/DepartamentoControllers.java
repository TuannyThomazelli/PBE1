package com.senaidev.empresa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.empresa.Entities.Departamento;
import com.senaidev.empresa.Service.DepartamentoService;


@RestController
@RequestMapping ("/departamento")
public class DepartamentoControllers {

	@Autowired
	private DepartamentoService departamentoService;
	
	@PostMapping
	public Departamento createDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.saveDepartamento(departamento);
	}
	
	@GetMapping
	public List<Departamento> getAllDepartamento(){
		return departamentoService.getAllDepartamento();
	}
	
	@GetMapping("/{id}")
	public Departamento getDepartamento(@PathVariable Long id) {
		return departamentoService.getDepartamentoById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteDepartamento (@PathVariable Long id) {
		departamentoService.deleteDepartamento(id);
	}
}
