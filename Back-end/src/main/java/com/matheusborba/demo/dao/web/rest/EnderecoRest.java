package com.matheusborba.demo.dao.web.rest;

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

import com.matheusborba.demo.dao.EnderecoDao;
import com.matheusborba.demo.model.Endereco;



@RestController
@RequestMapping("/endereco")
public class EnderecoRest {
	@Autowired
	private EnderecoDao enderecoDao;
	
	@PostMapping
	public void post(@RequestBody Endereco endereco) {
		enderecoDao.save(endereco);
	}
	
	@GetMapping
	public List<Endereco> get(Principal principal) {
		System.out.println(principal.getName());
		return enderecoDao.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		enderecoDao.deleteById(id);
	}
	
}
