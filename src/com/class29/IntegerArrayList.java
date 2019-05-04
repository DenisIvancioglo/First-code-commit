package com.class29;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> numbers=new ArrayList<Integer>();
numbers.add(10);
numbers.add(20);
numbers.add(33);
numbers.add(100);

numbers.set(2,3333);
System.out.println(numbers.get(2));

for(Integer num: numbers ) {
	System.out.println(num);
}
	}

}
