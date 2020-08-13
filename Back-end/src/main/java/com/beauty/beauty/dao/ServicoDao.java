package com.beauty.beauty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beauty.beauty.model.Servico;



@Repository
public interface ServicoDao extends JpaRepository<Servico, Long> {

}
