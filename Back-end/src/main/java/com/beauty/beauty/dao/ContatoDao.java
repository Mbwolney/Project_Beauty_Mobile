package com.beauty.beauty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beauty.beauty.model.Contato;



@Repository
public interface ContatoDao extends JpaRepository<Contato, Long> {

}
