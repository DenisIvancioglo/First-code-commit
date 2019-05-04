package com.class33;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RetriveOneValueFromSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> cars=new LinkedHashSet<>();
cars.add("BMW");
cars.add("Toyota");
cars.add("Ford");

//1 way we convert to the ArrayList
//1 way to add collection into ArryList 
List <String>list=new ArrayList<>(cars);
System.out.println("List collection"+list);
//b
List<String> list2=new ArrayList<>();
list2.addAll(cars);
System.out.println("List2 collection"+list2);
//2 way convert to Array
Object[] array=cars.toArray();
System.out.println(array[1]);
	}

}
