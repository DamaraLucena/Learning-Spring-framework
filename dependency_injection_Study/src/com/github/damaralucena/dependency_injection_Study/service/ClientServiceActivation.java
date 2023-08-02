package com.github.damaralucena.dependency_injection_Study.service;
import com.github.damaralucena.dependency_injection_Study.model.*;
import com.github.damaralucena.dependency_injection_Study.notification.Notification;

public class ClientServiceActivation {
	
	private Notification notification;
	
	
	public ClientServiceActivation(Notification notification) {
		this.notification = notification;
	}
	
	public void activate(Client client) {
		client.isActive();
		
		this.notification.notification(client, "Your registration in the system is active!");
	
	}
	
}
