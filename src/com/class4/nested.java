package com.class4;

public class nested {
	public static void main(String[] args) {
		double mortRate=3.5;
		int mortPrice=2500000;
		if(mortRate>4.5) {
			System.out.println("not Buying a house");
		}else {
			System.out.println("Buying");
			if(mortPrice>2000000) {
				System.out.println("Take a loan");
			}else {
				System.out.println("Cash");
			}
		}
	}
}