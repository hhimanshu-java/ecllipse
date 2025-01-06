package com.elseifladder;

import java.util.Scanner;

public class MaxofThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st Number :- ");
		int a= s.nextInt();
		System.out.println("Enter the 2nd Number :- ");
		int b= s.nextInt();
		System.out.println("Enter the 3rd Number :- ");
		int c= s.nextInt();
		if (a>=b&&a>=c) {
			System.out.println(a+" is greater");
		} 
		else if(b>=c){
			System.out.println(b + " is greater");
		}
		else {
			System.out.println(c + " is greater");
		}
	}

}
