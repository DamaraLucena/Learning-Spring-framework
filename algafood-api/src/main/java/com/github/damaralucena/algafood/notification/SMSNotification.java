package com.github.damaralucena.algafood.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.github.damaralucena.algafood.model.Client;


@Component
public class SMSNotification implements Notifier {
	
	@Qualifier("SMS")
	@Override
	public void notification(Client client, String message) {
		System.out.printf("Notifying %s by SMS through the phone %s: %s\n",
				client.getName(), client.getTelephone(), message);
	}	

}
