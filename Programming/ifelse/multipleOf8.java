package com.ifelse;

import java.util.Scanner;

public class multipleOf8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER :- ");
		int num = s.nextInt();
		if (num%8==0) {
			System.out.println(num + " is multiple of 8");
		} else {
			System.out.println(num + " is not multiple of 8");
		}
		s.close();
	}

}
