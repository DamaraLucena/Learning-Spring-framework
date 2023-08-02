package com.github.damaralucena.dependency_injection_Study.notification;

import com.github.damaralucena.dependency_injection_Study.model.Client;

public interface Notification {
	
	void notification(Client client, String message);

}
