package com.class9;
import java.util.Scanner;
public class UserInputNested {

	public static void main(String[] args) {
		Scanner input;
		int st, en;
		int sum=0;
		int add=0;
		input=new Scanner(System.in);
		System.out.println("Start number");
		st=input.nextInt();
		System.out.println("End number");
		en=input.nextInt();
		for(int i=st; i<=en; i++) {
			if(i%2==0) {
				
				sum=sum+i;
				
		}
			
			else if(i%2 !=0) {
				add=add+i;
				
			}
		}
		System.out.println("even numbers "+sum);
System.out.println("odd numbers "+add);
	}

}
