package com.reviewclass01;

public class Student extends Person{
	String sudentNr;
public Student() {
	
}
public Student(String name,int age, int weight) {
	this.name=name;
	this.age=age;
	this.weight=weight;
}
public void sleep() {
	System.out.println("stident is sleeping in class.");
}
public void displayInfo() {
	super.displayInfo();
	System.out.println("I am a student.My name is "+name+" My number is "+sudentNr);
}
}
