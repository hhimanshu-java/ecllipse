package Assignment;
import java.util.ArrayList;
import java.util.Collections;
public class MobileDriver {
	public static void main(String[] args) {
		ArrayList <Object> al = new ArrayList<>();
		al.add(new Mobile("REALME", 20000d, "BLUE"));
		al.add(new Mobile("SAMSUNG",40000d, "ORANGE"));
		al.add(new Mobile("PIXEL", 59000d, "BLACK"));
		al.add(new Mobile("REDMI", 25000d, "PINK"));
//		=========       SORTING      =========
		Collections.sort(al, new BrandinAcse());
		System.out.println("BRAND SORTED IN ASCE :- " + al);
		Collections.sort(al, new BrandinDESC());
		System.out.println("BRAND SORTED IN DESC :- " + al);
		Collections.sort(al, new PriceinASCE());
		System.out.println("PRICE SORTED IN ASCE :- " + al);
		Collections.sort(al, new PriceinDESC());
		System.out.println("PRICE SORTED IN DESC :- " + al);
		Collections.sort(al, new ColorinASCE());
		System.out.println("COLOR SORTED IN ASCE :- " + al);
	}
}