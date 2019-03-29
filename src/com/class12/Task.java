package com.class12;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String username, password, confirmpassword;
Scanner input;
input=new Scanner(System.in);
System.out.println("Enter your username and password and confirm password");
username=input.nextLine();
password=input.nextLine();
confirmpassword=input.nextLine();
if(username.isEmpty() || password.isEmpty()) {
	System.out.println("Username or Password cannot be empty");
	
	
}if(password.length()<8) {
	System.out.println("Password too short");
} if(password.contains(username)) {
	System.out.println("Password cannot contain username");
} if(!password.equals(confirmpassword)) {
	System.out.println("Doesnt match");
}if(!(username.isEmpty() || password.isEmpty()) && password.length()>=8 && !(password.contains(username)) && password.equals(confirmpassword)) {
	System.out.println("Created");
}

}

	}


