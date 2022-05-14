package com.idat.idatSindyQuispe.service;

import java.util.List;

import com.idat.idatSindyQuispe.dto.HospitalRequestDTO;
import com.idat.idatSindyQuispe.dto.HospitalResponseDTO;

public interface HospitalService {
	
	public void guardarHospital(HospitalRequestDTO h);
	public void eliminarHospital(Integer id);
	public void editarHospital(HospitalRequestDTO h);
	public List<HospitalResponseDTO> listarHospital();
	public HospitalResponseDTO hospitalById(Integer id);


}
