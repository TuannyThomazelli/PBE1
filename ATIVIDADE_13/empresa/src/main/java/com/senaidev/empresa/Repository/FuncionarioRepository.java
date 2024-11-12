package com.senaidev.empresa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.empresa.Entities.Funcionario;

public interface FuncionarioRepository  extends JpaRepository<Funcionario,Long>{

}
