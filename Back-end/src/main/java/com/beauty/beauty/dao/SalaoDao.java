package com.beauty.beauty.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beauty.beauty.model.Salao;

@Repository
public interface SalaoDao extends JpaRepository<Salao, Long> {

	/**
	 * Search by CNPJ
	 * 
	 * @param cnpj
	 * @return
	 */
	Optional<Salao> findByCnpj(String cnpj);

}
