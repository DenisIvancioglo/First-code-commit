package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		LargerAmount(600);
	}
	
	public static void LargerAmount(int a) {
		if(a<500) {
			System.out.println("get your money bro");
		}else {
			throw new ArithmeticException("no money bro");
		}
	}

}
