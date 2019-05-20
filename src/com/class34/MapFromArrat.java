package com.class34;

import java.util.*;

public class MapFromArrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] names={"Mehmet","Asha","Amina","Omar","Siyar","Danny"};
Map<Integer,String> nameMap=new LinkedHashMap<>();
int key=1;
for(String name:names) {
	nameMap.put(key, name);
	key++;
}
System.out.println(nameMap);
//print key amd values using entrySet

for(Map.Entry<Integer,String> entry:nameMap.entrySet()) {
	System.out.println(entry.getKey()+": "+entry.getValue());
}

Iterator<Map.Entry<Integer, String>>it=nameMap.entrySet().iterator();
while(it.hasNext()) {
	System.out.println(it.next().getKey()+": "+it.next().getValue());
	
}
 	}

}
