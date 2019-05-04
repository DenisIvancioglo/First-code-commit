package com.class25;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicit/Automatic/Widening
		double a=10;
		System.out.println(a);
		
		//Explicit/Manual/Narrowing--programmer takes care of conversion
		double b=10.0;
		int c=(int)b;
		
		int i=130;
		byte by=(byte)i;
		System.out.println(by);
		//Upcasting--->compiler takes care of conversion
		Payment pay=new MasterCard();
		//MasterCard mc= new Payment();-->compiler wont allow
		MasterCard mc=(MasterCard)new Payment();

	}

}
  