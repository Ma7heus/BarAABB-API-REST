package com.br.projetointegrador.baraabbAPI.DTO;

import jakarta.validation.constraints.NotNull;

public class UsuarioDTO extends AbstractDTO {
	
	private Long idUsuario;
	
	@NotNull(message = "Senha é obrigatória")
	private String senha;
	
	@NotNull(message = "email é obrigatório")
	private String email;
	
	@NotNull(message = "Login é obrigatório")
	private String login;
	
	@NotNull(message = "Tipo usuario é obrigatório")
	private TipoUsuarioDTO tipoUsuario;

	@Override
	public Long getId() {
		return idUsuario;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public TipoUsuarioDTO getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioDTO tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
