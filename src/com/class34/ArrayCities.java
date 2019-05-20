package com.class34;

import java.util.*;

public class ArrayCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []city= {"Paris","Moscow","Istanbul","Kishinev"};

Map<String,Integer> cit=new TreeMap<>();

for(String name:city) {
	
cit.put(name, name.length());

	}
System.out.println(cit);
Iterator<Map.Entry<String,Integer>>it=cit.entrySet().iterator();
while(it.hasNext()) {
	if(it.next().getValue()>7) {
		it.remove();
		
	}
}
System.out.println(cit);



	}

}
