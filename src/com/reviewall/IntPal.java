package com.reviewall;

public class IntPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=152;
		int temp=a;
		int b=0;
		int c=0;

		while (a>0) {
		    b=a%10; //25
		    a=a/10; //1
		    c=c*10+b;
		    
		}
		System.out.print(c);
		
	}

}
