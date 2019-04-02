package com.reviewall;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner (System.in);
System.out.println("Please enter any word to check if it a palindrome");
String word=input.nextLine();

String reverse="";
for(int i=word.length()-1; i>=0; i--) {
	reverse=reverse+word.charAt(i);
}
if(word.equalsIgnoreCase(reverse)) {
	System.out.println("This is a palindrome");
}else {
	System.out.println("It is not palindrome");
}

	}

}
