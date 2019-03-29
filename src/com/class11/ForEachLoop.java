package com.class11;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {11,12,13,14};
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		String[] cars= {"Civic", "Honda", "EX","Ford", "Explorer","Jeep"};
		for(String brands:cars) {
			System.out.println(brands);
		}for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
			
		}
		
	}

}
