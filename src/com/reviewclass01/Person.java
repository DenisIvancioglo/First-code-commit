package com.reviewclass01;

public class Person {
	String name;
	int age;
	int weight;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, int w) {
		this.name = name;
		this.age = age;
		weight = w;

	}

	public void sleep() {
		System.out.println("----sleeping---");
	}

	public void displayInfo() {
		this.eat();
		System.out.println("I am a person. My name is " + this.name+" and my age is "+age+" and my weitgh is "+weight);
	}
	protected void eat() {
		System.out.println("---eating---");
	}

}
