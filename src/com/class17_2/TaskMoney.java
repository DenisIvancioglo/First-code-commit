package com.class17_2;

import java.util.Scanner;

public class TaskMoney {

	public static void main(String[] args) {
		int price, payment, sum=0;
		String item;
		Scanner input;
		input=new Scanner(System.in);
		System.out.println("Please enter the item you would like to buy");
		item=input.nextLine();
		System.out.println("Please enter the price for your item");
		price=input.nextInt();
		do {
			System.out.println("Please pay for your item");
			payment=input.nextInt();
			sum=sum+payment;
		if(sum<price) {
			System.out.println("You still need to pay "+(price-sum));
		}
		
		}while(sum<price);
		System.out.println("Thank you for shopping with us");

	}

}
