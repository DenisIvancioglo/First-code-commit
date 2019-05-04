package com.class32;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> hset=new HashSet<Integer>();
hset.add(12);
hset.add(32);
hset.add(34);
System.out.println(hset.size());
//SET doesn't keep the order
System.out.println(hset);
System.out.println(hset.contains(32));
// SET does not allow duplicates
hset.add(12);
System.out.println(hset.size());
//to retrieve all values from hashset

System.out.println("Using advanced for loop");
for(int num:hset) {
	System.out.println(num);
	
}
//hset.removeAll(hset);
System.out.println("---using iterator---");
Iterator <Integer> iterator=hset.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
	
}


	}

}
