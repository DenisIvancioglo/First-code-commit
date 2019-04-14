package com.class22;

public class Car {
public static String make="Toyota";
String color;
String model;
 int doors;
 boolean engine;
 Car(){
	 System.out.println("I am a constructor");
 }
 
 public static void main(String[] args) {
	Car obj=new Car();
}
 public static void hello() {
	 
	 String name;
	 System.out.println("Static hello method");
 }
}
