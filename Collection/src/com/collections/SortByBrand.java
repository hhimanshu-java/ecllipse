package com.collections;

import java.util.Comparator;

public class SortByBrand implements Comparator {
	public int compare(Object o1, Object o2) {
		Mobile m1 = (Mobile) o1;
		Mobile m2 = (Mobile) o2;
		return m1.brand.compareTo(m2.brand);
		}
	}

