package com.reviewall;

import java.util.Scanner;

public class reverse3ToSubstring {
public static void main(String[] args) {
	Scanner input;
	String reverse;
	input=new Scanner(System.in);
	System.out.println("Enter your phrase");
	reverse=input.nextLine();
	for(int i=reverse.length()-1; i>=0; i--) {
		System.out.print(reverse.substring(i, i+1));
	}
}
}
