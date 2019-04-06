package com.class17;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome obj=new Palindrome();
		obj.Pal("civic");
		
	}
void Pal(String word) {
	String reverse="";
	for(int i=word.length()-1; i>=0; i--) {
		reverse=reverse+word.charAt(i);
	}
	if(word.equalsIgnoreCase(reverse)) {
		System.out.println(word+" is palindrome");
	}else {
		System.out.println(word+" is not palindrome");
	}
}
}
