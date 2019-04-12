package com.reviewall;

public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=19;
		int temp=a;
		int b=0;
		int c=0;

		while (a>0) {
		    b=a%10; //25
		    a=a/10; //1
		    c=c+(b*b);
		    
		  
		    
		 System.out.println(c);
		    
		}
		System.out.print(c);
	}

}
