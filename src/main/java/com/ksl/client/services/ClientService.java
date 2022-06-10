package com.ksl.client.services;

import java.util.List;

import com.ksl.client.entities.Client;

public interface ClientService {
	public void saveClientDetails(Client client);
	public void deleteClient(Long id);
	public List<Client> getAllClients();
	public Client updateClientDetails(Long id);
}
