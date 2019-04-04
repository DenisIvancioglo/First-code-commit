package com.class16;

import java.util.Scanner;

public class ReviewWeqas {
	
String eyes, nose, shirt, hair;
public static void main(String[] args) {
	ReviewWeqas weqas=new ReviewWeqas();
	weqas.eyes="Blue";
	weqas.hair="Black";
	weqas.nose="Brown";
	weqas.shirt="Grey";
	weqas.humanEye();
		weqas.scannerFirstname();	
}
void humanEye() { 
	if(eyes.contains("Blue")) {
		System.out.println("Weqas krasava");
	}
	System.out.println("I do not have a return type");
}
void scannerFirstname() {
	Scanner scan=new Scanner(System.in);
	scan.hasNextLine();
}
void scannerInt() {
	Scanner scan=new Scanner(System.in);
	scan.hasNextInt();
}
}
