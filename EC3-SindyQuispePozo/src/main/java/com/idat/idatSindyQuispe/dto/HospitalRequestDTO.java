package com.idat.idatSindyQuispe.dto;

public class HospitalRequestDTO {
	private Integer idHospitalRequest;
	private String nombreRequest;
	private String descripcionRequest;
	private String distritoRequest;
	
	public Integer getIdHospitalRequest() {
		return idHospitalRequest;
	}
	public void setIdHospitalRequest(Integer idHospitalRequest) {
		this.idHospitalRequest = idHospitalRequest;
	}
	public String getNombreRequest() {
		return nombreRequest;
	}
	public void setNombreRequest(String nombreRequest) {
		this.nombreRequest = nombreRequest;
	}
	public String getDescripcionRequest() {
		return descripcionRequest;
	}
	public void setDescripcionRequest(String descripcionRequest) {
		this.descripcionRequest = descripcionRequest;
	}
	public String getDistritoRequest() {
		return distritoRequest;
	}
	public void setDistritoRequest(String distritoRequest) {
		this.distritoRequest = distritoRequest;
	}

}
