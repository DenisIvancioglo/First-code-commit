package com.class32;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> city=new HashSet<String>();
city.add("Moscow");
city.add("Chishinev");
city.add("Leningrad");
city.add("Los-Angeles");

city.add("Leningrad");
city.add("Los-Angeles");
ArrayList<String> list = new ArrayList<String>(city); 
Collections.sort(list); 



for(String c:city) {
	System.out.println(c);
}

Iterator<String>it=city.iterator();
while(it.hasNext()) {
	String cit=it.next();
	System.out.println(cit);
}
	}

}
