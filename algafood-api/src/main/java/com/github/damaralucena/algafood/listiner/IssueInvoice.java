package com.github.damaralucena.algafood.listiner;

import org.springframework.context.event.EventListener;

import com.github.damaralucena.algafood.service.ClientActivatedEvent;

public class IssueInvoice {
	
	@EventListener
	public void ClientActivateEvent(ClientActivatedEvent event) {
		System.out.println("issuing invoice to customer" + event.getClient().getName());
	}

}
