package com.idat.idatSindyQuispe.dto;

public class UsuarioClienteRequestDTO {
	private Integer idUsuarioRequest;
	private String usuarioRequest;
	private String passwordRequest;
	private String rolRequest;
	private Integer idClienteRequest;
	
	public Integer getIdUsuarioRequest() {
		return idUsuarioRequest;
	}
	public void setIdUsuarioRequest(Integer idUsuarioRequest) {
		this.idUsuarioRequest = idUsuarioRequest;
	}
	public String getUsuarioRequest() {
		return usuarioRequest;
	}
	public void setUsuarioRequest(String usuarioRequest) {
		this.usuarioRequest = usuarioRequest;
	}
	public String getPasswordRequest() {
		return passwordRequest;
	}
	public void setPasswordRequest(String passwordRequest) {
		this.passwordRequest = passwordRequest;
	}
	public String getRolRequest() {
		return rolRequest;
	}
	public void setRolRequest(String rolRequest) {
		this.rolRequest = rolRequest;
	}
	public Integer getIdClienteRequest() {
		return idClienteRequest;
	}
	public void setIdClienteRequest(Integer idClienteRequest) {
		this.idClienteRequest = idClienteRequest;
	}

}
