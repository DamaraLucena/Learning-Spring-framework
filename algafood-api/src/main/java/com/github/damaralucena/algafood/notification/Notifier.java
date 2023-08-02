package com.github.damaralucena.algafood.notification;

import com.github.damaralucena.algafood.model.Client;

public interface Notifier {

	void notification(Client client, String message);

}