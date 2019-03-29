package com.class11;

public class Recap {
	public static void main(String[] args) {
		String[] names = new String[4];
		names[0] = "Asel";
		names[1] = "Awet";
		names[2] = "Weqas";
		names[3] = "Dzmitry";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		String[] studentNames = { "Shaba", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };
		System.out.println("------For loop-----");
		for (int a = 0; a <= studentNames.length - 1; a++) {
			
		
			System.out.println(studentNames[a]);

		

	}//retrieve values using: advanced for loop, for each loop, enhanced for loop
		System.out.println("-------Advanced for loop------");
		for(String student : studentNames) {
			System.out.println(student);
		}

}

}
