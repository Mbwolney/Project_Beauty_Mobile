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

import com.matheusborba.demo.dao.ContatoDao;
import com.matheusborba.demo.model.Contato;

@RestController
@RequestMapping("/contato")
public class ContatoRest {
	@Autowired
	private ContatoDao contatoDao;
	
	@PostMapping
	public void post(@RequestBody Contato contato) {
		contatoDao.save(contato);
	}
	
	@GetMapping
	public List<Contato> get(Principal principal) {
		System.out.println(principal.getName());
		return contatoDao.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		contatoDao.deleteById(id);
	}
}
