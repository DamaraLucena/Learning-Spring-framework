package com.github.damaralucena.algafood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.damaralucena.algafood.model.Client;
import com.github.damaralucena.algafood.notification.Notifier;

@Component
public class ClientServiceActivation {
	
	@Autowired
	private List<Notifier> notifications;	

	public void activate(Client client) {
		client.isActive();
		
		for (Notifier notifier : notifications) {
			notifier.notification(client, "Your registration in the system is active!");			
		}
	}
	
}
