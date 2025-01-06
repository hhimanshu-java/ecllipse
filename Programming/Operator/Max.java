package com.Operator;

import java.util.Scanner;
public class Max {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st no:- ");
		int a= s.nextInt();
		System.out.println("Enter the 2nd no:- ");
		int b = s.nextInt();
		System.out.println("Enter the 3rd no:- ");
		int c = s.nextInt();
		System.out.println((a>b)?(a>c?a:c):(b>c?b:c));
		s.close();
	}
}