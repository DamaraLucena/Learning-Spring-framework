package com.github.damaralucena.dependency_injection_Study.service;

import com.github.damaralucena.dependency_injection_Study.model.Client;
import com.github.damaralucena.dependency_injection_Study.model.Product;
import com.github.damaralucena.dependency_injection_Study.notification.Notification;

public class IssuanceOfInvoice {
	
	
	private Notification notification;
	
	
	public IssuanceOfInvoice (Notification notification) {
		this.notification = notification;
	}

	public void issue(Client client, Product product) {
		// TODO emitir a nota fiscal aqui...
	 
		this.notification.notification(client, "Product invoice"
				+ product.getName() + "was inssued!");
	}

}
