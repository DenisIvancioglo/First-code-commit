package com.arraysreview;

import java.util.Scanner;

public class task58 {
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    int[] numbers = new int[5];
	int total;
	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Input");
	        numbers[i] = input.nextInt();
	    }
	     for (int i = 0; i < numbers.length; i++)
	    {
	        
	        total=10*numbers[i];
	        System.out.println(total);
	        
	    }
	  }
}
