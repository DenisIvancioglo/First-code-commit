package com.class20;

public class Task {

	String crateEmail(String name, String lastName, String emailType) {
		
		String email=name+lastName+"@"+emailType+".com";
		
		return email;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Task obj=new Task();
String email=obj.crateEmail("Denis", "Ivancioglo", "@gmail.com");
System.out.println(email);
	}

}
