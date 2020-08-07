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

import com.matheusborba.demo.dao.ServicoDao;
import com.matheusborba.demo.model.Servico;


@RestController
@RequestMapping("/servico")
public class ServicoRest {
	
	@Autowired
	private ServicoDao servicoDao;
	
	@PostMapping
	public void post(@RequestBody Servico servico) {
		servicoDao.save(servico);
	}
	
	@GetMapping
	public List<Servico> get(Principal principal) {
		System.out.println(principal.getName());
		return servicoDao.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		servicoDao.deleteById(id);
	}
}
