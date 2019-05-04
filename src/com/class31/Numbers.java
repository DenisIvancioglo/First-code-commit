package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> num=new ArrayList<>();

for(int i=0; i<=50; i+=2) {
	num.add(i);
}


Iterator<Integer> n=num.iterator();

while(n.hasNext()) {
	if(n.next()%5==0) {
		n.remove();
	}
}
System.out.println(num);
	}

}
