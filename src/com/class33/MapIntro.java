package com.class33;


import java.util.*;

public class MapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Key, Value>
Map<Integer, String>map=new HashMap<>();
map.put(101, "John");
map.put(102, "Jane");
map.put(103, "Kate");
map.put(104, "James");
System.out.println(map.get(101));
//how to uptade

map.replace(103, "Sikander");
System.out.println(map.get(103));
//how to remove

map.remove(104);
System.out.println(map.size());
System.out.println(map.isEmpty());

System.out.println(map);

//to check is specific key/value is there

System.out.println(map.containsKey(102));
System.out.println(map.containsValue("Sikander"));

map.put(105,"Shaban");
System.out.println(map);
map.put(101, "Jane");
System.out.println(map);
map.put(null, "Something");
System.out.println(map);
map.put(null,null);
System.out.println(map);
	}

}
