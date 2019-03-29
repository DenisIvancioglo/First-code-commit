package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Syntax";
		int lengthofString=str.length();
		System.out.println(lengthofString);
		
		
		
		String str1="Syntax Technologies";
		int lengthof2String=str1.length();
		System.out.println(lengthof2String);
		
		String str2="YMoldova Champion";
		System.out.println(str2.length());

		
		
		String str3="Hello";
System.out.println(str3.toUpperCase());//upper case


System.out.println(str3.toLowerCase());//lower case
// equals ignore case- compares strings but ignores case
String str4="Hello";
String str5="Hello";
boolean equality=str5.contentEquals(str5);
System.out.println(equality);

String expectedBrowser="Chrome";
String actualBrowser="chrome";
boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
System.out.println(equals);
	}

}
