package com.class12;

import java.util.Scanner;

public class Task74 {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		   if(language.contentEquals("Java")) {
			   System.out.println("Java is a programming language");
		   
		   }else if(language.contentEquals("C")) {
			   System.out.println("C is a procedural programming language");
			   
		   }
		   
		   
		   else {
			   System.out.println("Doesn't match any programming language");
		   }
}
}
