package com.idat.idatSindyQuispe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatSindyQuispe.dto.UsuarioClienteRequestDTO;
import com.idat.idatSindyQuispe.dto.UsuarioClienteResponseDTO;
import com.idat.idatSindyQuispe.model.UsuarioCliente;
import com.idat.idatSindyQuispe.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {

	@Autowired
	private UsuarioClienteRepository repository;

	@Override
	public void guardarUsuarioCliente(UsuarioClienteRequestDTO p) {
		UsuarioCliente usuario = new UsuarioCliente();
		usuario.setIdUsuario(p.getIdUsuarioRequest());
		usuario.setUsuario(p.getUsuarioRequest());
		usuario.setPassword(p.getPasswordRequest());
		usuario.setRol(p.getRolRequest());
		repository.save(usuario);

	}

	@Override
	public void eliminarUsuarioCliente(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void editarUsuarioCliente(UsuarioClienteRequestDTO u) {
		UsuarioCliente usuario = new UsuarioCliente();
		usuario.setIdUsuario(u.getIdUsuarioRequest());
		usuario.setUsuario(u.getUsuarioRequest());
		usuario.setPassword(u.getPasswordRequest());
		usuario.setRol(u.getRolRequest());
		repository.saveAndFlush(usuario);

	}

	@Override
	public List<UsuarioClienteResponseDTO> listarUsuarioCliente() {
		List<UsuarioCliente> usuario = repository.findAll();
		List<UsuarioClienteResponseDTO> dto = new ArrayList<UsuarioClienteResponseDTO>();
		UsuarioClienteResponseDTO usuarioDTO = null;

		for (UsuarioCliente usuarios : usuario) {
			usuarioDTO = new UsuarioClienteResponseDTO();
			usuarioDTO.setIdUsuarioResponse(usuarios.getIdUsuario());
			usuarioDTO.setUsuarioResponse(usuarios.getUsuario());
			usuarioDTO.setPasswordResponse(usuarios.getPassword());
			usuarioDTO.setRolResponse(usuarios.getRol());
			dto.add(usuarioDTO);
		}
		return null;
	}

	@Override
	public UsuarioClienteResponseDTO usuarioClienteById(Integer id) {
		UsuarioCliente usuario = repository.findById(id).orElse(null);
		UsuarioClienteResponseDTO usuarioDTO = new UsuarioClienteResponseDTO();
		usuarioDTO = new UsuarioClienteResponseDTO();
		usuarioDTO.setIdUsuarioResponse(usuario.getIdUsuario());
		usuarioDTO.setUsuarioResponse(usuario.getUsuario());
		usuarioDTO.setPasswordResponse(usuario.getPassword());
		usuarioDTO.setRolResponse(usuario.getRol());
		return null;
	}


}
