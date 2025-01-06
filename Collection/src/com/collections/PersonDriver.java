package com.collections;
import java.util.ArrayList;
import java.util.Collections;
public class PersonDriver{
	public static void main(String[] args) {
		ArrayList <Person>al = new ArrayList<>();
		al.add(new Person("APARNA", 25, 1));
		al.add(new Person("RAJASHREE", 22, 2));
		al.add(new Person("Himanshu", 26, 3));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}