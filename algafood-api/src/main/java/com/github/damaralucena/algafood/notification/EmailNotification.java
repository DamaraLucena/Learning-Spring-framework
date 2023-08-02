package com.github.damaralucena.algafood.notification;

import com.github.damaralucena.algafood.model.Client;

public class EmailNotification implements Notifier {
	
	private boolean capsLock;
	private String hostServerSmtp;
	
	public EmailNotification( String hostServerSmtp) {
		this.hostServerSmtp = hostServerSmtp;
		System.out.println("EmailNotification");
	}
	
	@Override
	public void notification(Client client, String message) {
		if (this.capsLock) {
			message = message.toUpperCase();
		}
		
		System.out.printf("Notification %s customer via email %s using SMTP %s\n",
				client.getName(), client.getEmail(), this.hostServerSmtp, message);
	}

	public void setCapsLock(boolean capsLock) {
		this.capsLock = capsLock;
	}
	
	

}
