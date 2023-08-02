package com.github.damaralucena.dependency_injection_Study.model;

import java.math.BigDecimal;

public class Product {
	
	private String name;
	private BigDecimal amount;
	
	public Product(String name, BigDecimal amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getAmount() {
		return amount;
	}
	

}
