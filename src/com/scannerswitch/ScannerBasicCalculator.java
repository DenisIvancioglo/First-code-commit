package com.scannerswitch;

import java.util.Scanner;


public class ScannerBasicCalculator {
	public static void main(String[] args) {
		 Scanner bucky = new Scanner(System.in);
		 double fnum, snum;
		 String operator ;
		 double answer = 0;
		 System.out.println("Enter first num: ");
		 fnum = bucky.nextDouble();
		 System.out.println("Enter second num: ");
		 snum = bucky.nextDouble();
		 System.out.println("Enter your operator");
		 operator=bucky.next();
		 switch (operator) {
		 case "-":
			 answer=fnum-snum;
			 break;
		 case"/":
			 answer=fnum/snum;
			 break;
		 case"*":
			 answer=fnum*snum;
			 break;
		 case"+":
			 answer=fnum+snum;
				 break;
			 
			 
		 }System.out.println("your answer is "+answer);
		 
		 
	}
	

}
