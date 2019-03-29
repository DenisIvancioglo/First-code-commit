package com.class10;

public class Arrays {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers=new int[3];
		numbers[0]=65;
		numbers[1]=45;
		numbers[2]=43;
		//numbers[3]=33;
		System.out.println(numbers[2]);
		//System.out.println(numbers[3]);//Arrays out of bounds exception
				
 String[] a=new String[3];
 a[0]="Hello";
 a[1]="Hey;";
 a[2]="Bye";
 System.out.println(a[2]+" friends");
	}

}
