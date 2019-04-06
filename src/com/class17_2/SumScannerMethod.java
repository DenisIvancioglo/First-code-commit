package com.class17_2;

import java.util.Scanner;

public class SumScannerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumScannerMethod obj=new SumScannerMethod();
		Scanner input;
		int a,b;
	input=new Scanner(System.in);
	a=input.nextInt();
	b=input.nextInt();
	obj.sum(a, b);
		
	}
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	int sum1(int a,int b) {
		return a+b;
		
	}

}
