package Assignment;
import java.util.ArrayList;
import java.util.Collections;
public class CarDriver {

	public static void main(String[] args) {
		ArrayList <Object> al = new ArrayList <> ();
		al.add(new Car("ALTO", "RED", 200000l, 4));
		al.add(new Car("SCORPIO S11", "BLACK", 1500000l, 7));
		al.add(new Car("BMW MAYBACK", "BLUE", 20000000l, 4));
		al.add(new Car("PORSCHE 911", "BLACK", 50000000l, 2));
		Collections.sort(al, new BrandinAsc());
		System.out.println("BRAND SORTED IN ASCE :- " + al);
		Collections.sort(al, new ColorinDesc());
		System.out.println("COLOR SORTED IN DESC :- " + al);
		Collections.sort(al, new PriceinAsce());
		System.out.println("PRICE SORTED IN ASCE :- " + al);
		Collections.sort(al, new PriceinDesc());
		System.out.println("PRICE SORTED IN DESC :- " + al);
		Collections.sort(al, new noofseatsinAsce());
		System.out.println("NOOFSEATS SORTED IN ASCE :- " + al);
		Collections.sort(al, new noofseatsinDesc());
		System.out.println("NOOFSEATS SORTED IN DESC :- " + al);
	}

}
