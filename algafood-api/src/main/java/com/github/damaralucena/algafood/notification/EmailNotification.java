package com.github.damaralucena.algafood.notification;

import org.springframework.stereotype.Component;

import com.github.damaralucena.algafood.model.Client;


@Component
public class EmailNotification implements Notifier {
	
	public EmailNotification() {
		System.out.println("EmailNotification");
	}
	
	@Override
	public void notification(Client client, String message) {
		System.out.printf("Notification %s customer via email %s\n",
				client.getName(), client.getEmail(), message);
	}

}
