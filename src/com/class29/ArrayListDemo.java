package com.class29;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> greetings=new ArrayList<String>();
greetings.add("Hello");
greetings.add("Welcome");
greetings.add("Hi");
greetings.add("Bye");

System.out.println(greetings.get(1));
System.out.println(greetings.size());//4
//collections - growable in size

greetings.add("How are you?");
greetings.add("How are you?");
greetings.add("How are you?");

for(int i=0;i<greetings.size(); i++) {
	System.out.println(greetings.get(i));
}
for(String greetWords: greetings) {
	System.out.println(greetWords);
}
	}

}
