package com.ifcondition;

import java.util.Scanner;

public class TrianleAngle {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter The 1st Angle :- ");
			int angle1 = s.nextInt();
			System.out.println("Enter The 2nd Angle :- ");
			int angle2 = s.nextInt();
			System.out.println("Enter The 3rd Angle :- ");
			int angle3 = s.nextInt();
			int total = angle1 + angle2 + angle3;
			System.out.println("TOTAL OF ANGLES IS :- "  + total);
			
			if (total==180) 
				System.out.println("THE ANGLES CAN FORM TRIANGLE");
			
			System.out.println("THANK YOU");
			s.close();
			
	}

}
