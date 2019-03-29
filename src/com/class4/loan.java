package com.class4;

import java.util.Scanner;

public class loan {
	public static void main(String[] args) {
		int loan;
		System.out.println("Enter yuor loan amount ");
		Scanner input=new Scanner(System.in);
		loan=input.nextInt();
		if (loan<2000000) {
			System.out.println("Your loan amount is approved");
		}else {
			System.out.println("You aren't approved for this loan");
		}
	}

}
