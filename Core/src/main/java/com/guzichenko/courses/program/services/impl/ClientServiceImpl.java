package com.guzichenko.courses.program.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.guzichenko.courses.program.model.Client;
import com.guzichenko.courses.program.services.ClientService;

public class ClientServiceImpl implements ClientService{

	private List<Client> clients = new ArrayList<>();

	@Override
	public void addClient() {
		System.out.println("Add new client");
	}

	@Override
	public void removeClient() {
		System.out.println("Remove client");

	}

	@Override
	public void editClient() {
		System.out.println("Edit client");

	}

}
