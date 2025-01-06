package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ToLearnSort {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(52);
		al.add(59);
		al.add(26);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}

}
