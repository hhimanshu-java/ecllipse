package com.elseifladder;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:- ");
		int num = s.nextInt();
		if (num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else
			System.out.println("Zero");
			
	}

}
