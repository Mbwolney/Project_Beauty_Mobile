package com.beauty.beauty.dao.web.rest;

import java.security.NoSuchAlgorithmException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beauty.beauty.dao.UsuarioDao;
import com.beauty.beauty.model.Usuario;
import com.beauty.beauty.model.enums.PerfilEnum;
import com.beauty.beauty.response.Response;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioRest {

	@Autowired
	private UsuarioDao usuarioDao;

	/**
	 * User registration
	 * 
	 * @param usuario
	 * @param result
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	@PostMapping
	public ResponseEntity<Response<Usuario>> cadastrar(@Valid @RequestBody Usuario usuario, BindingResult result)
			throws NoSuchAlgorithmException {
		Response<Usuario> response = new Response<Usuario>();
		validarUsuarioExistente(usuario, result);
		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		//usuario.setSenha(PasswordUtils.gerarBCrypt(usuario.getSenha()));
		usuario.setPerfilEnum(PerfilEnum.ROLE_USUARIO);
		usuarioDao.save(usuario);
		return ResponseEntity.ok(response);
	}

	/**
	 * 
	 * User verification
	 * 
	 * @param usuario
	 * @param result
	 */
	private void validarUsuarioExistente(Usuario usuario, BindingResult result) {
		this.usuarioDao.findByEmail(usuario.getEmail())
				.ifPresent(usu -> result.addError(new ObjectError("usuario", "Usuário já existente")));
	}
}
