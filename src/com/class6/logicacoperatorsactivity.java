package com.class6;
import java.util.Scanner;
public class logicacoperatorsactivity {
	public static void main(String[] args) {
		
		int temp;
		Scanner input;
		String activity;
		String snowing="Snowing";
		String sunny="sunny";
		String raining="raining";
		
		
		
		System.out.println("What is your temperature?");
		input=new Scanner(System.in);
		temp=input.nextInt();
		
		
		
		
		
		if (temp>=40 && temp<=80){
			System.out.println("Is it raining,snowing or sunny");
			raining=input.next();
	        if (raining.equals(raining)){
	            System.out.println("watch movie");            
	        }else {
	            System.out.println("go hiking");
	        }

	}else if (temp >=25 && temp <40){
		System.out.println("Is it raining,snowing or sunny");
		snowing=input.next();

	    if (snowing.equals(snowing)) {

	        System.out.println("snowboarding");
	    }else {
	        System.out.println("do coding");
	    }
	}else if( temp >80){System.out.println("Is it raining,snowing or sunny");
		sunny=input.next();
		
	    if (sunny.equals(sunny)) {
	    	
	        System.out.println("go to the beach");
	    }else {
	        System.out.println("more coding");
	    }
	}else {
	    System.out.println( "Please enter different temp");
	    
	}
		
		
	}

}
