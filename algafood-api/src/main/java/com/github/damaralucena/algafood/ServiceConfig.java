package com.github.damaralucena.algafood;

import javax.management.Notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.damaralucena.algafood.notification.Notifier;
import com.github.damaralucena.algafood.service.ClientServiceActivation;

@Configuration
public class ServiceConfig {

	@Bean
	public ClientServiceActivation clientServiceActivation(Notifier notification) {
		return new ClientServiceActivation(notification);
	}
}
