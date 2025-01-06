package Assignment;
import java.util.Comparator;
public class noofseatsinAsce implements Comparator<Object>{
		public int compare(Object o1, Object o2) {
			Car c1 = (Car) o1;
			Car c2 = (Car) o2;
			if (c1.noofseats>c2.noofseats) {
				return 1;
			}
			else if (c1.noofseats<c2.noofseats) {
				return -1;
			}
			else {
				return 0;
			}
		}
}
