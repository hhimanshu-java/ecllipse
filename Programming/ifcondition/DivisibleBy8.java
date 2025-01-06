package com.ifcondition;

import java.util.Scanner;

public class DivisibleBy8 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the 1st no. :- ");
			int a = s.nextInt();
			System.out.println("Enter the 2nd no. :- ");
			int b = s.nextInt();	
			int sum = a + b;
			System.out.println("The sum of a and b is :- " + sum);
			if (sum%8==0) 
				System.out.println("Sum is divisible by 8");
			
			System.out.println("THANK YOU");
			s.close();
	}
	

}
