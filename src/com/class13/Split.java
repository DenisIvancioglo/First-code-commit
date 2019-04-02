package com.class13;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I love java";
String[] array=str.split(" ");
for(String s:array) {
	System.out.println(s);
}
System.out.println(str.replace(" ",""));
	


String str1="I12$$%$%$#love";
	String rep=str1.replaceAll("[0-9A-Za-z]",""); 
	System.out.println(rep.length());
	
	
	String a="Is it saturday?Is it raining?Do we have a java class today";
	String[] array1=a.split("\\?");
	
	System.out.println(array1.length);
	
	
	}
	
	

}
