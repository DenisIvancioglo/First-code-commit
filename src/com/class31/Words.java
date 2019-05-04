package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> w=new ArrayList<>();
w.add("rete");
w.add("fete");
w.add("Denis");
w.add("Er");
Iterator<String> it= w.iterator();
while(it.hasNext()) {
	if(it.next().endsWith("e")) {
		it.remove();
	}
}
System.out.println(w);
	}

}
