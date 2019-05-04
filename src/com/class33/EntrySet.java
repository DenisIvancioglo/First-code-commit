package com.class33;

import java.util.*;
import java.util.Map.Entry;

public class EntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer>classroomMap=new LinkedHashMap<>();
classroomMap.putIfAbsent("Table", 20);
classroomMap.putIfAbsent("Chair", 30);
classroomMap.putIfAbsent("Screen", 3);
classroomMap.putIfAbsent("Student", 60);
System.out.println(classroomMap);

for( Map.Entry entry:classroomMap.entrySet()) {
	System.out.println(entry.getKey()+" : "+entry.getValue());
}
Iterator<Map.Entry<String, Integer>>classRoomInteractor= classroomMap.entrySet().iterator();
while(classRoomInteractor.hasNext()) {
	System.out.println(classRoomInteractor.next().getKey()+": "+classRoomInteractor.next().getValue());
}

	}

}
