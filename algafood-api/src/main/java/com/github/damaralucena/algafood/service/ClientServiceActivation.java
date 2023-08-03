package com.github.damaralucena.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.github.damaralucena.algafood.model.Client;
import com.github.damaralucena.algafood.notification.Notifier;

@Component
public class ClientServiceActivation {
	
	@Qualifier("email")
	@Autowired
	private Notifier notification;	

	public void activate(Client client) {
		client.isActive();
		
		notification.notification(client, "Your registration in the system is active!");
	}
	
}
