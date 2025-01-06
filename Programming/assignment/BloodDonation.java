package com.assignment;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the weight :- ");
		int weight = s.nextInt();
		if (weight >= 50) {
			System.out.println("Eligible for blood donation");
		} else {
			System.out.println("Not eligible for blood donation");
		}
		s.close();
	}

}
