package com.class31;
import java.util.Iterator;
import java.util.ArrayList;

public class Recap {

	private static final String Iterator = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> cars=new ArrayList<>();
cars.add("BMW");
cars.add("Toyota");
cars.add("Seat");
cars.add("KIA");

for(int i=0; i<cars.size(); i++) {
	System.out.println(cars.get(i));
}
for(Object n: cars) {
	System.out.println(n);
}
Iterator<String> it= cars.iterator();

while(it.hasNext()) {
	
	System.out.println(it.next());
	
}
int c=0;
while(cars.size()>c) {
	System.out.println(cars.get(c));
	c++;
}
	}

}
