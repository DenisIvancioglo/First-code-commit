package com.arraysreview;

import java.util.Scanner;

public class Task59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
	    int[] numbers = new int[5];
	int total;
	    for (int i = 0; i < numbers.length; i++)
	    {
	        
	        numbers[i] = input.nextInt();
	    }
	    for(int a=numbers.length; a>0; a--) {
	    	System.out.println(a);
	    }
	}

}
