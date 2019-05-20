package com.class34;

import java.util.*;

public class TestPersom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,Person> perMap=new HashMap<>();
perMap.put(123, new Person("Denis","Ivancioglo",22,3221));
perMap.put(456, new Person("Anar","Yusifov",38,100000));
//Collection<Person>getVal=perMap.values();
for(Person detail: perMap.values()) {
	detail.prinDet();
	
}
	}

}
