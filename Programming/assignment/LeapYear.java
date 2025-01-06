package com.assignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
//			8.Write a program to Check given year is a leap year or not and return a suitable message.
//Explanation:
//A leap year is a year with an extra day, February 29th, making it 366 days instead of the usual 365.
//It happens every four years. So, any year divisible by 4 is a leap year.
//However, there's an exception: if the year is divisible by 100, it's not a leap year, unless it's also divisible by 400
			
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year :- ");
		int year = s.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 
			System.out.println(year + " is a leap year");
		 else 
			System.out.println(year + " is not a leap year");
		s.close();
	}

}
