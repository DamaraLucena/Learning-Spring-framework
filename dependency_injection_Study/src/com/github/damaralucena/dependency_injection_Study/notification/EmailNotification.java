package com.github.damaralucena.dependency_injection_Study.notification;

import com.github.damaralucena.dependency_injection_Study.model.Client;

public class EmailNotification implements Notification{
	
	@Override
	public void notification(Client client, String message) {
		System.out.printf("Notification %s customer via email %s\n",
				client.getName(), client.getEmail(), message);
	}

}
