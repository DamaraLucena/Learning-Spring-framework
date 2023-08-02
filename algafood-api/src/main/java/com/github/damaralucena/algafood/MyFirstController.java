package com.github.damaralucena.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.damaralucena.algafood.model.Client;
import com.github.damaralucena.algafood.service.ClientServiceActivation;

@Controller 	
public class MyFirstController {
	
	private ClientServiceActivation clientServiceActivation;
	
	public MyFirstController(ClientServiceActivation clientServiceActivation) {
		this.clientServiceActivation = clientServiceActivation;
		System.out.println("MyFirstController: " + clientServiceActivation);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Client joao = new Client("João", "joao@xyz.com","02002020202");
		
		clientServiceActivation.activate(joao);
		
		return "Algo 2!";
	}

}
