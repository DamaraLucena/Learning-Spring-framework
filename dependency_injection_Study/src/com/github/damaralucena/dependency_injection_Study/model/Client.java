package com.github.damaralucena.dependency_injection_Study.model;

public class Client {
	
	private String name;
	private String email;
	private String telephone;
	private boolean active = false;
	
	public Client(String name, String email, String telephone) {
		this.name = name;
		this.email = email;
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getTelephone() {
		return telephone;
	}

	public boolean isActive() {
		return active;
	}

}
