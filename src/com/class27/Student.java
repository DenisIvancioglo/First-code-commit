package com.class27;

public class Student {
	
	String name;
	long number;
	
	Student(String name, long number){
		this.name=name;
		this.number=number;
		
		
	}

}
class user extends Student{
	public String address;
	
	user(String name, long number,String address){
		super(name,number);
		this.address=address;
		
	}
	public void userDetails() {
		System.out.println("User name is"+name+" and phone number is "+number+" address is "+address);
	}

}





	