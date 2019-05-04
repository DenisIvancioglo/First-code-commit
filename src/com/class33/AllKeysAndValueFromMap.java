package com.class33;

import java.util.*;

public class AllKeysAndValueFromMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> map=new HashMap<>();
map.put(1,"A");
map.put(2,"AA");
map.put(3,"B");
map.put(3,"C");
map.put(4,"D");

System.out.println(map);

//returns a Set of keys from the map
Collection<Integer>keys=map.keySet();
System.out.println("Using for each loop-----");
for(Integer key:keys) {
	System.out.print(key);
}
System.out.println();
System.out.println("Using Iterator----");
Iterator<Integer>keysIt=keys.iterator();
while(keysIt.hasNext()) {
	System.out.print(keysIt.next());
}
//How to get all values

Collection<String>valCol=map.values();
System.out.println("Using for each loop");
for(String value:valCol) {
	System.out.print(value+" ");
}
Iterator<String> itValues=valCol.iterator();
while(itValues.hasNext()) {
	System.out.println(itValues.next());
}
	}

}
