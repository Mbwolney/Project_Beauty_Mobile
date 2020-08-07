package com.matheusborba.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusborba.demo.model.Funcionario;

@Repository
public interface FuncionarioDao extends JpaRepository<Funcionario, Long> {

}
