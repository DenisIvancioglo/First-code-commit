package com.class8;

public class ForLoop {
	public static void main(String[] args) {
		//initialize condition/testCondition increment/decrement
for(int       i=0;              i<=10;                       i++) {
			System.out.println("Good morning");
		}
for(int b=1; b<=50;   b+=5) {
	System.out.println(b);
	
}
 for(int a=1; a<=100; a++) {
	 System.out.println(a);
 }
    
 for(int i=100; i>=1; i-- ) {
	 System.out.println(i);
	 
 }
 for(int i=1; i<=20; i++) {
	 if(i%2 !=0) {
		 System.out.println(i);
	 }
	 for (int b=20; b>=1; b--) {
		 if(b%2==0) {
			 System.out.println(b);
			 
		 }
		 for(int a=20; a<=50; a++) {
			 if(b%2==0) {
				 System.out.println(a);
			 }
		 }
			for(int c=20; c<=50; c++) {
				if(c%2 !=0) {
					System.out.println(c);
				}
			}
		 
	 }
	 
	 
 }
 
 
	}

}
