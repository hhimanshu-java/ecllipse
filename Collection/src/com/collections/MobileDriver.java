package com.collections;
import java.util.ArrayList;
import java.util.Collections;
public class MobileDriver {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Mobile("REALME", "14.0", 20000d));
		al.add(new Mobile("IQOO", "15.3", 25000d));
		al.add(new Mobile("IPHONE", "14.11", 120000d));
		Collections.sort(al, new SortbyPrice());
		System.out.println(al);
		Collections.sort(al, new SortByBrand());
		System.out.println(al);
	}
}