package com.idat.idatSindyQuispe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.idatSindyQuispe.dto.HospitalRequestDTO;
import com.idat.idatSindyQuispe.dto.HospitalResponseDTO;
import com.idat.idatSindyQuispe.model.Hospital;
import com.idat.idatSindyQuispe.repository.HospitalRepository;

public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository repository;

	@Override
	public void guardarHospital(HospitalRequestDTO c) {
		Hospital Hospital = new Hospital();
		Hospital.setIdHospital(c.getIdHospitalRequest());
		Hospital.setNombre(c.getNombreRequest());
		Hospital.setDescripcion(c.getDescripcionRequest());
		Hospital.setDistrito(c.getDistritoRequest());
		repository.save(Hospital);
		
	}

	@Override
	public void eliminarHospital(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarHospital(HospitalRequestDTO c) {
		Hospital hospital = new Hospital();
		hospital.setIdHospital(c.getIdHospitalRequest());
		hospital.setNombre(c.getNombreRequest());
		hospital.setDescripcion(c.getDescripcionRequest());
		hospital.setDistrito(c.getDistritoRequest());
		repository.saveAndFlush(hospital);
		
	}

	@Override
	public List<HospitalResponseDTO> listarHospital() {
		List<Hospital> hospital = repository.findAll();
		List<HospitalResponseDTO> dto = new ArrayList<HospitalResponseDTO>();
		HospitalResponseDTO hospitalDTO = null;
		
		for(Hospital hospitals : hospital) {
			hospitalDTO = new HospitalResponseDTO();
			hospitalDTO.setIdHospitalResponse(hospitals.getIdHospital());
			hospitalDTO.setNombreResponse(hospitals.getNombre());
			hospitalDTO.setDescripcionResponse(hospitals.getDescripcion());
			hospitalDTO.setDistritoResponse(hospitals.getDistrito());
			dto.add(hospitalDTO);
		}
		return dto;
	}

	@Override
	public HospitalResponseDTO hospitalById(Integer id) {
		Hospital hospital = repository.findById(id).orElse(null);
		HospitalResponseDTO hospitalDTO = new HospitalResponseDTO();
		hospitalDTO = new HospitalResponseDTO();
		hospitalDTO.setIdHospitalResponse(hospital.getIdHospital());
		hospitalDTO.setNombreResponse(hospital.getNombre());
		hospitalDTO.setDescripcionResponse(hospital.getDescripcion());
		hospitalDTO.setDistritoResponse(hospital.getDistrito());
		return hospitalDTO;
	}


}
