package com.class33;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOverview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> classDays=new HashSet<>();
classDays.add("Tuesday");
classDays.add("Thursday");
classDays.add("Friday");
classDays.add("Saturday");
System.out.println(classDays);

System.out.println("-----------");
for(String days: classDays) {
	System.out.println(days);
}
System.out.println("-----------");
Iterator<String>it=classDays.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

	}

}
