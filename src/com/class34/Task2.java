package com.class34;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> emp=new HashMap<>();
emp.put("Denis", 100000);
emp.put("Anar", 34000);
emp.put("Alijon", 12000);

int maxSalary=0;
String key=null;

for(Map.Entry<String, Integer>entry:emp.entrySet()) {
	if(entry.getValue()>maxSalary) {
		maxSalary=entry.getValue();
		key=entry.getKey();
		
	}
}
System.out.println(key+":"+maxSalary);

	}

}
