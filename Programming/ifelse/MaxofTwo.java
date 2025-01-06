package com.ifelse;

import java.util.Scanner;

public class MaxofTwo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number :- ");
		int a = s.nextInt();
		System.out.println("Enter the 2nd number :- ");
		int b = s.nextInt();
		if (a>b) {
			System.out.println(a+ " is gretarest");
		} else {
			System.out.println(b+ " is gretarest");
		}
		s.close();
	}

}
