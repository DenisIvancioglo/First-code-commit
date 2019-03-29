package com.class4;

import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {
		String city;
		int temp;
		System.out.println("City Name");
		Scanner input=new Scanner(System.in);
		city=input.nextLine();
		
		System.out.println("enter temperature");
		temp=input.nextInt();
		int convertedtemp=(temp-32)*5/9;
		System.out.println("The temperature in "+city+ " is "+convertedtemp+"C");
				
	}

}
