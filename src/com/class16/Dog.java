package com.class16;

public class Dog {
String name, breed;
int height;
boolean barks, bites, runs;
public static void main(String[] args) {
	Dog husky=new Dog();
	husky.name="Bobik";
	husky.breed="male";
	husky.height=123;
	husky.barks=true;
	husky.bites=false;
	husky.runs=true;
	System.out.println("Dog name is "+ husky.name);
}
}
