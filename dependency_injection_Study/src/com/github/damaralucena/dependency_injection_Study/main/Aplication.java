package com.github.damaralucena.dependency_injection_Study.main;

import com.github.damaralucena.dependency_injection_Study.model.Client;
import com.github.damaralucena.dependency_injection_Study.notification.Notification;
import com.github.damaralucena.dependency_injection_Study.notification.SMSNotification;
import com.github.damaralucena.dependency_injection_Study.service.ClientServiceActivation;

public class Aplication {

	public static void main(String[] args) {
		Client maria = new Client("Maria", "maria@xyz.com", "00000000000");
		Client joao = new Client("João", "joao@xyz.com", "01001010101");
		
		Notification notification = new SMSNotification();
		
		
		ClientServiceActivation activationClient = new ClientServiceActivation(notification);
		activationClient.activate(maria);
		activationClient.activate(joao);

	}

}
