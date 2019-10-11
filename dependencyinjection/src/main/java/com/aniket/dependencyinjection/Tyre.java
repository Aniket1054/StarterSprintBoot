package com.aniket.dependencyinjection;

import org.springframework.stereotype.Component;

public class Tyre {
	
	private String brand;
	
	public Tyre() {
		super();
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
}
