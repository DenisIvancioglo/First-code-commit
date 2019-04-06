package com.class17_2;

public class Zvezda {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int y=1; y<=i; y++ ) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		for(int i=0; i<=3; i++) {
			
			for(int a=0; a<=5; a++) {
				if(i==0 || i==3 || a==5 || a==0) {
				
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
