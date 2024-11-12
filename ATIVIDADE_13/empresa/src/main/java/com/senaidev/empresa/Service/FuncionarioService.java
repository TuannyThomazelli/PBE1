package com.senaidev.empresa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.senaidev.empresa.Entities.Funcionario;
import com.senaidev.empresa.Repository.FuncionarioRepository;


public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Funcionario saveFuncionario (Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
		
	}
	public List<Funcionario> getAllFuncionario(){
		return funcionarioRepository.findAll();
	}

	public Funcionario getFuncionarioById(Long id) {
		return funcionarioRepository.findById(id).orElse(null);
	} 
	
	public void deleteFuncionario(Long id) {
		funcionarioRepository.deleteById(id);
	}
}
