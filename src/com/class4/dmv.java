package com.class4;

import java.util.Scanner;

public class dmv {
	public static void main(String[] args) {
		int age;
	
		System.out.println("Enter your age please: ");
		Scanner input=new Scanner(System.in);
		age=input.nextInt();
		
				if (age>=18) {
					System.out.println("Congrats here is your DL and you can do DoorDash, no more pizza delivery");
				}else {
					System.out.println("Sorry, bro, go get your permit first");
				}
	}

}
