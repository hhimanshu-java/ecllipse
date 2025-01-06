package Assignment;

public class Car {
		String brand;
		String color;
		long price;
		int noofseats;
		
		Car(String brand, String color, long price, int noofseats){
				this.brand=brand;
				this.color=color;
				this.price=price;
				this.noofseats=noofseats;
		}
		
		@Override
		public String toString() {
			return brand + " " + color + " " + price + " " + noofseats; 
		}
	}