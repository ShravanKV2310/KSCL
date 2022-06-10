package com.ksl.client.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksl.client.entities.Client;
import com.ksl.client.repositories.ClientRepository;


@RestController
public class ClientRestController {
	
	@Autowired
	private ClientRepository clientRepo;
	
	@RequestMapping("/searchClient/{id}")
	public Client searchClient(@PathVariable("id") Long id) {
		Optional<Client> findById = clientRepo.findById(id);
		Client client = findById.get();
		return client;
	}
}
