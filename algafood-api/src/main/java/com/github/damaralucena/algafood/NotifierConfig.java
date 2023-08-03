package com.github.damaralucena.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.damaralucena.algafood.notification.EmailNotification;

@Configuration
public class NotifierConfig {
	
	@Bean
	public EmailNotification emailNotification(){
		EmailNotification notification = new EmailNotification("smtp.algamail.com.br");
		notification.setCapsLock(true);
		
		return notification;
	}

}
