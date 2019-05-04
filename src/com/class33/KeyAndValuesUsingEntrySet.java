package com.class33;

import java.util.*;

public class KeyAndValuesUsingEntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String>userDetailsMap=new TreeMap<>();
userDetailsMap.put("Name", "Alex Smith");
userDetailsMap.put("Salary", "90000");
userDetailsMap.put("Department", " IT");
userDetailsMap.put("Name", " Automation Tester");

System.out.println(userDetailsMap);
userDetailsMap.entrySet();// returns a set of entries

for(Map.Entry<String,String> entry:userDetailsMap.entrySet()) {
	entry.getKey();
	entry.getValue();
	System.out.println(entry.getKey()+" : "+entry.getValue());
}
Iterator<Map.Entry<String,String>>it=userDetailsMap.entrySet().iterator();
while(it.hasNext()) {
	Map.Entry entry=it.next();
	System.out.println(entry.getKey()+":"+entry.getValue());
}
	}

}
