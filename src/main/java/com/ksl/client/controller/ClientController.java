package com.ksl.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ksl.client.entities.Client;
import com.ksl.client.services.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping("/addClient")
	public String addClient() {
		return "addClient";
	}
	@RequestMapping("/saveClientDetails")
	public String saveClientDetails(@ModelAttribute("client") Client client,ModelMap modelMap) {
		clientService.saveClientDetails(client);
		modelMap.addAttribute("msg", "Client is Saved");
		return "addClient";
	}
	@RequestMapping("/getAllClients")
	public String getAllClients(ModelMap modelMap) {
		List<Client> clients = clientService.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "getAllClients";
	}
	@RequestMapping("/deleteClient")
	public String deleteClient(@RequestParam("id") Long id,ModelMap modelMap) {
		clientService.deleteClient(id);
		List<Client> clients = clientService.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "getAllClients";
	}
	
	@RequestMapping("/updateClient")
	public String updateClient(@RequestParam("id") Long id,ModelMap modelMap) {
		Client client = clientService.updateClientDetails(id);
		modelMap.addAttribute("client", client);
		return "updateClient";
	}
	@RequestMapping("/updateClientDetails")
	public String updateClientDetails(@ModelAttribute("client") Client client,ModelMap modelMap) {
		clientService.saveClientDetails(client);
		modelMap.addAttribute("msg", "Client is updated");
		return "updateClient";
	}
}
