package com.class13;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I am  good tester";
String newStr=str.replace("a", "e");
System.out.println(newStr);

String newStr1=str.replace("good", "great");
System.out.println(newStr1);
String newStr2=str.replace("tester", "programmer");
System.out.println(newStr);
	//ReplaceAll
	String str1="12Hello 2342 World 465%%";
	String replaced=str1.replaceAll("[0-9]","");
	System.out.println(replaced);
	
	
	String newString=replaced.replaceAll("[^A-Z a-z]", "");
	System.out.println(newString);
	
	
	//String repChar=replaced.replaceAll("[A-Z a-z]", "");
	//System.out.println(repChar);
	
	String str2="1Hello123";
	System.out.println(str.replaceAll("[^0-9]", ""));
	
	}

}
