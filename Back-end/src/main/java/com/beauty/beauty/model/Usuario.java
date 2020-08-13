package com.beauty.beauty.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.beauty.beauty.model.enums.PerfilEnum;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String rua;	
	private String cep;
	private String bairro;
	private Integer numero;
	private String cidade;
	private String estado;
	private String senha;
	private String email; 
	
	@Enumerated(EnumType.STRING)
	private PerfilEnum perfilEnum;
	
	@ManyToMany
	@JoinTable(name = "usuario_salao", joinColumns = @JoinColumn(
			name = "Usuario_id"), inverseJoinColumns = @JoinColumn(name = "Salao_id"))
	private List<Salao> salao;
	
	// Getter e Setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public PerfilEnum getPerfilEnum() {
		return perfilEnum;
	}
	public void setPerfilEnum(PerfilEnum perfilEnum) {
		this.perfilEnum = perfilEnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Salao> getSalao() {
		return salao;
	}
	public void setSalao(List<Salao> salao) {
		this.salao = salao;
	}
}
