package com.idat.idatSindyQuispe.dto;

public class ClienteResponseDTO {
	private Integer idClienteResponse ;
	private String nombreResponse;
	private String celularResponse;
	
	public Integer getIdClienteResponse() {
		return idClienteResponse;
	}
	public void setIdClienteResponse(Integer idClienteResponse) {
		this.idClienteResponse = idClienteResponse;
	}
	public String getNombreResponse() {
		return nombreResponse;
	}
	public void setNombreResponse(String nombreResponse) {
		this.nombreResponse = nombreResponse;
	}
	public String getCelularResponse() {
		return celularResponse;
	}
	public void setCelularResponse(String celularResponse) {
		this.celularResponse = celularResponse;
	}

}
