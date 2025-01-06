package com.set;

import java.util.Objects;

public class Duster {
//			..........................................................................To Learn Hashset.....................................................................................
	String color;
	double price;
	double weight;
	public Duster(String color, double price, double weight) {
		super();
		this.color = color;
		this.price = price;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Duster [color=" + color + ", price=" + price + ", weight=" + weight + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, price, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Duster other = (Duster) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
}
