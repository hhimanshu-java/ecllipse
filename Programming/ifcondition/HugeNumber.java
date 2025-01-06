package com.ifcondition;

import java.util.Scanner;

public class HugeNumber {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter X :- ");
			int x = s.nextInt();
			System.out.println("Enter Y :- ");
			int y = s.nextInt();		
			int sum = x + y;
			System.out.println(sum);
			if (sum>100) 
				System.out.println("IT'S A HUGE NUMBER");
			
			
			s.close();
	}

}
