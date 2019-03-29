package com.class4;

public class NestedIf {
	public static void main(String[] args) {
		double gpa=3.8;
		double expectedGpa=3.7;
		boolean hasDiploma=true;
		
				
				if (hasDiploma) {
					System.out.println("Congrats");
					 if (gpa>expectedGpa) {
						 System.out.println("You are hired");
						 
					 }else {
						 System.out.println("Sorry you are not hired");
					 }
					
				}else {
					System.out.println("Go get a degree");
				}
	}

}
