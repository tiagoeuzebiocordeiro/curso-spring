package com.curso.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.api.model.Cliente;
import com.curso.api.repository.ClientesRepository;

@Service
public class ClientesService {

	@Autowired
	private ClientesRepository clientesRepository;
	
	
	public ClientesService(ClientesRepository clientesRepository) {
		this.clientesRepository = clientesRepository;
	}
	
	public void salvarCliente(Cliente cliente) {
		this.clientesRepository.salvarCliente(cliente);
	}
	
}
