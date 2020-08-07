package com.matheusborba.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusborba.demo.model.Contato;

@Repository
public interface ContatoDao extends JpaRepository<Contato, Long>{

}
