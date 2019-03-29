package com.class5;
import java.util.Scanner;

public class feet {
	public static void main(String[] args) {
		Scanner input;
		int feet;
		input=new Scanner(System.in);
		System.out.println("Enter your height");
		feet=input.nextInt();
		if(feet<5) {
			System.out.println("Short");
		}else if(feet>=5 && feet<7) {
			System.out.println("medium");
		}else if(feet>6) {
			System.out.println("tall");
		}
	}

}
