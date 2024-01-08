package com.bosch.streams;

public class Car {
	
	String name;
	public Car(String name, int power, int price) {
		super();
		this.name = name;
		this.power = power;
		this.price = price;
	}
	int power;
	int price;
	@Override
	public String toString() {
		return "Car [name=" + name + ", power=" + power + ", price=" + price + "]\n";
	}

}
