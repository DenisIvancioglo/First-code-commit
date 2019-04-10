package com.class20;

public class Task1 {

	String reverse(String name) {
		String rev="";
		for(int i=name.length()-1; i>=0;  i--) {
			rev=rev+name.charAt(i);
			
		}
		return rev;
	}
	
public boolean pal(String name) {
	String rev="";
	for(int i=name.length()-1; i>=0;  i--) {
		rev=rev+name.charAt(i);
		
	}
	if(name.equalsIgnoreCase(rev)) {
		return true;
	}
	return true;
}
}
