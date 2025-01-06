package Assignment;

import java.util.Comparator;

public class ColorinDesc implements Comparator<Object>{
		public int compare(Object o1, Object o2) {
			Car c1 = (Car) o1;
			Car c2 =  (Car) o2;			
			return -1*c1.color.compareTo(c2.color);
		}
}
