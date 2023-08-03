package com.github.damaralucena.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.damaralucena.algafood.model.Client;
import com.github.damaralucena.algafood.notification.Notifier;

@Component
public class ClientServiceActivation {
	
	private Notifier notification;	
	
	@Autowired
	public ClientServiceActivation(Notifier notification) {
		this.notification = notification;
	}

	public void activate(Client client) {
		client.isActive();
		
		this.notification.notification(client, "Your registration in the system is active!");
	}

	@Autowired
	public void setNotification(Notifier notification) {
		this.notification = notification;
	}
	
}
