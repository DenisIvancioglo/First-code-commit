package com.class17;

public class ReturnAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnAverage obj=new ReturnAverage();
		int print=obj.average(5, 6, 10);
		System.out.println(print);
	}
	int average(int a, int b, int c ) {
		int sum=(a+b+c)/3;
		return sum;
		
	}

}
