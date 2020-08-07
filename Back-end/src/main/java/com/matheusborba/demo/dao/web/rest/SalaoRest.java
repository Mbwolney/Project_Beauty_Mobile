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

import com.matheusborba.demo.dao.SalaoDao;
import com.matheusborba.demo.model.Salao;


@RestController
@RequestMapping("/salao")
public class SalaoRest {

	@Autowired
	private SalaoDao salaoDao;
	
	@PostMapping
	public void post(@RequestBody Salao salao) {
		salaoDao.save(salao);
	}
	
	@GetMapping
	public List<Salao> get(Principal principal) {
		System.out.println(principal.getName());
		return salaoDao.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		salaoDao.deleteById(id);
	}
}
