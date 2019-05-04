package com.class26;

public class SuperWithConstructor {

	public SuperWithConstructor() {
		System.out.println("I am a parent class constructor");
	}
}
class ChildOfSuperWithConstructor extends SuperWithConstructor{
	public ChildOfSuperWithConstructor() {
		//super();-compiler adds it by default
		System.out.println("I am a child class constructor");
	}
}
