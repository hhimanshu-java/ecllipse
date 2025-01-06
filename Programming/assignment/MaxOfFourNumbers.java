package com.assignment;

import java.util.Scanner;

public class MaxOfFourNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st no. :- ");
		int a = s.nextInt();
		System.out.println("Enter the 2nd no. :- ");
		int b = s.nextInt();
		System.out.println("Enter the 3rd no. :- ");
		int c = s.nextInt();
		System.out.println("Enter the 4th no. :- ");
		int d = s.nextInt();
		int max = (a > b) ? (a > c) ? (a > d ? a : d) : (c > d ? c : d) : (b > c) ? (b > d ? b : d) : (c > d ? c : d);
		System.out.println("THE GREATEST NUMBER IS :- " + max);
		s.close();
	}
}