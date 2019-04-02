package com.class13;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String original="Today is Java class";
String reverse="";
char[] array=original.toCharArray();
for(int i=array.length-1; i>=0;i--) {
	reverse=reverse+array[i];
}
System.out.println(reverse);
String reverse1="";
for(int i=original.length()-1; i>=0; i--) {
	reverse1=reverse1+original.charAt(i);
}
System.out.println(reverse1);


String reverse2="";
for(int i=original.length()-1; i>=0; i--) {
	reverse2=reverse2+original.substring(i,i+1);
}
System.out.println(reverse2);
	}

}
