package com.class17_2;
import java.util.Scanner;

import com.class17.Calculator;
public class Application {

	public static void main(String[] args) {
		
		
		Calculator obj=new Calculator();
		Scanner input;
		String operator;
		int a,b;
		boolean startover=true;
		input=new Scanner(System.in);
		while(startover) {
		System.out.println("Enter your first number:");
		a=input.nextInt();
		
		System.out.println("Enter your operator: /, *, +, -");
		operator=input.next();
		System.out.println("Enter your second number: ");
		b=input.nextInt();
		
		switch(operator) {
		case "/":
			System.out.println(obj.div(a, b));
			break;
		case "*":
			System.out.println(obj.mul(a, b));
			break;
		case "-":
			System.out.println(obj.sub(a, b));
			break;
		case "+":
			System.out.println(obj.sum(a, b));
			break;
			default:
				
				
				break;
				
				
		}
	
		}
		
	}

}
