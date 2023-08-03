package com.github.damaralucena.algafood.service;

import com.github.damaralucena.algafood.model.Client;

public class ClientActivatedEvent {
	
	private Client client;
	
	public ClientActivatedEvent(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

}
