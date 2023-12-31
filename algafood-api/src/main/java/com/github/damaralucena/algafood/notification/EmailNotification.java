package com.github.damaralucena.algafood.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.github.damaralucena.algafood.model.Client;



@Profile("prod")
@NotifierType(UrgencyLevel.NORMAL)
@Component
public class EmailNotification implements Notifier {
	
	public EmailNotification() {
		System.out.println("EmailNotification prod");
	}
	
	@Override
	public void notification(Client client, String message) {
		System.out.printf("Notification %s customer via email %s: %s\n",
				client.getName(), client.getEmail(), message);
	}	

}
