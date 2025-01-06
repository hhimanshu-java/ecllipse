package com.ifelse;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER :- ");
		int num = s.nextInt();
		if (num >= 0) {
			System.out.println("NUMBER IS POSITIVE");
		} else {
			System.out.println("NUMBER IS NEGATIVE");
		}
		s.close();
	}
	

}
