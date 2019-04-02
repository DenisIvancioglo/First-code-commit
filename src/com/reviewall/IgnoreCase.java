package com.reviewall;

import java.util.Scanner;

public class IgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input;
String browser;
input=new Scanner(System.in);
System.out.println("Enter your browser");
browser=input.nextLine();
if(browser.equalsIgnoreCase("chrome")) {
	System.out.println("Proceed with "+browser+ " browser");
}else if(browser.equalsIgnoreCase("firefox")) {
	System.out.println("Proceed with "+browser+  " browser");
}else if(browser.equalsIgnoreCase("ie")) {
	System.out.println("Proceed with "+browser+  " browser");
}else {
	System.out.println("Invalid Browser: "+browser);
}
	}

}
