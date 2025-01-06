package com.elseifladder;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age of Ramu:- ");
		int ramu = s.nextInt();
		System.out.println("Enter age of Raju:- ");
		int raju = s.nextInt();
		System.out.println("Enter age of Raghu:- ");
		int raghu = s.nextInt();
		if (ramu <= raju && ramu <= raghu) {
			System.out.println("Ramu is Younger");
		} else if(raju <= raghu){
			System.out.println("Raju is Younger");
		}
		else {
			System.out.println("Raghu is Younger");
		}
		s.close();
	}

}
