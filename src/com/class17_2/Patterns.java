package com.class17_2;

public class Patterns {

	public static void main(String[] args) {
		
		
		Patterns obj=new Patterns();
		obj.print();
		
		
	}	
		
	void print() {	
		for(int i=1; i<=5; i++) {
			
				
			for(int a=1; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}for(int a=4; a>=1; a--) {
			for(int b=1; b<=a; b++ ) {
			System.out.print("*");
			}System.out.println();
		}

	
	}
}
