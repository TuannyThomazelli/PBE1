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

import com.senaidev.empresa.Entities.Funcionario;
import com.senaidev.empresa.Service.FuncionarioService;


@RestController
@RequestMapping ("/funcionario")
public class FuncionarioControllers {

	@Autowired
	private FuncionarioService funcionarioService;
	
	@PostMapping
	public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.saveFuncionario(funcionario);
	}
	
	@GetMapping
	public List<Funcionario> getAllFuncionario(){
		return funcionarioService.getAllFuncionario();
	}
	
	@GetMapping("/{id}")
	public Funcionario getFuncionario(@PathVariable Long id) {
		return funcionarioService.getFuncionarioById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteFuncionario (@PathVariable Long id) {
		funcionarioService.deleteFuncionario(id);
	}
}
