package com.class29;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generic Array that stores only String Object
		ArrayList<String> names=new ArrayList<String>();
		names.add("Denis");
		names.add("Ali");
		names.add("Anar");
		names.add("Sanea");
		names.add("Nastia");
		// names.add(123); not valid since we have generic arrayList of a type of String
		
		//nom generic arrayList- we can store different types of Objects
		ArrayList alist=new ArrayList();
		
		alist.add("Denis");
		alist.add(5);
		alist.add(100.12);
		
		for(Object values: alist) {
			System.out.println(values);
		}
		
		ArrayList<Boolean> booleanArrayList=new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
	}

}
