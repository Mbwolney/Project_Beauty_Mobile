package com.beauty.beauty.dao.web.rest;

import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beauty.beauty.dao.SalaoDao;
import com.beauty.beauty.dao.UsuarioDao;
import com.beauty.beauty.model.Salao;
import com.beauty.beauty.model.Usuario;
import com.beauty.beauty.model.enums.PerfilEnum;
import com.beauty.beauty.response.Response;

@RestController
@RequestMapping("/salao")
@CrossOrigin(origins = "*")
public class SalaoRest {

	@Autowired
	private SalaoDao salaoDao;

	@Autowired
	private UsuarioDao usuarioDao;

	/**
	 * Salão registration
	 * 
	 * @param id
	 * @param salao
	 * @param result
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	@PostMapping("/cadastro/{id}")
	public ResponseEntity<Response<Salao>> cadastrar(@PathVariable(name = "id") Long id,
			@Valid @RequestBody Salao salao, BindingResult result) throws NoSuchAlgorithmException {
		Response<Salao> response = new Response<Salao>();
		validarSalaoExistente(salao, result);
		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		Usuario usuario = new Usuario();
		usuario = usuarioDao.findById(id).get();
		usuario.setPerfilEnum(PerfilEnum.ROLE_ADMIN);
		usuario.getSalao().add(salao);
		salaoDao.save(salao);
		usuarioDao.save(usuario);
		return ResponseEntity.ok(response);
	}

	// @GetMapping
	// public List<Salao> get(Principal principal) {
	// System.out.println(principal.getName());
	// return salaoDao.findAll();
	// ß}

	// @DeleteMapping("/{id}")
	// public void delete(@PathVariable("id") Long id) {
	// salaoDao.deleteById(id);
	// }

	/**
	 * Salão verification
	 * 
	 * @param salao
	 * @param result
	 */
	private void validarSalaoExistente(Salao salao, BindingResult result) {
		this.salaoDao.findByCnpj(salao.getCnpj())
				.ifPresent(sal -> result.addError(new ObjectError("salao", "Salão já existente")));
	}
}
