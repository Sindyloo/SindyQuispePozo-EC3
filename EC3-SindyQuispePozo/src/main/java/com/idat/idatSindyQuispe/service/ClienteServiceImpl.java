package com.idat.idatSindyQuispe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.idatSindyQuispe.dto.ClienteRequestDTO;
import com.idat.idatSindyQuispe.dto.ClienteResponseDTO;
import com.idat.idatSindyQuispe.model.Cliente;
import com.idat.idatSindyQuispe.repository.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;

	@Override
	public void guardarCliente(ClienteRequestDTO c) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(c.getIdClienteRequest());
		cliente.setNombre(c.getNombreRequest());
		cliente.setCelular(c.getCelularRequest());
		repository.save(cliente);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarCliente(ClienteRequestDTO c) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(c.getIdClienteRequest());
		cliente.setNombre(c.getNombreRequest());
		cliente.setCelular(c.getCelularRequest());
		repository.saveAndFlush(cliente);
		
	}

	@Override
	public List<ClienteResponseDTO> listarCliente() {
		List<Cliente> cliente = repository.findAll();
		List<ClienteResponseDTO> dto = new ArrayList<ClienteResponseDTO>();
		ClienteResponseDTO clienteDTO = null;
		
		for(Cliente clientes : cliente) {
			clienteDTO = new ClienteResponseDTO();
			clienteDTO.setIdClienteResponse(clientes.getIdCliente());
			clienteDTO.setNombreResponse(clientes.getNombre());
			clienteDTO.setCelularResponse(clientes.getCelular());
			dto.add(clienteDTO);
		}
		return dto;
	}

	@Override
	public ClienteResponseDTO clienteById(Integer id) {
		Cliente cliente = repository.findById(id).orElse(null);
		ClienteResponseDTO clienteDTO = new ClienteResponseDTO();
		clienteDTO = new ClienteResponseDTO();
		clienteDTO.setIdClienteResponse(cliente.getIdCliente());
		clienteDTO.setNombreResponse(cliente.getNombre());
		clienteDTO.setCelularResponse(cliente.getCelular());
		return clienteDTO;
	}


}
