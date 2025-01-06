package com.collections;

public class Mobile {
	String brand;
	String version;
	double price;
	public Mobile(String brand, String version, double price) {
		this.brand=brand;
		this.version=version;
		this.price=price;
	}
	public String toString() {
		return brand+" " + version + " "+price;
	}
}
