package com.class26;

import com.class17.Main;

public class Studemts {

	
	String fullName;
	int age;
	// this is used to differentiate b/w local and instance variables
	public Studemts(String fullName, int age) {
		this.fullName=fullName;
		this.age=age;
		
	}
	
	public void displayDetails() {
		System.out.println("Student full name is "+fullName+" and age="+age);
	}
	public static void main(String[] args) {
		Studemts obj=new Studemts("John Snow", 30);
		obj.displayDetails();
	}
}
