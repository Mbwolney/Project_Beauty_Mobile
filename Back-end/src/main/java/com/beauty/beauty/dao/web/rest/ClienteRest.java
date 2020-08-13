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

import com.beauty.beauty.dao.ClienteDao;
import com.beauty.beauty.model.Cliente;


@RestController
@RequestMapping("/cliente")
public class ClienteRest {

	@Autowired
	private ClienteDao clienteDao;
	
	@PostMapping
	public void post(@RequestBody Cliente cliente) {
		clienteDao.save(cliente);
	}
	
	@GetMapping
	public List<Cliente> get(Principal principal) {
		System.out.println(principal.getName());
		return clienteDao.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		clienteDao.deleteById(id);
	}
	
}
