package com.elseifladder;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks :- ");
		int marks = s.nextInt();
		if (marks>=90) {
			System.out.println("Excellent");
		}
		else if (marks<90&&marks>=60) {
			System.out.println("Average");
		}
		else if (marks<60&&marks>=40) {
			System.out.println("not bad");
		}
		else if(marks<40){
			System.out.println("Bad Conduct");
		}
	}

}
