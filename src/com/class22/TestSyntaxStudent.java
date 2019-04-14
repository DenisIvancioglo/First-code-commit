package com.class22;

import java.util.Scanner;

public class TestSyntaxStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SyntaxStudent student1=new SyntaxStudent();
//		 student1.StudentName="Samir";
//		 student1.studentLastName="Aziz";
//		 student1.getStudentDetails();
		Scanner input;
		String a, b;
		input=new Scanner(System.in);
		a=input.nextLine();
		b=input.nextLine();
		
		SyntaxStudent obj=new SyntaxStudent(a,b);
		obj.getStudentDetails();
	}
	

}
