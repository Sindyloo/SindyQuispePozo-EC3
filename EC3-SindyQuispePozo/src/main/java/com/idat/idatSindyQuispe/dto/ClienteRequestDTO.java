package com.idat.idatSindyQuispe.dto;

public class ClienteRequestDTO {
	private Integer idClienteRequest ;
	private String nombreRequest;
	private String celularRequest;
	
	public Integer getIdClienteRequest() {
		return idClienteRequest;
	}
	public void setIdClienteRequest(Integer idClienteRequest) {
		this.idClienteRequest = idClienteRequest;
	}
	public String getNombreRequest() {
		return nombreRequest;
	}
	public void setNombreRequest(String nombreRequest) {
		this.nombreRequest = nombreRequest;
	}
	public String getCelularRequest() {
		return celularRequest;
	}
	public void setCelularRequest(String celularRequest) {
		this.celularRequest = celularRequest;
	}
	

}
