package com.beauty.beauty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beauty.beauty.model.Cliente;

@Repository
public interface ClienteDao extends JpaRepository<Cliente, Long> {

}
