

package com.class8;
import java.util.Scanner;


public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		double price;
		scan=new Scanner(System.in);
		do {
			System.out.println("Please pay for soda");
			price=scan.nextDouble();
		}while(price !=1.99);
		System.out.println("Please enjoy your soda");
		
		

	}

}
