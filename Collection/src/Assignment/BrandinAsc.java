package Assignment;
import java.util.Comparator;
public class BrandinAsc implements Comparator<Object>{
		public int compare(Object o1, Object o2) {
			Car c1= (Car) o1;
			Car c2 = (Car) o2;
			
			return c1.brand.compareTo(c2.brand);
		}
}