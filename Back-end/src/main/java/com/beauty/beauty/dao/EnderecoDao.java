package com.beauty.beauty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beauty.beauty.model.Endereco;




@Repository
public interface EnderecoDao extends JpaRepository<Endereco, Long>{

}
