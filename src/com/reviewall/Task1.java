package com.reviewall;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input;
int x, y;
input=new Scanner(System.in);
System.out.println("Enter your first number");
x=input.nextInt();
System.out.println("Enter your second number");
y=input.nextInt();
int mul;
mul=x*y;
if(mul>0) {
	System.out.println("True");
	
}else {
	System.out.println("False");
}

	}

}
