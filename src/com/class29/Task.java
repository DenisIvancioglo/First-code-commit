package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generic Array that stores only String Object
ArrayList<String> names=new ArrayList<String>();
names.add("Denis");
names.add("Ali");
names.add("Anar");
names.add("Sanea");
names.add("Nastia");
System.out.println(names.isEmpty());
System.out.println(names.contains("Denis"));
System.out.println(names.size());
System.out.println("---1 way--");
for(String n: names) {
	System.out.println(n);
}
// 2 way using advance for loop
System.out.println("---2 way--");
for(Object name:names) {
	System.out.println(name);
}
System.out.println("---3 way--");
Iterator<String> it=names.iterator();
//boolean check=it.hasNext();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
