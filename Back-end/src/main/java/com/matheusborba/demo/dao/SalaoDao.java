package com.matheusborba.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusborba.demo.model.Salao;

@Repository
public interface SalaoDao extends JpaRepository<Salao, Long>{

}
