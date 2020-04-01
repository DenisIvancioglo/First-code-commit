package com.reviewall;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String pal="anagram";
String reverse="";

char[] arr=pal.toCharArray();

for(int i=arr.length-1; i>=0; i--) {
	reverse=reverse+arr[i];
	
}
System.out.println(pal);
System.out.println(reverse);
	}

}
