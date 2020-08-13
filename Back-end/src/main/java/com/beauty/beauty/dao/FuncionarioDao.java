package com.beauty.beauty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beauty.beauty.model.Funcionario;



@Repository
public interface FuncionarioDao extends JpaRepository<Funcionario, Long> {

}
