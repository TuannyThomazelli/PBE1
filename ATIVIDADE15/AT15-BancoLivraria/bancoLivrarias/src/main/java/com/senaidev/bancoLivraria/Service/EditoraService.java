package com.senaidev.bancoLivraria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.senaidev.bancoLivraria.Entities.Editora;

import com.senaidev.bancoLivraria.Repository.EditoraRepository;

@Service
public class EditoraService {
	@Autowired
    private EditoraRepository editoraRepository;

	public List<Editora> buscarEditora() {
        return editoraRepository.findAll();
    }
	 public Editora buscarEditoraPorId(Long id) {
	        return editoraRepository.findById(id).orElse(null);
	    }
	 public Editora buscarEditoraPorCpf(String cnpj) {
	    	return editoraRepository.findBycnpj(cnpj);
	    }
	 public Editora criarEditora(Editora editora) {
	        return editoraRepository.save(editora);
	    }
	 public void excluirEditora(Long id) {
	        editoraRepository.deleteById(id);
	    }

}
