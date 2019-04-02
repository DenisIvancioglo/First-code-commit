package com.reviewall;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="Hello world Hi";
String reverse="";
char[] array=word.toCharArray();
for(int i=array.length-1; i>=0; i--) {
	reverse=reverse+array[i];
	
}System.out.println(reverse+" ");

String[] a=reverse.split(" ");
for(int c=a.length-1; c>=0; c--) {
	System.out.print(a[c]+ " ");
}

	}

}
