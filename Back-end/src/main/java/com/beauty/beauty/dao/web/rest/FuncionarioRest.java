package com.beauty.beauty.dao.web.rest;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beauty.beauty.dao.FuncionarioDao;
import com.beauty.beauty.model.Funcionario;



@RestController
@RequestMapping("/funcionario")
public class FuncionarioRest {
	
	@Autowired
	private FuncionarioDao funcionarioDao;
	
	@PostMapping
	public void post(@RequestBody Funcionario funcionario) {
		funcionarioDao.save(funcionario);
	}
	
	@GetMapping
	public List<Funcionario> get(Principal principal) {
		System.out.println(principal.getName());
		return funcionarioDao.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		funcionarioDao.deleteById(id);
	}

}
