package com.class12;

public class StringManipulations3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Students";
		char character=str.charAt(7);
		System.out.println(character);
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}System.out.println();
		String str1="Sunday";
		
		//indexof()-returns an index of specified character 
		int index=str1.indexOf("n");
		System.out.println(index);

		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));
		System.out.println(str2.indexOf("Technologies"));
		
		String str3="Today is Sunday Java class";
		String newString=str3.substring(5);
		System.out.println(newString);
		String startandend=str3.substring(1,4);
		System.out.println(startandend);
	}

}
