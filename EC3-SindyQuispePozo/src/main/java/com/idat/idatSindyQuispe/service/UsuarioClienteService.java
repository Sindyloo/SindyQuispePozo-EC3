package com.idat.idatSindyQuispe.service;

import java.util.List;

import com.idat.idatSindyQuispe.dto.UsuarioClienteRequestDTO;
import com.idat.idatSindyQuispe.dto.UsuarioClienteResponseDTO;

public interface UsuarioClienteService {
	public void guardarUsuarioCliente(UsuarioClienteRequestDTO u);
	public void eliminarUsuarioCliente(Integer id);
	public void editarUsuarioCliente(UsuarioClienteRequestDTO u);
	public List<UsuarioClienteResponseDTO> listarUsuarioCliente();
	public UsuarioClienteResponseDTO usuarioClienteById(Integer id);
}
