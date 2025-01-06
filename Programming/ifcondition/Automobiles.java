package com.ifcondition;

import java.util.Scanner;

public class Automobiles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("TOtal No of vehicles is :- ");
		int v= s.nextInt();
		System.out.println("Total no of wheels is :- ");
		int w = s.nextInt();
		if (w%2==0 && w>v) {
				int TW = (w-2*v)/2; 
				int FW = v - TW;
				
				System.out.println("TWO-WHEELERS :- " + TW);
				System.out.println("FOUR-WHEELERS :- " + FW);
		}
		System.out.println("CONDITIONS SATISFIED");
		s.close();
	}

}
