package com.github.damaralucena.dependency_injection_Study.notification;

import com.github.damaralucena.dependency_injection_Study.model.Client;

public class SMSNotification  implements Notification {
	
	@Override
	public void notification(Client client, String message) {
		System.out.printf("Notification %s customer via SMS %s\n",
				client.getName(), client.getTelephone(), message);
	}

}
