package com.matheusborba.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusborba.demo.model.Servico;

@Repository
public interface ServicoDao extends JpaRepository<Servico, Long> {

}
