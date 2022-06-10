package com.ksl.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksl.client.entities.Client;
import com.ksl.client.exceptionhandler.DuplicateEntry;
import com.ksl.client.repositories.ClientRepository;
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepo;
	
	@Override
	public void saveClientDetails(Client client) {
		try {
			clientRepo.save(client);
		} catch (Exception e) {
			throw new DuplicateEntry();
		}
	}

	@Override
	public List<Client> getAllClients() {
		List<Client> findAll = clientRepo.findAll();
		return findAll;
	}

	@Override
	public Client updateClientDetails(Long id) {
		Optional<Client> findById = clientRepo.findById(id);
		Client client = findById.get();
		return client;
	}

	@Override
	public void deleteClient(Long id) {
		clientRepo.deleteById(id);
		
	}

}
