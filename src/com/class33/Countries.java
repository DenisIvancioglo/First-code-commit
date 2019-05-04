package com.class33;

import java.util.*;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String>count=new HashMap<>();
count.putIfAbsent("Moldova", "Kishinev");
count.putIfAbsent("Kyrgyzstan", "Bishkek");
count.putIfAbsent("Kazakhstan", "Nur-sultan");
count.putIfAbsent("Usa", "DC");
for(String i: count.keySet()) {
	System.out.println(i+" values: "+ count.get(i));
}
Set<String>it=count.keySet();
Iterator<String>ite=it.iterator();
while(ite.hasNext()) {
	String val=ite.next();
	System.out.println(val+" values "+count.get(val));
}
for(String c:count.values()) {
	System.out.println(c);
}

Collection<String>col=count.values();
Iterator<String>iter=col.iterator();
while(iter.hasNext()) {
	System.out.println(iter.next());
}

	}

}
