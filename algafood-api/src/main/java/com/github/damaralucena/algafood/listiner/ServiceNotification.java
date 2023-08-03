package com.github.damaralucena.algafood.listiner;import javax.management.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;

import com.github.damaralucena.algafood.notification.NotifierType;
import com.github.damaralucena.algafood.notification.UrgencyLevel;
import com.github.damaralucena.algafood.service.ClientActivatedEvent;

public class ServiceNotification {
	
	@NotifierType(UrgencyLevel.NORMAL)
	@Autowired
	private Notification notification;

	@EventListener
	public void ClientActivatedListiner(ClientActivatedEvent event) {
		notification.notification(event.getClient(), "Your registration in the system is active");
		
	}
}
