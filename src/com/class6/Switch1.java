package com.class6;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		String letter, grade;
		
		

		Scanner input;
		input=new Scanner(System.in);
		System.out.println("Enter your grade");
		letter=input.nextLine();
		switch (letter){
		
		case "A":
			grade="excellent";
			break;
		case"B":
			grade="good";
			break;
		case "C":
			grade="average";
			break;
		case "D":
			grade="Bad";
			default:
			grade="Not acceptable";
		
			
		}System.out.println(letter+" - "+grade);
		
		
	}

}
