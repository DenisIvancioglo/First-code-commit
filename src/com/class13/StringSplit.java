package com.class13;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome Syntax Students Batch 4";
String[] array=str.split("S");
System.out.println(array.length);
for(int i=0; i<array.length; i++) {
	System.out.println(array[i]);
}
for(String sub:array) {
	System.out.println(sub);
}
	}

}
