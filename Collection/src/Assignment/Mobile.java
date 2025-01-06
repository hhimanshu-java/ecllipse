package Assignment;

public class Mobile {
		String brand;
		double price;
		String color;
		
		Mobile(String brand, double price, String color){
			this.brand=brand;
			this.price=price;
			this.color=color;
		}
		public String toString() {
			return brand + " " + price + " " + color;
		}
}
