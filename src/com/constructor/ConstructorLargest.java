package com.constructor;

import java.util.Scanner;

public class ConstructorLargest {
 public static void main(String[] args) {
	
	int c, d;
	Scanner scan;
scan=new Scanner(System.in);
c=scan.nextInt();
d=scan.nextInt();

Constructor obj5=new Constructor(c,d);
System.out.println(obj5.largest()+ " is largest number");
	
	
		
	 
 }
}
