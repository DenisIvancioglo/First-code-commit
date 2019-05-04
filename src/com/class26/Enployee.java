package com.class26;

public class Enployee {
String name,lastName;

Enployee(){
	System.out.println("I am a paremnt class");
}
Enployee(String name, String lastName){
	this.name=name;
	this.lastName=lastName;
}
}
class Tester extends Enployee{
	int salary;
	
	Tester (String name, String lastName, int salary){
		super(name,lastName);
		this.salary=salary;
		
	}
	public void displayDetails() {
		System.out.println("Employee "+name+" "+lastName+" salary is "+salary);
	}
}
