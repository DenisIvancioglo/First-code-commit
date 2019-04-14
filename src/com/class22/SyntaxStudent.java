package com.class22;

public class SyntaxStudent {
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	public String StudentName;
	public String studentLastName;
	public void getStudentDetails() {
		String details="I am a student at "+schoolName+" from batch "+batchNumber+" and my name is "+StudentName+" "+studentLastName;
	System.out.println(details);
	}
	public SyntaxStudent(String name, String lastName) {
		StudentName=name;
		 studentLastName=lastName;
		
	}
}
