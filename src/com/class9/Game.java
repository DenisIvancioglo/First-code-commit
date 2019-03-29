package com.class9;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int num, secret;
		secret=15;
		Scanner input;
		input=new Scanner(System.in);
		
		
			do {System.out.println("Enter number between 1 and 20");
			num=input.nextInt();
				
				
				if(num<secret) {
				System.out.println(" number is too small, try again");
				num=input.nextInt();
			}
			else if(num>secret) {
				System.out.println( "number is too large, try again");
				num=input.nextInt();
			}
			
			}while(num!=15);
			System.out.println("Congratulations");
			
	
		}
		
				
	}


