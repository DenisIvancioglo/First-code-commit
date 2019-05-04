package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> dr=new ArrayList<>();
dr.add("Coke");
dr.add("Pepsi");
dr.add("Dr Pepper");
dr.add("Cola");



for(int i=0; i<dr.size(); i++) {
	if(dr.get(i).contains("e") || dr.get(i).contains("a")) {
		dr.set(i, "water");
		
	}
}
System.out.println(dr);


	}

}
