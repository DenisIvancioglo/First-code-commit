package com.class5;
import java.util.Scanner;

public class LargestIF {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
double num1, num2, num3;
Scanner input;
input=new Scanner(System.in);
System.out.println("Enter your first number ");
num1=input.nextDouble();
System.out.println("Enter your second number ");
num2=input.nextDouble();
System.out.println("Enter your third number ");
num3=input.nextDouble();

if(num1>num2 && num1>num3) {
	System.out.println(num1+" is Largest number");
}else if(num2>num1 && num2>num3) {
	System.out.println(num2+ "is largest number");
}else {
	System.out.println(num3+" is largest number");
}
	}

}
