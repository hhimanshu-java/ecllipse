package com.set;

import java.util.HashSet;

public class DusterDriver {

	public static void main(String[] args) {
		HashSet <Object> hs = new HashSet <Object>();
		hs.add(new Duster("Black", 100, 100));
		hs.add(new Duster("Black", 100, 100));
		hs.add(new Duster("Green", 200, 200));
		System.out.println(hs);
	}

}
