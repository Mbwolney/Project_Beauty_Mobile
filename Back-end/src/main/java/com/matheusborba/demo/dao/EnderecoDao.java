package com.matheusborba.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusborba.demo.model.Endereco;


@Repository
public interface EnderecoDao extends JpaRepository<Endereco, Long>{

}
