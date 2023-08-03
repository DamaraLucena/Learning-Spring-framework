package com.github.damaralucena.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import com.github.damaralucena.algafood.model.Client;

@Component
public class ClientServiceActivation {
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void activate(Client client) {
		client.isActive();
		
		eventPublisher.publishEvent(new ClientActivatedEvent(client));
	
	}
	
}
