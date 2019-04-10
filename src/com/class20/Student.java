package com.class20;

public class Student {
	static String grade;
	String getGrade(int score) {
		
		if(score>90) {
			grade="A";
			
		}
		if(score>80 && score<90) {
			grade="B";
		}
		if(score>70 && score<80) {
			grade="C";
		}
		if(score>60 && score<70) {
			grade="D";
		}
		if(score>50 && score<60) {
			grade="F";
			
		}
		return grade;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		
System.out.println(obj.getGrade(75));
	}

}
