package com.idat.idatSindyQuispe.service;

import java.util.List;

import com.idat.idatSindyQuispe.dto.ClienteRequestDTO;
import com.idat.idatSindyQuispe.dto.ClienteResponseDTO;

public interface ClienteService {
	public void guardarCliente(ClienteRequestDTO c);
	public void eliminarCliente(Integer id);
	public void editarCliente(ClienteRequestDTO c);
	public List<ClienteResponseDTO> listarCliente();
	public ClienteResponseDTO clienteById(Integer id);

}
