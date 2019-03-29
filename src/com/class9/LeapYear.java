package com.class9;

import java.util.Scanner;

public class LeapYear {
	 public static void main(String args[])
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any year:");
	        int year = s.nextInt();
	        
	       for(int i=1; i<=10; i++) {
	       
	    	   if(year % 400 == 0 || year % 4 == 0) {
	       
	            System.out.println("Year "+year+" is a Leap Year");
	            break;
	            
	        }
	        else
	        {
	            System.out.println("Year "+year+" is not a Leap Year");
	            year=s.nextInt();
	        }
	       }

	    }}
