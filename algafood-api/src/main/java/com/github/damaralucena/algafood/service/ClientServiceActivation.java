package com.github.damaralucena.algafood.service;

import org.springframework.stereotype.Component;

import com.github.damaralucena.algafood.model.Client;
import com.github.damaralucena.algafood.notification.EmailNotification;

@Component
public class ClientServiceActivation {
	
	private EmailNotification notification;
	
	public void activate(Client client) {
		client.isActive();
		
		this.notification.notification(client, "Your registration in the system is active!");
	
	}
	
}
