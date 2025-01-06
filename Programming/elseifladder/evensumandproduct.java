package com.elseifladder;
import java.util.Scanner;
public class evensumandproduct {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number;- ");
		int n1 = s.nextInt();
		System.out.println("Enter the 2nd number;- ");
		int n2 = s.nextInt();
		System.out.println("Enter the 3rd number;- ");
		int n3 = s.nextInt();
		if (n1%2==0&&n2%2==0&&n3%2==0) {
			System.out.println("product is " + (n1*n2*n3));
		}
		else if (n1%2 ==0 && n2%2==0) {
			System.out.println("Sum is :- " + (n1+n2));
		}
		else if (n2%2==0 && n3%2==0) {
			System.out.println("Sum is :- " + (n2+n3));
		}
		else if (n1%2==0&&n3%2==0) {
			System.out.println("Sum is :- " + (n1+n3));
		}
		else if (n1%2==0) {
			System.out.println("Even no is:- " + n1);
		}
		else if (n2%2==0) {
			System.out.println("Even no is:- " + n2);
		}
		else if (n3%2==0) {
			System.out.println("Even no is:- " + n3);
		}
		else {
			System.out.println("0");
		}
		s.close();
	}

}
