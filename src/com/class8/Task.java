package com.class8;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a starting number");
		int startnumber=scan.nextInt();
		System.out.println("Please enetr a endnumber");
		int endnumber=scan.nextInt();
		
		if(endnumber>startnumber) {
		
		for(int i=startnumber; i<=endnumber; i++) {
			System.out.println(i);
		}
		}else {
			System.out.println("I won't run your code");
		}
	}

}
