package com.github.damaralucena.algafood.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.github.damaralucena.algafood.model.Client;

@Profile("dev")
@NotifierType(UrgencyLevel.NORMAL)
@Component
public class EmailNotificationMock implements Notifier {
	
	public EmailNotificationMock() {
		System.out.println("EmailNotification Mock");
	}
	
	@Override
	public void notification(Client client, String message) {
		System.out.printf("Mock: Notification %s customer via email %s: %s\n",
				client.getName(), client.getEmail(), message);
	}	

}
