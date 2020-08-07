package com.matheusborba.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusborba.demo.model.Cliente;


@Repository
public interface ClienteDao extends JpaRepository<Cliente, Long>{

}
