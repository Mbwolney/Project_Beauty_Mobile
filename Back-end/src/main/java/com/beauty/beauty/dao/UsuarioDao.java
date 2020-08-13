package com.beauty.beauty.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beauty.beauty.model.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long> {

	/*
	 * Search user by email
	 * 
	 * @param email
	 * 
	 * @return
	 */
	Optional<Usuario> findByEmail(String email);
}
